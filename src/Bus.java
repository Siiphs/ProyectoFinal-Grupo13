package src;
class Bus {
      //implementacion del bus creando asientos
      private Asiento[] asientos = new Asiento[40];

      public Bus() {
            for (int i = 0; i < 40; i++) {
                  asientos[i] = new Asiento(i);
            }
      }

      public void ocuparAsiento(int numero) {
            asientos[numero].ocupar();
      }
      

}