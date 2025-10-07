
package tema3java;
import java.util.Scanner; // importamos el scanner

/**
 *
 * @author andres
 */
// Crea un programa en JAVA en donde el usuario
// introduzca la nota de un alumno (número entero entre 0 y 10) y se
// escribirá su calificación según el valor de la nota ingresada:
// • 0 a 4 = Suspenso.
// • 5 a 6 = Bien.
// • 7 a 8 = Notable.
// • 9 a 10 = Sobresaliente.
// • Nota: Se le avisará al usuario de un error en caso de que la nota que
// nos introduzca no esté entre 0 y 10.

public class ej6tema3 {


    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca la nota
        System.out.print("Por favor, introduzca la nota del alumno 0 a 10: ");
        int nota = entrada.nextInt();
        
        // Verificamos si la nota está en el rango válido
        if (nota >= 0 && nota <= 10) {
            // Determinamos la calificación según la nota
            if (nota >= 0 && nota <= 4) {
                System.out.println("Suspenso");
            } else if (nota >= 5 && nota <= 6) {
                System.out.println("Bien");
            } else if (nota >= 7 && nota <= 8) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            // Mostramos mensaje de error si la nota no está entre 0 y 10
            System.out.println("Error: La nota debe estar entre 0 y 10");
        }
        
      
    }
}

