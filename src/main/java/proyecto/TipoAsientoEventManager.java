package proyecto;

import java.util.ArrayList;
import java.util.List;

public class TipoAsientoEventManager {
    private static TipoAsientoEventManager instance;
    private List<TipoAsientoListener> listeners;

    private TipoAsientoEventManager() {
        listeners = new ArrayList<>();
    }

    public static synchronized TipoAsientoEventManager getInstance() {
        if (instance == null) {
            instance = new TipoAsientoEventManager();
        }
        return instance;
    }

    public void addTipoAsientoListener(TipoAsientoListener listener) {
        listeners.add(listener);
    }

    public void removeTipoAsientoListener(TipoAsientoListener listener) {
        listeners.remove(listener);
    }

    public void fireTipoAsientoEvent(TipoAsientoEvent event) {
        listeners.forEach(listener -> listener.tipoAsientoChanged(event));
    }
}
