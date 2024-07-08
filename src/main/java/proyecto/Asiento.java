package proyecto;

import javax.swing.JToggleButton;

abstract class Asiento extends JToggleButton {
      private String tipo;
      private int numero;
      private boolean ocupado;

      public Asiento(int numero) {
            this.numero = numero;
            this.ocupado = false;
            this.setText("A" + numero);   
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

      public String getTipo() {
            return this.tipo;
      }

      public abstract String Tipo();
   }