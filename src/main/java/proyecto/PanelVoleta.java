package proyecto;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelVoleta extends JPanel implements TipoAsientoListener {
    private GroupLayout gl;
    static String origen, destino, tipoBus, dia, mes, hora;
    private JLabel origenLabel, destinoLabel, tipoAsientoLabel, horarioLabel;

    public PanelVoleta() {
        initComponent();
        setupLayout();
        TipoAsientoEventManager.getInstance().addTipoAsientoListener(this);
    }

    private void initComponent() {
        this.setBackground(new java.awt.Color(180, 192, 241));
        horarioLabel = new JLabel("Salida: " + dia + " de " + mes + " a las  " + hora);
        horarioLabel.setFont(new Font("Arial", Font.BOLD, 13));
        origenLabel = new JLabel("Origen: " + origen);
        origenLabel.setFont(new Font("Arial", Font.BOLD, 13));
        destinoLabel = new JLabel("Destino: " + destino);
        destinoLabel.setFont(new Font("Arial", Font.BOLD, 13));
        tipoAsientoLabel = new JLabel("Tipo de Asiento: (al seleccionar)");
        tipoAsientoLabel.setFont(new Font("Arial", Font.BOLD, 16));
    }

    private void setupLayout() {
        gl = new GroupLayout(this);
        this.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(horarioLabel)
                .addComponent(origenLabel)
                .addComponent(destinoLabel)
                .addComponent(tipoAsientoLabel)
            )
            .addContainerGap(20, 20)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addContainerGap(20, 20)
            .addComponent(horarioLabel)
            .addGap(3)
            .addComponent(origenLabel)
            .addGap(3)
            .addComponent(destinoLabel)
            .addGap(15)
            .addComponent(tipoAsientoLabel)
            .addContainerGap(20, 20)
        );
    }

    public void setTipo(String tipo) {
        tipoAsientoLabel.setText("Tipo de Asiento: " + tipo);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void tipoAsientoChanged(TipoAsientoEvent event) {
        setTipo(event.getTipo());
    }
}
