import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame {
    private CardLayout cl;
    private JPanel panelCl;
    private PanelPrimero panelPrimero;
    private PanelSegundo panelSegundo;

    public Ventana() {
        initComponent();
        setupLayout();

        panelPrimero.continuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelSegundo = new PanelSegundo();
                panelCl.add(panelSegundo, "O_o");
                cl.show(panelCl, "O_o");

                panelSegundo.volver.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cl.show(panelCl, ">_<");
                    }
                });
            }
        });
    }

    private void initComponent() {
        this.setSize(600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana");

        panelCl = new JPanel();
        panelPrimero = new PanelPrimero();
        
        this.add(panelCl);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void setupLayout() {
        cl = new CardLayout();
        panelCl.setLayout(cl);

        panelCl.add(panelPrimero, ">_<");
        cl.show(panelCl, ">_<");
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}
