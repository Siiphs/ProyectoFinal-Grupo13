import javax.swing.*;

public class PanelPrimero extends JPanel { 
    private GroupLayout gl;
    private JLabel origenLabel, destinoLabel, tipoBusLabel;
    public JComboBox<String> jOrigen, jDestino, jTipoBus;
    public JButton continuar;

    public PanelPrimero() {
        initComponent();
        setupLayout();
    }
    
    private void initComponent() {
        this.setBackground(new java.awt.Color(227, 93, 167));
        continuar = new JButton("Continuar");
        continuar.setFocusable(false);

        jOrigen = new JComboBox<String>();
        jOrigen.setFocusable(false);
        jOrigen.addItem("Linares");
        jOrigen.addItem("Talca");
        jOrigen.addItem("Concepcion");
        jOrigen.addItem("Chillan");
        jOrigen.addItem("Los Angeles");
        jOrigen.addItem("Santiago");

        jDestino = new JComboBox<String>();
        jDestino.setFocusable(false);
        jDestino.addItem("Linares");
        jDestino.addItem("Talca");
        jDestino.addItem("Concepcion");
        jDestino.addItem("Chillan");
        jDestino.addItem("Los Angeles");
        jDestino.addItem("Santiago");

        jTipoBus = new JComboBox<String>();
        jTipoBus.setFocusable(false);
        jTipoBus.addItem("Ejecutivo");
        jTipoBus.addItem("Semi-Cama");
        jTipoBus.addItem("Cama");
        jTipoBus.addItem("Mixto");

        origenLabel = new JLabel("Origen");
        destinoLabel = new JLabel("Destino");
        tipoBusLabel = new JLabel("Tipo de Bus");
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
            .addComponent(continuar)
            .addGap(20)
            .addContainerGap(20, 3000)
            );
    } 
}