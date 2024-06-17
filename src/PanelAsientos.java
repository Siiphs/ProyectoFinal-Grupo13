import java.awt.Graphics;
import javax.swing.*;

public class PanelAsientos extends JPanel {
    private GroupLayout gl;

    public PanelAsientos() {
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setBackground(new java.awt.Color(26, 224, 217));
        
    }

    private void setupLayout() {
        
        JToggleButton[] botonesFila1 = new JToggleButton[10];
        JToggleButton[] botonesFila2 = new JToggleButton[10];
        JToggleButton[] botonesFila3 = new JToggleButton[10];
        JToggleButton[] botonesFila4 = new JToggleButton[10];

        for (int i = 0; i < 10; i++) {
            botonesFila1[i] = new JToggleButton("A" + (i + 1));
            botonesFila2[i] = new JToggleButton("A" + (i + 11));
            botonesFila3[i] = new JToggleButton("A" + (i + 21));
            botonesFila4[i] = new JToggleButton("A" + (i + 31));
        }

        gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()    
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(botonesFila1[0], 60 , 60, 60)
                .addComponent(botonesFila1[1], 60 , 60, 60)
                .addComponent(botonesFila1[2], 60 , 60, 60)
                .addComponent(botonesFila1[3], 60 , 60, 60)
                .addComponent(botonesFila1[4], 60 , 60, 60)
                .addComponent(botonesFila1[5], 60 , 60, 60)
                .addComponent(botonesFila1[6], 60 , 60, 60)
                .addComponent(botonesFila1[7], 60 , 60, 60)
                .addComponent(botonesFila1[8], 60 , 60, 60)
                .addComponent(botonesFila1[9], 60 , 60, 60)
            )
            .addGap(5)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(botonesFila2[0], 60 , 60, 60)
                .addComponent(botonesFila2[1], 60 , 60, 60)
                .addComponent(botonesFila2[2], 60 , 60, 60)
                .addComponent(botonesFila2[3], 60 , 60, 60)
                .addComponent(botonesFila2[4], 60 , 60, 60)
                .addComponent(botonesFila2[5], 60 , 60, 60)
                .addComponent(botonesFila2[6], 60 , 60, 60)
                .addComponent(botonesFila2[7], 60 , 60, 60)
                .addComponent(botonesFila2[8], 60 , 60, 60)
                .addComponent(botonesFila2[9], 60 , 60, 60)
            )
            .addGap(20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(botonesFila3[0], 60 , 60, 60)
                .addComponent(botonesFila3[1], 60 , 60, 60)
                .addComponent(botonesFila3[2], 60 , 60, 60)
                .addComponent(botonesFila3[3], 60 , 60, 60)
                .addComponent(botonesFila3[4], 60 , 60, 60)
                .addComponent(botonesFila3[5], 60 , 60, 60)
                .addComponent(botonesFila3[6], 60 , 60, 60)
                .addComponent(botonesFila3[7], 60 , 60, 60)
                .addComponent(botonesFila3[8], 60 , 60, 60)
                .addComponent(botonesFila3[9], 60 , 60, 60)
            )
            .addGap(5)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(botonesFila4[0], 60 , 60, 60)
                .addComponent(botonesFila4[1], 60 , 60, 60)
                .addComponent(botonesFila4[2], 60 , 60, 60)
                .addComponent(botonesFila4[3], 60 , 60, 60)
                .addComponent(botonesFila4[4], 60 , 60, 60)
                .addComponent(botonesFila4[5], 60 , 60, 60)
                .addComponent(botonesFila4[6], 60 , 60, 60)
                .addComponent(botonesFila4[7], 60 , 60, 60)
                .addComponent(botonesFila4[8], 60 , 60, 60)
                .addComponent(botonesFila4[9], 60 , 60, 60)
            )
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[0], 30 , 30, 30)
                .addComponent(botonesFila2[0], 30 , 30, 30)
                .addComponent(botonesFila3[0], 30 , 30, 30)
                .addComponent(botonesFila4[0], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[1], 30 , 30, 30)
                .addComponent(botonesFila2[1], 30 , 30, 30)
                .addComponent(botonesFila3[1], 30 , 30, 30)
                .addComponent(botonesFila4[1], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[2], 30 , 30, 30)
                .addComponent(botonesFila2[2], 30 , 30, 30)
                .addComponent(botonesFila3[2], 30 , 30, 30)
                .addComponent(botonesFila4[2], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[3], 30 , 30, 30)
                .addComponent(botonesFila2[3], 30 , 30, 30)
                .addComponent(botonesFila3[3], 30 , 30, 30)
                .addComponent(botonesFila4[3], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[4], 30 , 30, 30)
                .addComponent(botonesFila2[4], 30 , 30, 30)
                .addComponent(botonesFila3[4], 30 , 30, 30)
                .addComponent(botonesFila4[4], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[5], 30 , 30, 30)
                .addComponent(botonesFila2[5], 30 , 30, 30)
                .addComponent(botonesFila3[5], 30 , 30, 30)
                .addComponent(botonesFila4[5], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[6], 30 , 30, 30)
                .addComponent(botonesFila2[6], 30 , 30, 30)
                .addComponent(botonesFila3[6], 30 , 30, 30)
                .addComponent(botonesFila4[6], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[7], 30 , 30, 30)
                .addComponent(botonesFila2[7], 30 , 30, 30)
                .addComponent(botonesFila3[7], 30 , 30, 30)
                .addComponent(botonesFila4[7], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[8], 30 , 30, 30)
                .addComponent(botonesFila2[8], 30 , 30, 30)
                .addComponent(botonesFila3[8], 30 , 30, 30)
                .addComponent(botonesFila4[8], 30 , 30, 30)
            )
            .addGap(10)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botonesFila1[9], 30 , 30, 30)
                .addComponent(botonesFila2[9], 30 , 30, 30)
                .addComponent(botonesFila3[9], 30 , 30, 30)
                .addComponent(botonesFila4[9], 30 , 30, 30)
            )
            .addContainerGap(20, 20)
        );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}