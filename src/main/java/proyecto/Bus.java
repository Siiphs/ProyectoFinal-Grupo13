package proyecto;

public class Bus {
    private static Bus instance;
    private String origen;
    private String destino;
    private String tipoBus;
    private String hora;
    private int capacidad;

    private Bus() {
        // Inicialización por defecto
        this.origen = "Linares";
        this.destino = "Talca";
        this.tipoBus = "Estandar";
        this.hora = "00:00";
        this.capacidad = 40;
    }

    public static synchronized Bus getInstance() {
        if (instance == null) {
            instance = new Bus();
        }
        return instance;
    }

    public void setDatos(String origen, String destino, String tipoBus, String hora, int capacidad) {
        this.origen = origen;
        this.destino = destino;
        this.tipoBus = tipoBus;
        this.hora = hora;
        this.capacidad = capacidad;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public String gethora() {
        return hora;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
