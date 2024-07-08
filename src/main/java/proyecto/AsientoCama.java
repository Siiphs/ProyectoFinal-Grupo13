package proyecto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * La clase AsientoCama representa un asiento de tipo cama, heredando todas las
 * propiedades de Asiento.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @see Asiento
 */

public class AsientoCama extends Asiento {
    public AsientoCama(int numero) {
        super(numero);
        this.setText("A" + numero); 
        setupListener();
    }

    private void setupListener() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isSelected()) {
                    if(ids.size() >= 10) {
                        precio -= TipoAsiento.Cama.getPrecio();
                    }
                    else {
                    TipoAsientoEventManager.getInstance().fireTipoAsientoEvent(new TipoAsientoEvent(AsientoCama.this, Tipo()));
                    precio += TipoAsiento.Cama.getPrecio();
                    PanelBoleta.precioLabel.setText("Precio: $" + precio + " pesos");
                    }
                }
                else {
                    precio -= TipoAsiento.Cama.getPrecio();
                    PanelBoleta.precioLabel.setText("Precio: $" + precio + " pesos");
                }
            }
        });
    }

    @Override
    public String Tipo() {
        return "Cama";
    }
}
