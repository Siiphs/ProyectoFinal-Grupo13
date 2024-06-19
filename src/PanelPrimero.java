import javax.swing.*;

public class PanelPrimero extends JPanel { 
    private GroupLayout gl;
    private JLabel origenLabel, destinoLabel;
    private JComboBox<String> origen, destino;
    public JButton continuar;

    public PanelPrimero() {
        initComponent();
        setupLayout();
    }
    
    private void initComponent() {
        this.setBackground(new java.awt.Color(227, 93, 167));
        continuar = new JButton("Continuar");

        origen = new JComboBox<String>();
        origen.addItem("Linares");
        origen.addItem("Talca");
        origen.addItem("Concepcion");
        origen.addItem("Chillan");
        origen.addItem("Los Angeles");
        origen.addItem("Santiago");

        destino = new JComboBox<String>();
        destino.addItem("Linares");
        destino.addItem("Talca");
        destino.addItem("Concepcion");
        destino.addItem("Chillan");
        destino.addItem("Los Angeles");
        destino.addItem("Santiago");

        origenLabel = new JLabel("Origen");
        destinoLabel = new JLabel("Destino");
    }

    private void setupLayout() {
        gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(origenLabel)
                .addComponent(origen)
                .addComponent(destinoLabel)
                .addComponent(destino)
                .addComponent(continuar)

            )
            .addGap(5)
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 3000)
            .addComponent(origenLabel)
            .addGap(5)
            .addComponent(origen)
            .addGap(20)
            .addComponent(destinoLabel)
            .addGap(5)
            .addComponent(destino)
            .addGap(20)
            .addComponent(continuar)
            .addGap(20)
            .addContainerGap(20, 3000)
            );
    } 
}