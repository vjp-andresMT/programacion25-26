
package tema3java;

/**
 *
 * @author andres
 */
public class ej13tema3 {
   
    public static void main(String[] args) {
        int numero = 12; // Empezamos en el primer par después del 11
        
        while (numero <= 132) { // Mientras no lleguemos al último par
            System.out.println(numero);
            numero = numero + 2; // Saltamos al siguiente par
        }
    }
}

