package proyecto;

import java.awt.*;
import javax.swing.*;

public class PanelSegundoPisoDP extends JPanel {
    private GroupLayout gl;
    JToggleButton[] asientos;

    public PanelSegundoPisoDP() {
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setBackground(new Color(26, 224, 217));
        asientos = new JToggleButton[20];
        for (int i = 0; i < 20; i++) {
            asientos[i] = new JToggleButton("A" + (i + 41));
            asientos[i].setFocusable(false);
        }
    }

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