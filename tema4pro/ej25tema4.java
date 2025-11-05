
package tema4java;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class ej25tema4 {



    
    public static void main(String[] args) {
        // Aquí empieza el programa principal
        // Primero pido el nombre y lo guardo en una variable
        String nombre = pedirNombre();
        
        // Luego pido la edad y también la guardo
        int edad = pedirEdad();
        
        // Finalmente verifico si es mayor de edad con los datos que recogí
        mayorDeEdad(nombre, edad);
    }
    
    // Este método se encarga de pedir el nombre al usuario
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre: ");
        // Uso nextLine() para leer texto completo con espacios
        String nombre = entrada.nextLine();
        return nombre; // Devuelvo el nombre para usarlo en otro lugar
    }
    
    // Método para pedir la edad, aquí pongo más cuidado por si el usuario se equivoca
    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        int edad = 0; // Inicializo la edad en 0
        boolean edadValida = false; // Esta variable me dice si la edad es correcta
        
        // Mientras la edad no sea válida, sigo pidiéndola
        while (!edadValida) {
            try {
                // Pido la edad por teclado
                System.out.println("Por favor, introduce tu edad: ");
                edad = entrada.nextInt(); // Intento leer un número
                
                // Verifico que la edad esté en un rango lógico
                if (edad < 0 || edad > 120) {
                    System.out.println("Error: La edad debe estar entre 0 y 120 años.");
                } else {
                    // Si todo está bien, cambio la variable para salir del bucle
                    edadValida = true;
                }
                
            } catch (Exception e) {
                // Esto se ejecuta si el usuario mete letras en vez de números
                System.out.println("Error: Debes introducir un número entero válido.");
                entrada.nextLine(); // Esto lo pongo para limpiar el buffer y que no se repita el error
            }
        }
        
        return edad; // Devuelvo la edad ya validada
    }
    
    // Este método recibe el nombre y la edad y decide si es mayor de edad
    public static void mayorDeEdad(String nombre, int edad) {
        // Uso un if simple para ver si tiene 18 o más años
        if (edad >= 18) {
            System.out.println("El usuario llamado " + nombre + " es mayor de edad.");
        } else {
            System.out.println("El usuario llamado " + nombre + " no es mayor de edad.");
        }
    }
}