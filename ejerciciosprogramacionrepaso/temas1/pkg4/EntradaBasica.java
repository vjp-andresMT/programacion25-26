

package repasotema1.pkg2.pkg3.pkg4;
import java.util.Scanner;

/**
 *
 * @author andres
 */

public class EntradaBasica {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Hola " + nombre + ", tienes " + edad + "años.");
    }
}
