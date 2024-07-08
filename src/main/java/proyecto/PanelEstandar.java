package proyecto;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 * PanelEstandar es el panel que tiene todos los asientos del autobús, en el
 * caso de que este sea de un sólo piso (un bus estándar).
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @param gl       es el objeto GroupLayout que nos deja personalizar la
 *                 distribución de objetos en la ventana
 * 
 * @param asientos es una lista de botones la cual representa todos los asientos
 *                 del piso.
 */
public class PanelEstandar extends JPanel { 
    private GroupLayout gl; 
    AsientoEjecutivo[] asientos;

    public PanelEstandar() {
        initComponent();
        setupLayout();
    }

    /**
     * Añade el fondo del panel y los botones que representan a cada asiento.
     */
    private void initComponent() {
        this.setBackground(new Color(217, 224, 26));
        asientos = new AsientoEjecutivo[40];

        for (int i = 0; i < 40; i++) {
            asientos[i] = new AsientoEjecutivo(i+1);
            asientos[i].setFocusable(false);
        }
    }

    /**
     * Configura la posición de cada asiento dentro de la pantalla, esto según su
     * grupo horizontal y vertical.
     */
    private void setupLayout() {
        gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addContainerGap(20, 20)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(asientos[0], 60, 60, 60)
                        .addComponent(asientos[4], 60, 60, 60)
                        .addComponent(asientos[8], 60, 60, 60)
                        .addComponent(asientos[12], 60, 60, 60)
                        .addComponent(asientos[16], 60, 60, 60)
                        .addComponent(asientos[20], 60, 60, 60)
                        .addComponent(asientos[24], 60, 60, 60)
                        .addComponent(asientos[28], 60, 60, 60)
                        .addComponent(asientos[32], 60, 60, 60)
                        .addComponent(asientos[36], 60, 60, 60))
                .addGap(5)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(asientos[1], 60, 60, 60)
                        .addComponent(asientos[5], 60, 60, 60)
                        .addComponent(asientos[9], 60, 60, 60)
                        .addComponent(asientos[13], 60, 60, 60)
                        .addComponent(asientos[17], 60, 60, 60)
                        .addComponent(asientos[21], 60, 60, 60)
                        .addComponent(asientos[25], 60, 60, 60)
                        .addComponent(asientos[29], 60, 60, 60)
                        .addComponent(asientos[33], 60, 60, 60)
                        .addComponent(asientos[37], 60, 60, 60))
                .addGap(20)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(asientos[2], 60, 60, 60)
                        .addComponent(asientos[6], 60, 60, 60)
                        .addComponent(asientos[10], 60, 60, 60)
                        .addComponent(asientos[14], 60, 60, 60)
                        .addComponent(asientos[18], 60, 60, 60)
                        .addComponent(asientos[22], 60, 60, 60)
                        .addComponent(asientos[26], 60, 60, 60)
                        .addComponent(asientos[30], 60, 60, 60)
                        .addComponent(asientos[34], 60, 60, 60)
                        .addComponent(asientos[38], 60, 60, 60))
                .addGap(5)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(asientos[3], 60, 60, 60)
                        .addComponent(asientos[7], 60, 60, 60)
                        .addComponent(asientos[11], 60, 60, 60)
                        .addComponent(asientos[15], 60, 60, 60)
                        .addComponent(asientos[19], 60, 60, 60)
                        .addComponent(asientos[23], 60, 60, 60)
                        .addComponent(asientos[27], 60, 60, 60)
                        .addComponent(asientos[31], 60, 60, 60)
                        .addComponent(asientos[35], 60, 60, 60)
                        .addComponent(asientos[39], 60, 60, 60))
                .addContainerGap(20, 20));

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addContainerGap(20, 20)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[0], 30, 30, 30)
                        .addComponent(asientos[1], 30, 30, 30)
                        .addComponent(asientos[2], 30, 30, 30)
                        .addComponent(asientos[3], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[4], 30, 30, 30)
                        .addComponent(asientos[5], 30, 30, 30)
                        .addComponent(asientos[6], 30, 30, 30)
                        .addComponent(asientos[7], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[8], 30, 30, 30)
                        .addComponent(asientos[9], 30, 30, 30)
                        .addComponent(asientos[10], 30, 30, 30)
                        .addComponent(asientos[11], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[12], 30, 30, 30)
                        .addComponent(asientos[13], 30, 30, 30)
                        .addComponent(asientos[14], 30, 30, 30)
                        .addComponent(asientos[15], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[16], 30, 30, 30)
                        .addComponent(asientos[17], 30, 30, 30)
                        .addComponent(asientos[18], 30, 30, 30)
                        .addComponent(asientos[19], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[20], 30, 30, 30)
                        .addComponent(asientos[21], 30, 30, 30)
                        .addComponent(asientos[22], 30, 30, 30)
                        .addComponent(asientos[23], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[24], 30, 30, 30)
                        .addComponent(asientos[25], 30, 30, 30)
                        .addComponent(asientos[26], 30, 30, 30)
                        .addComponent(asientos[27], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[28], 30, 30, 30)
                        .addComponent(asientos[29], 30, 30, 30)
                        .addComponent(asientos[30], 30, 30, 30)
                        .addComponent(asientos[31], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[32], 30, 30, 30)
                        .addComponent(asientos[33], 30, 30, 30)
                        .addComponent(asientos[34], 30, 30, 30)
                        .addComponent(asientos[35], 30, 30, 30))
                .addGap(10)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(asientos[36], 30, 30, 30)
                        .addComponent(asientos[37], 30, 30, 30)
                        .addComponent(asientos[38], 30, 30, 30)
                        .addComponent(asientos[39], 30, 30, 30))
                .addContainerGap(20, 20));
    }
}