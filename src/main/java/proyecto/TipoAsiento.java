package proyecto;

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