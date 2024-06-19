import java.awt.*;
import javax.swing.*;

public class TPaneAsientos extends JTabbedPane {
    private PanelPrimerPiso primerPiso;
    private PanelSegundoPiso segundoPiso;
    

    public TPaneAsientos() {
        initComponent();
    }

    private void initComponent() {
        primerPiso = new PanelPrimerPiso();
        segundoPiso = new PanelSegundoPiso();

        switch (PanelVoleta.tipoBus) {
            case "Ejecutivo" -> this.addTab("Ejecutivo", segundoPiso);
            case "Cama" -> this.addTab("Cama", segundoPiso);
            case "Semi-Cama" -> this.addTab("Semi-Cama", segundoPiso);
            default -> {
                this.addTab("Primer Piso Cama", primerPiso);
                this.addTab("Segundo Piso Semi-Cama", segundoPiso);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}