package proyecto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrimero extends JPanel {
    public static Bus bus;
    private GroupLayout gl;
    private JLabel origenLabel, destinoLabel, tipoBusLabel, horarioLabel;
    public JComboBox<String> jOrigen, jDestino, jTipoBus, jHorario;
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

        jHorario = new JComboBox<>();
        jHorario.setFocusable(false);
        for (int i = 0; i < 24; i++) {
            jHorario.addItem(String.format("%02d : 00", i));
        }

        origenLabel = new JLabel("Origen");
        destinoLabel = new JLabel("Destino");
        tipoBusLabel = new JLabel("Tipo de Bus");
        horarioLabel = new JLabel("Horario");
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
                                .addGap(20)
                                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(destinoLabel)
                                        .addComponent(jDestino)
                                )
                                .addGap(20)
                                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(tipoBusLabel)
                                        .addComponent(jTipoBus)
                                )
                                .addGap(20)
                                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(horarioLabel)
                                        .addComponent(jHorario)
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
                        .addComponent(horarioLabel)
                )
                .addGap(3)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jOrigen)
                        .addComponent(jDestino)
                        .addComponent(jTipoBus)
                        .addComponent(jHorario)
                )
                .addGap(20)
                .addComponent(continuar)
                .addGap(20)
                .addContainerGap(20, 3000)
        );
    }
}
