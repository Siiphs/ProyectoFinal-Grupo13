package proyecto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * La clase AsientoSemiCama representa un asiento de tipo semi-cama, heredando
 * todas las propiedades de Asiento.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @see Asiento
 */

public class AsientoSemiCama extends Asiento {
    public AsientoSemiCama(int numero) {
        super(numero);
        this.setText("A" + numero); 
        setupListener();
    }

    private void setupListener() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isSelected()) {
                    TipoAsientoEventManager.getInstance().fireTipoAsientoEvent(new TipoAsientoEvent(AsientoSemiCama.this, Tipo()));
                    precio += TipoAsiento.SemiCama.getPrecio();
                    PanelBoleta.precioLabel.setText("Precio: $" + precio + " pesos");
                }
                else {
                    precio -= TipoAsiento.SemiCama.getPrecio();
                    PanelBoleta.precioLabel.setText("Precio: $" + precio + " pesos");
                }
            }
        });
    }

    @Override
    public String Tipo() {
        return "SemiCama";
    }
}
