import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    private JPanel panelPrincipal;
    private PanelAsientos panelAsientos;
    private PanelVoleta panelVoleta;

    public Ventana() {
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setSize(600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana");

        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new java.awt.Color(242, 150, 26)); 
        this.add(panelPrincipal);
        panelAsientos = new PanelAsientos();
        panelVoleta = new PanelVoleta();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    private void setupLayout() {
        GroupLayout gl = new GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addComponent(panelAsientos)
            .addGap(15)
            .addComponent(panelVoleta)
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(panelAsientos)
                .addComponent(panelVoleta)
            )
            .addContainerGap(20, 20)
        );
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}