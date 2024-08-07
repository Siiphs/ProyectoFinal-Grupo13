package proyecto;

import java.awt.*;
import javax.swing.*;

/**
 * PanelSegundo es el segundo panel del programa, en este el cliente puede
 * elegir los asientos de el o los pasajes que vaya a comprar.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * 
 * @param panelAsientos es el panel que contiene los JButton de cada asiento que
 *                      el cliente puede comprar.
 * 
 * @param panelBoleta   es el panel mostrado en la ventana que le da
 *                      confirmación al cliente del pasaje que va a comprar.
 * 
 * @param volver        es el botón que vuelve al primer panel, dándonos la
 *                      opción de elegir otro bus.
 * 
 */

public class PanelSegundo extends JPanel {
    private TPaneAsientos panelAsientos;
    public PanelBoleta panelBoleta;
    public JButton volver;

    public PanelSegundo() {
        initComponent();
        setupLayout();
    }

    /**
     * Añade las características del panel para elegir el pasaje, y le agrega sus
     * componentes correspondientes.
     */
    private void initComponent() {
        this.setBackground(new Color(242, 150, 26)); 
        panelAsientos = new TPaneAsientos();  
        panelBoleta = new PanelBoleta();  
        volver = new JButton("Volver");    
    }

    private void setupLayout() {
        GroupLayout gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addContainerGap(20, 20)
                .addComponent(panelAsientos, 300, 300, 300)
                .addGap(15)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(panelBoleta, 200, 240, 300)
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(volver)
                                .addGap(10)))
                .addContainerGap(20, 20));

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addContainerGap(20, 20)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addGroup(gl.createSequentialGroup()
                                .addGap(20)
                                .addComponent(volver)
                                .addGap(15)
                                .addComponent(panelBoleta, 300, 400, 500))
                        .addComponent(panelAsientos)
                        .addGap(30))
                .addContainerGap(0, 30));
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}