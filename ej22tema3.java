
package tema3java;
 import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author andres
 */
public class ej22tema3 {
  

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        boolean datosCorrectos = false;
        
        while (!datosCorrectos) {
            try {
                System.out.print("Introduce el primer número: ");
                numero1 = entrada.nextDouble();
                
                System.out.print("Introduce el segundo número: ");
                numero2 = entrada.nextDouble();
                
                datosCorrectos = true;
                
            } catch (InputMismatchException e) {
                System.out.println("¡Error! Has introducido una letra en vez de un número.");
                System.out.println("Por favor, intenta de nuevo.\n");
                entrada.next(); // Limpiar el buffer del scanner
            }
        }
        
        double suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " + " + numero2 + " = " + suma);
        
       
    }
}

