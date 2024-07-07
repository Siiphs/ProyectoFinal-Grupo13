package proyecto;
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
                PanelVoleta.dia = panelPrimero.jDia.getSelectedItem().toString();
                PanelVoleta.mes = panelPrimero.jMes.getSelectedItem().toString();
                PanelVoleta.hora = panelPrimero.jHora.getSelectedItem().toString();
                PanelVoleta.origen = panelPrimero.jOrigen.getSelectedItem().toString();
                PanelVoleta.destino = panelPrimero.jDestino.getSelectedItem().toString();
                PanelVoleta.tipoBus = panelPrimero.jTipoBus.getSelectedItem().toString();
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
        this.setSize(670, 530);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Touhou Bus");

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