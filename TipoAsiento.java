public enum TipoAsiento {
      SemiCama(0, 10000),
      Cama(1, 15000), 
      Ejecutivo(2, 20000), 
      Premium(3, 25000);

      private int tipo;
      private int precio;
      
         
      TipoAsiento(int tipo, int precio) {
         this.tipo = tipo;
         this.precio = precio;
      }

      public int getTipo() {
         return this.tipo;
      }

      public int getPrecio() {
         return this.precio;
      }  
   
   }