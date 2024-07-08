package proyecto;
/**
 * El enum TipoAsiento representa los distintos asientos que se pueden comprar.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @param tipo el tipo de asiento que se va a comprar.
 * @param precio el precio del asiento que se va a comprar.
 */
public enum TipoAsiento {
      SemiCama("SemiCama", 10000),
      Cama("Cama", 15000), 
      Ejecutivo("Ejecutivo", 20000);

      private String tipo;
      private int precio;
         
      TipoAsiento(String tipo, int precio) {
         this.tipo = tipo;
         this.precio = precio;
      }

      public String getTipo() {
         return this.tipo;
      }

      public int getPrecio() {
         return this.precio;
      }  
   
   }