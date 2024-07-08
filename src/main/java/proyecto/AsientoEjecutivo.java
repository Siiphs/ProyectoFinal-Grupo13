package proyecto;

/**
 * La clase AsientoEjecutivo representa un asiento de tipo ejecutivo, heredando
 * todas las propiedades de Asiento.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @see Asiento
 */

public class AsientoEjecutivo extends Asiento {

    public AsientoEjecutivo(int numero) {
        super(numero);
    }

    public String Tipo() {
        return "Ejecutivo";
    }
}