
package tema4;
import java.util.Scanner;

/**
 *
 * @author andres
 */



public class RepetirNombreEj18 {

    public static void main(String[] args) {
        String nombre = pedirNombre();
        mostrarNombre(nombre);
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static void mostrarNombre(String nombre) {
        System.out.println("Tu nombre 5 veces:");
        System.out.println("------------------");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre);
        }
    }
}