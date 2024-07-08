package proyecto;

import javax.swing.JToggleButton;

/**
 * La clase asiento representa un asiento genérico con su número, tipo y si ya
 * está ocupado.
 * 
 * @author Joseph Matamala, Felipe Tillería
 * @since 19 de junio de 2024
 * 
 * @param tipo    el tipo de asiento
 * @param numero  el numero del asiento dentro del bus
 * @param ocupado indica si el asiento está ocupado o no
 */
abstract class Asiento extends JToggleButton {
      private String tipo;
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

      public String getTipo() {
            return this.tipo;
      }

      public abstract String Tipo();
}