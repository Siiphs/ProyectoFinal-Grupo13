package proyecto;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 * La clase asiento representa un asiento genérico con su número, tipo y si ya
 * está ocupado.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @param tipo    el tipo de asiento
 * @param numero  el numero del asiento dentro del bus
 * @param ocupado indica si el asiento está ocupado o no
 */
abstract class Asiento extends JToggleButton {
    private String tipo, ide;
    private int numero;
    public static int precio;
    private boolean ocupado;
    private List<TipoAsientoListener> listeners;
    public static List<Integer> ids = new ArrayList<>();

    public Asiento(int numero) {
        ide = "";
        this.numero = numero;
        this.ocupado = false;
        this.setText("A" + numero);
        this.listeners = new ArrayList<>();
        this.addActionListener(e -> {
            if (isSelected()) {
                if (ids.size() >= 10) {
                    JOptionPane.showMessageDialog(null, "No se pueden seleccionar más de 10 asientos", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    this.setSelected(false);
                    ids.remove(Integer.valueOf(this.numero));
                    return;
                }
                else{
                System.out.println("Seleccionado " + this.numero);
                if (!ids.contains(this.numero)) {
                    ids.add(this.numero);
                }
                fireTipoAsientoEvent(new TipoAsientoEvent(this, tipo));}
            } else {
                System.out.println("Deseleccionado " + this.numero);
                Integer numeroObj = Integer.valueOf(this.numero);
                ids.remove(numeroObj);
            }
            PanelBoleta.idLabel.setText("IDs: " + generarIde());
        });
    }

    public static String generarIde() {
        String ide = "";
        for (int i = 0; i < ids.size(); i++) {
            ide += ids.get(i);
            if (i < ids.size() - 1) {
                ide += ", ";
            }
        }
        return ide;
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
