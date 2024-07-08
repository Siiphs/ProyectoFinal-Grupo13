package proyecto;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBoleta extends JPanel implements TipoAsientoListener {
    private GroupLayout gl;
    static String origen, destino, tipoBus, dia, mes, hora;
    static JLabel origenLabel, destinoLabel, tipoAsientoLabel, horarioLabel, precioLabel, idLabel;
    public JButton comprar;

    public PanelBoleta() {
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
        precioLabel = new JLabel("Precio: (al seleccionar)");
        precioLabel.setFont(new Font("Arial", Font.BOLD, 16));
        idLabel = new JLabel("ID: (al seleccionar)");
        idLabel.setFont(new Font("Arial", Font.BOLD, 16));
        comprar = new JButton("Comprar");
        comprar.setFocusable(false);
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
                .addComponent(idLabel)
                .addComponent(precioLabel)
                .addComponent(comprar)
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
            .addGap(15)
            .addComponent(idLabel)
            .addGap(170)
            .addComponent(precioLabel)
            .addGap(30)
            .addComponent(comprar)
            .addContainerGap(20, 20)
        );
         comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(Asiento.ids.size() == 0) {
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningún asiento");
                        return;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Compra realizada con éxito");
                        Asiento.ids.clear();
                        Asiento.precio = 0;
                        PanelBoleta.precioLabel.setText("Precio: $" + Asiento.precio + " pesos");
                        Asiento.generarIde();
                    }
            }
        });
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
