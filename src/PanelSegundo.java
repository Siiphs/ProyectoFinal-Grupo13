import java.awt.*;
import javax.swing.*;

public class PanelSegundo extends JPanel {
    private PanelAsientos panelAsientos;
    private PanelVoleta panelVoleta;
    public JButton volver;

    public PanelSegundo() {
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setBackground(new Color(242, 150, 26)); 
        panelAsientos = new PanelAsientos();
        panelVoleta = new PanelVoleta();  
        volver = new JButton("Volver");      
    }

    private void setupLayout() {
        GroupLayout gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addComponent(panelAsientos)
            .addGap(15)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(panelVoleta)
                .addComponent(volver))
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addGroup(gl.createSequentialGroup()
                    .addComponent(volver)
                    .addGap(15)
                    .addComponent(panelVoleta))
                .addComponent(panelAsientos)
            )
            .addContainerGap(20, 20)
        );
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}