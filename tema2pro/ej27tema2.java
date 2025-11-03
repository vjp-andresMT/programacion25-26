
package ejjavatema2;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej27tema2 {
   
    public static void main(String[] args) {
        // Creamos el lector para el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos el número
        System.out.println("Por favor, introduzca un número:");
        int numero = scanner.nextInt();
        
        // Calculamos el doble (número × 2)
        int doble = numero * 2;
        
        // Calculamos el cubo (número × número × número)
        int cubo = numero * numero * numero;
        
        // Mostramos los resultados
        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El cubo de " + numero + " es: " + cubo);
        
    
       
    }
}

