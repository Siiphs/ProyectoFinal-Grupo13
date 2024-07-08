package proyecto;

/**
 * La clase AsientoSemiCama representa un asiento de tipo semi-cama, heredando
 * todas las propiedades de Asiento.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @see Asiento
 */

public class AsientoSemiCama extends Asiento {

    public AsientoSemiCama(int numero) {
        super(numero);
    }

    public String Tipo() {
        return "SemiCama";
    }
}