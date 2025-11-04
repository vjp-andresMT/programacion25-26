
package tema4java;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class mainej26 {
  


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para ver si es primo: ");
        int num = entrada.nextInt();
        
        if (VerificadorPrimoej26.esPrimo(num)) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
        
        
    }
}

