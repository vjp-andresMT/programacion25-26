
package tema4;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class mainej26tema4 {
    


    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número para ver si es primo: ");
        int numero = entrada.nextInt();
        
        boolean resultado = ej26tema4.esPrimo(numero);
        
        if (resultado) {
            System.out.println(numero + " es un número primo");
        } else {
            System.out.println(numero + " no es un número primo");
        }
        
        
    }
}

