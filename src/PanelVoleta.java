import java.awt.*;
import javax.swing.*;

public class PanelVoleta extends JPanel{
    private GroupLayout gl;
    static String origen, destino, tipoBus;
    private JLabel origenLabel, destinoLabel, tipoAsientoLabel;

    public PanelVoleta(){
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setBackground(new java.awt.Color(180, 192, 241));
        origenLabel = new JLabel("Origen: " + origen);
        origenLabel.setFont(new Font("Arial", Font.BOLD, 16));
        destinoLabel = new JLabel("Destino: " + destino);
        destinoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        tipoAsientoLabel = new JLabel("Tipo de Asiento: (al seleccionar)" );
        tipoAsientoLabel.setFont(new Font("Arial", Font.BOLD, 16));
    }

    private void setupLayout() {
        gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(origenLabel)
                .addComponent(destinoLabel)
                .addComponent(tipoAsientoLabel)
            )
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addComponent(origenLabel)
            .addGap(5)
            .addComponent(destinoLabel)
            .addGap(5)
            .addComponent(tipoAsientoLabel)
            .addContainerGap(20, 20)
        );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}