package proyecto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * La ventana es el JFrame principal con el cual el usuario interactúa.
 * 
 * @author Joseph Matamala, Felipe Sepúlveda
 * @since 10 de junio de 2024
 * 
 * @param panelPrimero el panel en el que son colocados el resto de componentes
 *                     iniciales, aquí es donde el usuario puede seleccionar el
 *                     tipo de bus, su destino y fecha del pasaje.
 * 
 * @param panelSegundo el panel en el que el cliente puede elegir los asientos
 *                     que va a comprar
 * 
 * @param panelCl      es un JPanel que contiene el layout de la ventana
 *                     principal, junto a los cuadros principales (los dos que
 *                     hay) del programa.
 * 
 * @see PanelPrimero
 */

public class Ventana extends JFrame {
    public static CardLayout cl;
    public static JPanel panelCl;
    private PanelPrimero panelPrimero;
    private PanelSegundo panelSegundo;

    public Ventana() {
        initComponent();
        setupLayout();

        panelPrimero.continuar.addActionListener(new ActionListener() {
            /**
             * El programa valida si el pasaje que se va a comprar es válido, indicando un
             * error en caso contrario.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Integer.valueOf(panelPrimero.jDia.getSelectedItem().toString()) >= 30
                        && panelPrimero.jMes.getSelectedItem().toString() == "Febrero")
                        || (Integer.valueOf(panelPrimero.jDia.getSelectedItem().toString()) == 31
                                && (panelPrimero.jMes.getSelectedItem().toString() == "Abril"
                                        || panelPrimero.jMes.getSelectedItem().toString() == "Junio"
                                        || panelPrimero.jMes.getSelectedItem().toString() == "Septiembre"
                                        || panelPrimero.jMes.getSelectedItem().toString() == "Noviembre"))) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresa una fecha válida");
                } else if (panelPrimero.jOrigen.getSelectedItem() == panelPrimero.jDestino.getSelectedItem()) {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona un destino distinto de tu origen");
                }
                else{
                    PanelBoleta.dia = panelPrimero.jDia.getSelectedItem().toString();
                    PanelBoleta.mes = panelPrimero.jMes.getSelectedItem().toString();
                    PanelBoleta.hora = panelPrimero.jHora.getSelectedItem().toString();
                    PanelBoleta.origen = panelPrimero.jOrigen.getSelectedItem().toString();
                    PanelBoleta.destino = panelPrimero.jDestino.getSelectedItem().toString();
                    PanelBoleta.tipoBus = panelPrimero.jTipoBus.getSelectedItem().toString();
                    panelSegundo = new PanelSegundo();
                    panelCl.add(panelSegundo, "O_o");
                    cl.show(panelCl, "O_o");

                    panelSegundo.volver.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Asiento.ids.clear();
                            Asiento.precio = 0;
                            cl.show(panelCl, ">_<");
                        }
                    });
                }

            }
        });
    }

    /**
     * El método initComponents configura todas las características iniciales más
     * básicas de la ventana, tales como el título, sus botones y su tamaño.
     * 
     */
    private void initComponent() {
        /**
         * Asigna el tamaño, las funciones de los botones superiores (para poder
         * cerrarla) y el título de la ventana.
         */
        this.setSize(670, 530);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Touhou Bus");

        panelCl = new JPanel();
        panelPrimero = new PanelPrimero();

        this.add(panelCl);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void setupLayout() {
        cl = new CardLayout();
        panelCl.setLayout(cl);

        panelCl.add(panelPrimero, ">_<");
        cl.show(panelCl, ">_<");
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}