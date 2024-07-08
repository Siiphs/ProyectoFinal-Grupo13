package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

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
                    TipoAsientoEventManager.getInstance().fireTipoAsientoEvent(new TipoAsientoEvent(AsientoCama.this, Tipo()));
                }
            }
        });
    }

    @Override
    public String Tipo() {
        return "Cama";
    }
}
