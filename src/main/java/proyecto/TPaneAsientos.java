package proyecto;

import java.awt.*;
import javax.swing.*;

/**
 * TPaneAsientos nos deja elegir entre más de una ventana, en este caso, entre
 * el primer o segundo piso del bus.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @param primerPisoDP  es la ventana del primer piso del autobús.
 * 
 * @param segundoPisoDP es la ventana del segundo piso del autobús.
 * 
 * @param estandar      nos indica si el autobús es de un sólo piso, en ese
 *                      caso, sólo hay una ventana y, por lo tanto, no se puede
 *                      tabular entre pisos.
 */

public class TPaneAsientos extends JTabbedPane {
    private PanelSegundoPisoDP segundoPisoDP;
    private PanelPrimerPisoDP primerPisoDP;
    private PanelEstandar estandar;

    public TPaneAsientos() {
        initComponent();
    }

    /**
     * El método initComponent inicializa los componentes del panel, viendo si el
     * bus es de uno o dos pisos, para adaptarse correctamente.
     */
    private void initComponent() {
        segundoPisoDP = new PanelSegundoPisoDP();
        primerPisoDP = new PanelPrimerPisoDP();
        estandar = new PanelEstandar();

        switch (PanelVoleta.tipoBus) {
            case "Estandar" -> this.addTab("Piso unico", estandar);
            case "Doble planta" -> {
                this.addTab("Primer Piso", primerPisoDP);
                this.addTab("Segundo Piso", segundoPisoDP);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}