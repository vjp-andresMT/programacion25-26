
package ejerciciosprogramacionrepaso.temas1.pkg4;
import java.util.Scanner;

/**
 *
 * @author andres
 */

public class ExcepcionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("ingresa un numero: ");
            int numero = scanner.nextInt();
            System.out.println("Numero ingresado" + numero);
            
            // division que puede causar excepcion
            System.out.println("ingresa un divisor: ");
            int divisor = scanner.nextInt();
            int resultado = numero / divisor;
            System.out.println("Resultado division: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: division por cero no permitida");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: debes ingresar un número entero");
        } finally {
            System.out.println("este bloque siempre se ejecuta");
        }
    }
}
