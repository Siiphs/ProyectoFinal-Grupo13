package proyecto;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JToggleButton;

abstract class Asiento extends JToggleButton {
    private String tipo;
    private int numero;
    private boolean ocupado;
    private List<TipoAsientoListener> listeners;

    public Asiento(int numero) {
        this.numero = numero;
        this.ocupado = false;
        this.setText("A" + numero);
        this.listeners = new ArrayList<>();
        this.addActionListener(e -> {
            if (isSelected()) {
                System.out.println("Button selected");
                fireTipoAsientoEvent(new TipoAsientoEvent(this, tipo));
            } else {
                System.out.println("Button deselected");
            }
        });
    }

    public abstract String Tipo();

    public void ocupar() {
        this.ocupado = true;
    }

    public int getNumero() {
        return this.numero;
    }

    public boolean getEstado() {
        return this.ocupado;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void addTipoAsientoListener(TipoAsientoListener listener) {
        listeners.add(listener);
    }

    public void removeTipoAsientoListener(TipoAsientoListener listener) {
        listeners.remove(listener);
    }

    protected void fireTipoAsientoEvent(TipoAsientoEvent event) {
        listeners.forEach(listener -> listener.tipoAsientoChanged(event));
    }
}
