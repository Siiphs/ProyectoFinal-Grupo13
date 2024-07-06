package proyecto;
import java.awt.*;
import javax.swing.*;

public class PanelEjecutivo extends JPanel { 
    private GroupLayout gl; 
    JToggleButton[] asientos;

    public PanelEjecutivo() {
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setBackground(new Color(217, 224, 26));
        asientos = new JToggleButton[40];

        for (int i = 0; i < 40; i++) {
            asientos[i] = new JToggleButton("A" + (i+1));
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
                .addComponent(asientos[20], 60, 60, 60)
                .addComponent(asientos[24], 60, 60, 60)
                .addComponent(asientos[28], 60, 60, 60)
                .addComponent(asientos[32], 60, 60, 60)
                .addComponent(asientos[36], 60, 60, 60)
            )
            .addGap(5)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[1], 60, 60, 60)
                .addComponent(asientos[5], 60, 60, 60)
                .addComponent(asientos[9], 60, 60, 60)
                .addComponent(asientos[13], 60, 60, 60)
                .addComponent(asientos[17], 60, 60, 60)
                .addComponent(asientos[21], 60, 60, 60)
                .addComponent(asientos[25], 60, 60, 60)
                .addComponent(asientos[29], 60, 60, 60)
                .addComponent(asientos[33], 60, 60, 60)
                .addComponent(asientos[37], 60, 60, 60)
            )
            .addGap(20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[2], 60, 60, 60)
                .addComponent(asientos[6], 60, 60, 60)
                .addComponent(asientos[10], 60, 60, 60)
                .addComponent(asientos[14], 60, 60, 60)
                .addComponent(asientos[18], 60, 60, 60)
                .addComponent(asientos[22], 60, 60, 60)
                .addComponent(asientos[26], 60, 60, 60)
                .addComponent(asientos[30], 60, 60, 60)
                .addComponent(asientos[34], 60, 60, 60)
                .addComponent(asientos[38], 60, 60, 60)
            )
            .addGap(5)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[3], 60, 60, 60)
                .addComponent(asientos[7], 60, 60, 60)
                .addComponent(asientos[11], 60, 60, 60)
                .addComponent(asientos[15], 60, 60, 60)
                .addComponent(asientos[19], 60, 60, 60)
                .addComponent(asientos[23], 60, 60, 60)
                .addComponent(asientos[27], 60, 60, 60)
                .addComponent(asientos[31], 60, 60, 60)
                .addComponent(asientos[35], 60, 60, 60)
                .addComponent(asientos[39], 60, 60, 60)
            )
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[0], 30 , 30, 30)
                .addComponent(asientos[1], 30 , 30, 30)
                .addComponent(asientos[2], 30 , 30, 30)
                .addComponent(asientos[3], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[4], 30 , 30, 30)
                .addComponent(asientos[5], 30 , 30, 30)
                .addComponent(asientos[6], 30 , 30, 30)
                .addComponent(asientos[7], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[8], 30 , 30, 30)
                .addComponent(asientos[9], 30 , 30, 30)
                .addComponent(asientos[10], 30 , 30, 30)
                .addComponent(asientos[11], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[12], 30 , 30, 30)
                .addComponent(asientos[13], 30 , 30, 30)
                .addComponent(asientos[14], 30 , 30, 30)
                .addComponent(asientos[15], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[16], 30 , 30, 30)
                .addComponent(asientos[17], 30 , 30, 30)
                .addComponent(asientos[18], 30 , 30, 30)
                .addComponent(asientos[19], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[20], 30 , 30, 30)
                .addComponent(asientos[21], 30 , 30, 30)
                .addComponent(asientos[22], 30 , 30, 30)
                .addComponent(asientos[23], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[24], 30 , 30, 30)
                .addComponent(asientos[25], 30 , 30, 30)
                .addComponent(asientos[26], 30 , 30, 30)
                .addComponent(asientos[27], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[28], 30 , 30, 30)
                .addComponent(asientos[29], 30 , 30, 30)
                .addComponent(asientos[30], 30 , 30, 30)
                .addComponent(asientos[31], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[32], 30 , 30, 30)
                .addComponent(asientos[33], 30 , 30, 30)
                .addComponent(asientos[34], 30 , 30, 30)
                .addComponent(asientos[35], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[36], 30 , 30, 30)
                .addComponent(asientos[37], 30 , 30, 30)
                .addComponent(asientos[38], 30 , 30, 30)
                .addComponent(asientos[39], 30 , 30, 30)
            )
            .addContainerGap(20, 20)
        );
    }
}