package proyecto;

import java.awt.*;
import javax.swing.*;

public class PanelSegundo extends JPanel {
    private TPaneAsientos panelAsientos;
    public PanelVoleta panelVoleta;
    public JButton volver;

    public PanelSegundo() {
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setBackground(new Color(242, 150, 26)); 
        panelAsientos = new TPaneAsientos();  
        panelVoleta = new PanelVoleta();  
        volver = new JButton("Volver");    
    }

    private void setupLayout() {
        GroupLayout gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addComponent(panelAsientos, 300, 300, 300)
            .addGap(15)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(panelVoleta, 200, 240, 300)
                .addGroup(gl.createSequentialGroup()
                .addComponent(volver)
                .addGap(10)
                )
            )
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addGroup(gl.createSequentialGroup()
                    .addGap(20)
                    .addComponent(volver)
                    .addGap(15)
                    .addComponent(panelVoleta, 300, 400, 500))
                .addComponent(panelAsientos)
                .addGap(30)
            )
            .addContainerGap(0, 30)
        );
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}