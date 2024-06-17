import java.awt.*;
import javax.swing.*;

public class PanelVoleta extends JPanel{
    // private GroupLayout gl;

    public PanelVoleta(){
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setBackground(new java.awt.Color(180, 192, 241));
    }

    private void setupLayout() {
        // gl = new GroupLayout(this);
        // this.setLayout(gl);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}