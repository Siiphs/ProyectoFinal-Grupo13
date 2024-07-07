package proyecto;

public class Bus {
    private static Bus instance;
    private String origen;
    private String destino;
    private String tipoBus;
    private String horario;
    private int capacidad;

    private Bus() {
        // Inicialización por defecto
        this.origen = "Linares";
        this.destino = "Talca";
        this.tipoBus = "Estandar";
        this.horario = "00:00";
        this.capacidad = 40;
    }

    public static synchronized Bus getInstance() {
        if (instance == null) {
            instance = new Bus();
        }
        return instance;
    }

    public void setDatos(String origen, String destino, String tipoBus, String horario, int capacidad) {
        this.origen = origen;
        this.destino = destino;
        this.tipoBus = tipoBus;
        this.horario = horario;
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

    public String getHorario() {
        return horario;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
