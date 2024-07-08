package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class AsientoEjecutivo extends Asiento {

    public AsientoEjecutivo(int numero) {
        super(numero);
        this.setText("A" + numero); 
        setupListener();
    }

    private void setupListener() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isSelected()) {
                    TipoAsientoEventManager.getInstance().fireTipoAsientoEvent(new TipoAsientoEvent(AsientoEjecutivo.this, Tipo()));
                    precio += TipoAsiento.Ejecutivo.getPrecio();
                    PanelBoleta.precioLabel.setText("Precio: $" + precio + " pesos");
                }
                else {
                    precio -= TipoAsiento.Ejecutivo.getPrecio();
                    PanelBoleta.precioLabel.setText("Precio: $" + precio + " pesos");
                }
            }
        });
    }

    @Override
    public String Tipo() {
        return "Ejecutivo";
    }
}
