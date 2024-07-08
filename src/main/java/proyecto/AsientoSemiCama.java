package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

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
                }
            }
        });
    }

    @Override
    public String Tipo() {
        return "SemiCama";
    }
}
