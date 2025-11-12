
package repasotema1.pkg2.pkg3.pkg4;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andres
 */

public class ImportBasico {
    public static void main(String[] args) {
        Date fecha = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fecha actual: " + fecha);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("!Hola, " + nombre + "!");
    }
}

