import java.awt.*;
import javax.swing.*;

public class TPaneAsientos extends JTabbedPane {
    private JPanel primerPiso, segundoPiso;
    private GroupLayout gl1, gl2;
    JToggleButton[] asientos;
    

    public TPaneAsientos() {
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        primerPiso = new JPanel();
        segundoPiso = new JPanel();
        primerPiso.setBackground(new Color(26, 224, 217));   
        segundoPiso.setBackground(new Color(217, 224, 26));

        this.addTab("Primer Piso", primerPiso);
        this.addTab("Segundo Piso", segundoPiso);

        asientos = new JToggleButton[60];
        for (int i = 0; i < 60; i++) {
            asientos[i] = new JToggleButton("A" + (i+1));
            asientos[i].setFocusable(false);
        }
    }

    private void setupLayout() {
        gl1 = new GroupLayout(primerPiso);
        primerPiso.setLayout(gl1);
        gl2 = new GroupLayout(segundoPiso);
        segundoPiso.setLayout(gl2);

        // Primer Piso
        gl1.setHorizontalGroup(gl1.createSequentialGroup()    
            .addContainerGap(20, 20)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[40], 60, 60, 60)
                .addComponent(asientos[44], 60, 60, 60)
                .addComponent(asientos[48], 60, 60, 60)
                .addComponent(asientos[52], 60, 60, 60)
                .addComponent(asientos[56], 60, 60, 60)
            )
            .addGap(5)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[41], 60, 60, 60)
                .addComponent(asientos[45], 60, 60, 60)
                .addComponent(asientos[49], 60, 60, 60)
                .addComponent(asientos[53], 60, 60, 60)
                .addComponent(asientos[57], 60, 60, 60)
            )
            .addGap(20)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[42], 60, 60, 60)
                .addComponent(asientos[46], 60, 60, 60)
                .addComponent(asientos[50], 60, 60, 60)
                .addComponent(asientos[54], 60, 60, 60)
                .addComponent(asientos[58], 60, 60, 60)
            )
            .addGap(5)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(asientos[43], 60, 60, 60)
                .addComponent(asientos[47], 60, 60, 60)
                .addComponent(asientos[51], 60, 60, 60)
                .addComponent(asientos[55], 60, 60, 60)
                .addComponent(asientos[59], 60, 60, 60)
            )
            .addContainerGap(20, 20)
        );

        gl1.setVerticalGroup(gl1.createSequentialGroup()
            .addContainerGap(15, 15)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[40], 30 , 30, 30)
                .addComponent(asientos[41], 30 , 30, 30)
                .addComponent(asientos[42], 30 , 30, 30)
                .addComponent(asientos[43], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[44], 30 , 30, 30)
                .addComponent(asientos[45], 30 , 30, 30)
                .addComponent(asientos[46], 30 , 30, 30)
                .addComponent(asientos[47], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[48], 30 , 30, 30)
                .addComponent(asientos[49], 30 , 30, 30)
                .addComponent(asientos[50], 30 , 30, 30)
                .addComponent(asientos[51], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[52], 30 , 30, 30)
                .addComponent(asientos[53], 30 , 30, 30)
                .addComponent(asientos[54], 30 , 30, 30)
                .addComponent(asientos[55], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[56], 30 , 30, 30)
                .addComponent(asientos[57], 30 , 30, 30)
                .addComponent(asientos[58], 30 , 30, 30)
                .addComponent(asientos[59], 30 , 30, 30)
            )
            .addContainerGap(20, 20)
        );

        // Segundo Piso
        gl2.setHorizontalGroup(gl2.createSequentialGroup()    
            .addContainerGap(20, 20)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING)
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
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING)
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
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING)
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
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING)
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

        gl2.setVerticalGroup(gl2.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[0], 30 , 30, 30)
                .addComponent(asientos[1], 30 , 30, 30)
                .addComponent(asientos[2], 30 , 30, 30)
                .addComponent(asientos[3], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[4], 30 , 30, 30)
                .addComponent(asientos[5], 30 , 30, 30)
                .addComponent(asientos[6], 30 , 30, 30)
                .addComponent(asientos[7], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[8], 30 , 30, 30)
                .addComponent(asientos[9], 30 , 30, 30)
                .addComponent(asientos[10], 30 , 30, 30)
                .addComponent(asientos[11], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[12], 30 , 30, 30)
                .addComponent(asientos[13], 30 , 30, 30)
                .addComponent(asientos[14], 30 , 30, 30)
                .addComponent(asientos[15], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[16], 30 , 30, 30)
                .addComponent(asientos[17], 30 , 30, 30)
                .addComponent(asientos[18], 30 , 30, 30)
                .addComponent(asientos[19], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[20], 30 , 30, 30)
                .addComponent(asientos[21], 30 , 30, 30)
                .addComponent(asientos[22], 30 , 30, 30)
                .addComponent(asientos[23], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[24], 30 , 30, 30)
                .addComponent(asientos[25], 30 , 30, 30)
                .addComponent(asientos[26], 30 , 30, 30)
                .addComponent(asientos[27], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[28], 30 , 30, 30)
                .addComponent(asientos[29], 30 , 30, 30)
                .addComponent(asientos[30], 30 , 30, 30)
                .addComponent(asientos[31], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[32], 30 , 30, 30)
                .addComponent(asientos[33], 30 , 30, 30)
                .addComponent(asientos[34], 30 , 30, 30)
                .addComponent(asientos[35], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(asientos[36], 30 , 30, 30)
                .addComponent(asientos[37], 30 , 30, 30)
                .addComponent(asientos[38], 30 , 30, 30)
                .addComponent(asientos[39], 30 , 30, 30)
            )
            .addContainerGap(20, 20)
        );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}