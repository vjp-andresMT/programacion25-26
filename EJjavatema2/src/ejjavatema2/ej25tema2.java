
package ejjavatema2;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej25tema2 {
 


    public static void main(String[] args) {
        // Creamos el lector para el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos los tres números uno por uno
        System.out.println("Por favor, introduzca el primer número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Por favor, introduzca el segundo número:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Por favor, introduzca el tercer número:");
        double numero3 = scanner.nextDouble();
        
        // Calculamos la suma
        double suma = numero1 + numero2 + numero3;
        
        // Calculamos el producto (multiplicación)
        double producto = numero1 * numero2 * numero3;
        
        // Mostramos los resultados
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);
        
       
    }
}

