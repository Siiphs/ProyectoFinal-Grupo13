package proyecto;

import javax.swing.*;
import java.awt.*;

public class PanelPrimero extends JPanel {
    public static Bus bus;
    private GroupLayout gl;
    private JLabel origenLabel, destinoLabel, tipoBusLabel, diaLabel, mesLabel, horaLabel;
    public JComboBox<String> jOrigen, jDestino, jTipoBus, jDia, jMes, jHora;
    public JButton continuar;

    public PanelPrimero() {
        initComponent();
        setupLayout();
    }

    private void initComponent() {
        this.setBackground(new java.awt.Color(227, 93, 167));
        continuar = new JButton("Continuar");
        continuar.setFocusable(false);

        jOrigen = new JComboBox<>();
        jOrigen.setFocusable(false);
        jOrigen.addItem("Linares");
        jOrigen.addItem("Talca");
        jOrigen.addItem("Concepcion");
        jOrigen.addItem("Chillan");
        jOrigen.addItem("Los Angeles");
        jOrigen.addItem("Santiago");

        jDestino = new JComboBox<>();
        jDestino.setFocusable(false);
        jDestino.addItem("Linares");
        jDestino.addItem("Talca");
        jDestino.addItem("Concepcion");
        jDestino.addItem("Chillan");
        jDestino.addItem("Los Angeles");
        jDestino.addItem("Santiago");

        jTipoBus = new JComboBox<>();
        jTipoBus.setFocusable(false);
        jTipoBus.addItem("Estandar");
        jTipoBus.addItem("Doble planta");

        jDia = new JComboBox<>();
        jDia.setFocusable(false);
        for (int i = 1; i < 32; i++) {
            jDia.addItem(String.format("%02d", i));
        }

        jMes = new JComboBox<>();
        jMes.setFocusable(false);
                jMes.addItem("Enero");
                jMes.addItem("Febrero");
                jMes.addItem("Marzo");
                jMes.addItem("Abril");
                jMes.addItem("Mayo");
                jMes.addItem("Junio");
                jMes.addItem("Julio");
                jMes.addItem("Agosto");
                jMes.addItem("Septiembre");
                jMes.addItem("Octubre");
                jMes.addItem("Noviembre");
                jMes.addItem("Diciembre");

        jHora = new JComboBox<>();
        jHora.setFocusable(false);
        for (int i = 0; i < 24; i++) {
            jHora.addItem(String.format("%02d : 00", i));
        }

        origenLabel = new JLabel("Origen");
        destinoLabel = new JLabel("Destino");
        tipoBusLabel = new JLabel("Tipo de Bus");
        diaLabel = new JLabel("Dia");
        mesLabel = new JLabel("Mes");
        horaLabel = new JLabel("Hora");
    }

    private void setupLayout() {
        gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addContainerGap(20, 20)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(gl.createSequentialGroup()
                                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(origenLabel)
                                        .addComponent(jOrigen)
                                )
                                .addGap(10)

                                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(diaLabel)
                                        .addComponent(jDia)
                                )
                                .addGap(10)

                                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(tipoBusLabel)
                                        .addComponent(jTipoBus)
                                        .addComponent(mesLabel)
                                        .addComponent(jMes)
                                )
                                .addGap(10)
                                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(horaLabel)
                                        .addComponent(jHora)
                                )
                                .addGap(10)
                                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(destinoLabel)
                                        .addComponent(jDestino)
                                )
                        )
                        .addGap(20)
                        .addComponent(continuar)
                )
                .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addContainerGap(20, 100)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(origenLabel)
                        .addComponent(destinoLabel)
                        .addComponent(tipoBusLabel)
                )
                .addGap(3)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jOrigen)
                        .addComponent(jDestino)
                        .addComponent(jTipoBus)
                )
                .addGap(20)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(diaLabel)
                        .addComponent(mesLabel)
                        .addComponent(horaLabel)
                )
                .addGap(3)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jDia)
                        .addComponent(jMes)
                        .addComponent(jHora)
                )
                .addGap(20)
                .addComponent(continuar)
                .addGap(20)
                .addContainerGap(20, 3000)
        );
    }

@Override
    public void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon imageicon = new ImageIcon("src\\main\\java\\imagenes\\fondo.png");
            imageicon.paintIcon(this, g, 0, 0);
    }
}