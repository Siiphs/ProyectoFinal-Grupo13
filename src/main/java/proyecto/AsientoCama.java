package proyecto;

/**
 * La clase AsientoCama representa un asiento de tipo cama, heredando todas las
 * propiedades de Asiento.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @see Asiento
 */

public class AsientoCama extends Asiento {

    public AsientoCama(int numero) {
        super(numero);
    }

    public String Tipo() {
        return "Cama";
    }
}