
package tema3java;

/**
 *
 * @author andres
 */
public class ej16tema3 {
  
    public static void main(String[] args) {
        int inicio = 20;
        int fin = 160;
        int contador = 0;

        System.out.print("Los números impares existentes entre el número 20 y el 160 son: ");

        for (int i = 21; i <= 159; i += 2) {
            if (contador == 0) {
                System.out.print(i);
            } else {
                System.out.print(" - " + i);
            }
            contador++;
        }

        System.out.println();
        System.out.println("La cantidad de números impares impresos han sido: " + contador);
    }
}

