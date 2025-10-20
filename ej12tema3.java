
package tema3java;

/**
 *
 * @author andre
 */
public class ej12tema3 {
  
    public static void main(String[] args) {
        int numero = 12; // Empezamos en el primer par después del 11
        
        do {
            System.out.println(numero);
            numero = numero + 2; // Sumamos 2 para ir al siguiente par
        } while (numero <= 132); // Hasta el último par antes del 133
    }
}

