package proyecto;
import java.awt.*;
import javax.swing.*;

public class TPaneAsientos extends JTabbedPane {
    private PanelSegundoPisoDP segundoPisoDP;
    private PanelPrimerPisoDP primerPisoDP;
    private PanelEstandar estandar;
    

    public TPaneAsientos() {
        initComponent();
    }

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