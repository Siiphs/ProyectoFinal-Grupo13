package proyecto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * La clase AsientoEjecutivo representa un asiento de tipo ejecutivo, heredando
 * todas las propiedades de Asiento.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @see Asiento
 */

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
                    if(ids.size() >= 10) {
                        precio -= TipoAsiento.Ejecutivo.getPrecio();
                    }
                    else {
                    TipoAsientoEventManager.getInstance().fireTipoAsientoEvent(new TipoAsientoEvent(AsientoEjecutivo.this, Tipo()));
                    precio += TipoAsiento.Ejecutivo.getPrecio();
                    PanelBoleta.precioLabel.setText("Precio: $" + precio + " pesos");
                    }
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
