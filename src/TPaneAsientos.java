import java.awt.*;
import javax.swing.*;

public class TPaneAsientos extends JTabbedPane {
    private PanelPrimerPisoMixto primerPisoMixto;
    private PanelSegundoPisoMixto segundoPisoMixto;
    private PanelEjecutivo ejecutivo;
    private PanelCama cama;
    private PanelSemiCama semiCama;
    

    public TPaneAsientos() {
        initComponent();
    }

    private void initComponent() {
        primerPisoMixto = new PanelPrimerPisoMixto();
        segundoPisoMixto = new PanelSegundoPisoMixto();
        ejecutivo = new PanelEjecutivo();
        cama = new PanelCama();
        semiCama = new PanelSemiCama();

        switch (PanelVoleta.tipoBus) {
            case "Ejecutivo" -> this.addTab("Ejecutivo", ejecutivo);
            case "Cama" -> this.addTab("Cama", cama);
            case "Semi-Cama" -> this.addTab("Semi-Cama", semiCama);
            case "Mixto" -> {
                this.addTab("Primer Piso Cama", primerPisoMixto);
                this.addTab("Segundo Piso Semi-Cama", segundoPisoMixto);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}