package proyecto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * PanelBoleta nos indica en la segunda ventana exactamente qué pasaje estamos comprando, mostrando la fecha de salida, el origen, el destino y el tipo de asiento que se va a comprar.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @param gl es el objeto GroupLayout que nos deja personalizar la distribución de objetos en la ventana
 */

public class PanelBoleta extends JPanel{
    private GroupLayout gl;
    static String origen, destino, tipoBus, dia, mes, hora;
    private JLabel origenLabel, destinoLabel, tipoAsientoLabel, horarioLabel;
    public JButton comprar;

    /**
     * el método constructor de PanelBoleta inicializa los componentes y su distribución.
     */
    public PanelBoleta(){
        initComponent();
        setupLayout();
    }


    /**
     * El método initComponent añade el texto en pantalla de toda la información del asiento comprado.
     */
    private void initComponent() {
        this.setBackground(new java.awt.Color(180, 192, 241));
        horarioLabel = new JLabel("Salida: " + dia + " de " + mes + " a las  " +  hora);
        horarioLabel.setFont(new Font("Arial", Font.BOLD, 13));
        origenLabel = new JLabel("Origen: " + origen);
        origenLabel.setFont(new Font("Arial", Font.BOLD, 13));
        destinoLabel = new JLabel("Destino: " + destino);
        destinoLabel.setFont(new Font("Arial", Font.BOLD, 13));
        tipoAsientoLabel = new JLabel("Tipo de Asiento: (al seleccionar)" );
        tipoAsientoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        comprar = new JButton("Comprar");
        comprar.setFocusable(false);
    }


    /**
     * El método setupLayout organiza bien la disposición de los componentes del panel.
     */
    private void setupLayout() {
        gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(horarioLabel)
                .addComponent(origenLabel)
                .addComponent(destinoLabel)
                .addComponent(tipoAsientoLabel)
                .addComponent(comprar)
            )
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addComponent(horarioLabel)
            .addGap(3)
            .addComponent(origenLabel)
            .addGap(3)
            .addComponent(destinoLabel)
            .addGap(15)
            .addComponent(tipoAsientoLabel)
            .addGap(230)
            .addComponent(comprar)
            .addContainerGap(20, 20)
        );
        comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Compra realizada con éxito");

            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}