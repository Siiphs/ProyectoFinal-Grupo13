package proyecto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * PanelPrimerPisoDP es el panel donde se muestran todos los asientos del primer
 * piso, en caso de que el autobús sea doble.
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

public class PanelPrimerPisoDP extends JPanel {
    private GroupLayout gl;
    AsientoCama[] asientos;

    public PanelPrimerPisoDP() {
        initComponent();
        setupLayout();
    }

    /**
     * Añade el fondo del panel y los botones que representan a cada asiento.
     */
    private void initComponent() {
        this.setBackground(new Color(26, 224, 217));
        asientos = new AsientoCama[20];
        for (int i = 0; i < 20; i++) {
            int indice = i + 41;
            asientos[i] = new AsientoCama(i + 41);
            asientos[i].setFocusable(false);
            
            asientos[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Asiento cama: " + indice);
                }
            });
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
            )
            .addGap(5)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[1], 60, 60, 60)
                .addComponent(asientos[5], 60, 60, 60)
                .addComponent(asientos[9], 60, 60, 60)
                .addComponent(asientos[13], 60, 60, 60)
                .addComponent(asientos[17], 60, 60, 60)
            )
            .addGap(20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[2], 60, 60, 60)
                .addComponent(asientos[6], 60, 60, 60)
                .addComponent(asientos[10], 60, 60, 60)
                .addComponent(asientos[14], 60, 60, 60)
                .addComponent(asientos[18], 60, 60, 60)
            )
            .addGap(5)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[3], 60, 60, 60)
                .addComponent(asientos[7], 60, 60, 60)
                .addComponent(asientos[11], 60, 60, 60)
                .addComponent(asientos[15], 60, 60, 60)
                .addComponent(asientos[19], 60, 60, 60)
            )
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[0], 30, 30, 30)
                .addComponent(asientos[1], 30, 30, 30)
                .addComponent(asientos[2], 30, 30, 30)
                .addComponent(asientos[3], 30, 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[4], 30, 30, 30)
                .addComponent(asientos[5], 30, 30, 30)
                .addComponent(asientos[6], 30, 30, 30)
                .addComponent(asientos[7], 30, 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[8], 30, 30, 30)
                .addComponent(asientos[9], 30, 30, 30)
                .addComponent(asientos[10], 30, 30, 30)
                .addComponent(asientos[11], 30, 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[12], 30, 30, 30)
                .addComponent(asientos[13], 30, 30, 30)
                .addComponent(asientos[14], 30, 30, 30)
                .addComponent(asientos[15], 30, 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[16], 30, 30, 30)
                .addComponent(asientos[17], 30, 30, 30)
                .addComponent(asientos[18], 30, 30, 30)
                .addComponent(asientos[19], 30, 30, 30)
            )
            .addContainerGap(20, 20)
        );
    }
}