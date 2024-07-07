package proyecto;

import java.util.ArrayList;

public class Bus {
    private static Bus instance;
    private String origen, destino, tipoBus, mes, hora;
    private int capacidad, dia;
    private ArrayList<Asiento> asientos;

    private Bus() {
        // Inicialización por defecto
        this.origen = "Linares";
        this.destino = "Talca";
        this.tipoBus = "Estandar";
        this.mes = "Enero";
        this.dia = 01;
        this.hora = "00:00";
        this.capacidad = 40;
    }

    private void inicializarAsientos(int numAsientos) {
        if(tipoBus.equals("Estandar")){
            inicializarAsientos(40);
        }
        else if(tipoBus.equals("Doble planta")){
            inicializarAsientos(60);
        }

        for (int i = 1; i <= numAsientos; i++) {
            // Asumiendo que los primeros 10 asientos son de categoría "Ejecutivo", los siguientes 10 son "Semi Cama" y los demás "Cama"
            String tipo;
            if (i <= 10) {
                tipo = "Ejecutivo";
                asientos.add(new AsientoEjecutivo(i));
            } else if (i <= 20) {
                tipo = "Cama";
                asientos.add(new AsientoCama(i));
            } else {
                tipo = "SemiCama";
                asientos.add(new AsientoSemiCama(i));
            }
        }
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