package proyecto;

import java.util.EventListener;

public interface TipoAsientoListener extends EventListener {
    void tipoAsientoChanged(TipoAsientoEvent event);
}
