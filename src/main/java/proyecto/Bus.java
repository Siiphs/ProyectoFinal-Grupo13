package proyecto;

public class Bus {
    private String origen, destino, tipoBus, mes, dia, hora;
    private Asiento[] asientos;

    public Bus(String origen, String destino, String tipoBus, String mes, String dia, String hora) {
        this.origen = origen;
        this.destino = destino;
        this.tipoBus = tipoBus;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        inicializarAsientos(tipoBus);
    }

    public void inicializarAsientos(String tipoBus) {
        if(tipoBus.equals("Estandar")){
            asientos = new AsientoEjecutivo[40];
            for (int i = 0; i < 40; i++) {
                int indice = i;
                asientos[indice] = new AsientoEjecutivo(i+1); 
                asientos[i].setFocusable(false);
                }
            }
        else if(tipoBus.equals("Doble planta")){
            asientos = new Asiento[60];
            for (int i = 1; i < 40; i++) {
                int indice = i;
                asientos[indice] = new AsientoSemiCama(i+1);
                asientos[i].setFocusable(false);
                }
            for (int i = 41; i < 60; i++) {
                int indice = i;
                asientos[indice] = new AsientoCama(i+1);
                asientos[i].setFocusable(false);
                }
            }
        }

    public void setDatos(String origen, String destino, String tipoBus, String dia, String mes, String hora) {
        this.origen = origen;
        this.destino = destino;
        this.tipoBus = tipoBus;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
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

    public String getMes() {
        return mes;
    }

    public String getDia() {
        return dia;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }
}