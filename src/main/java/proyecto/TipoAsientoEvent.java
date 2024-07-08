package proyecto;

import java.util.EventObject;

public class TipoAsientoEvent extends EventObject {
    private String tipo;

    public TipoAsientoEvent(Object source, String tipo) {
        super(source);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
