
package tema3java;
import java.util.Scanner;


/**
 *
 * @author andres
 */
public class ej23tema3 {
    


    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int numero;
        
        // Pedimos el número hasta que sea mayor que 1
        do {
            System.out.print("Introduce un número mayor que 1: ");
            numero = Entrada.nextInt();
            
            if (numero <= 1) {
                System.out.println("Error: El número debe ser mayor que 1.");
            }
        } while (numero <= 1);
        
        // Imprimimos todos los números desde 1 hasta el número introducido
        System.out.println("Los números entre 1 y " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
        
        
    }
}

