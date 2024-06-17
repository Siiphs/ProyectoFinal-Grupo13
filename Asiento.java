class Asiento {
      //Tipos: (0)Semi-cama, (1)Cama, (2)Ejecutivo, (3)Premium
      private int numero;
      private boolean ocupado;

      public Asiento(int numero) {
            this.numero = numero;
            this.ocupado = false;
      }

      public void ocupar() {
            this.ocupado = true;
      }

      public void liberar() {
            this.ocupado = false;
      }

      public int getNumero() {
            return this.numero;
      }

      public boolean getEstado() {
            return this.ocupado;
      }

   }