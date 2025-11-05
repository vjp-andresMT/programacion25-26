
package tema4java;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej24tema4 {
   
    public static void main(String[] args) {
        String nombre = pedirNombre();
        int edad = pedirEdad();
        mayorDeEdad(nombre, edad);
    }
    
    // Método para pedir el nombre
    public static String pedirNombre() {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    // Método para pedir la edad
    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad: ");
        int edad = entrada.nextInt();
        return edad;
    }
    
    // Método para verificar si es mayor de edad - CORREGIDO
    public static void mayorDeEdad(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println("El usuario llamado " + nombre + " es mayor de edad.");
        } else {
            System.out.println("El usuario llamado " + nombre + " no es mayor de edad.");
        }
    }
}


