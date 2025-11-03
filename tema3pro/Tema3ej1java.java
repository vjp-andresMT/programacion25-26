
package tema3java;
import java.util.Scanner; // importamos el scanner

/**
 *
 * @author andres
 */
// Implementa un algoritmo en JAVA que le pida al usuario un número por teclado. Posteriormente el programa le dirá al usuario
// si el número introducido es positivo o negativo.
// • Muestra por pantalla el resultado de la siguiente forma:
 // Por favor, introduzca un numero: xxx
// El número introducido es positivo o negativo
public class Tema3ej1java {

    
    public static void main(String[] args) {
        // Creamos el Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca un número
        System.out.print("Por favor, introduzca un numero: ");
        int numero = entrada.nextInt();
        
        // Verificamos si el número es positivo o negativo
        if (numero >= 0) {
            System.out.println("El número introducido es positivo");
        } else {
            System.out.println("El número introducido es negativo");
        }
        
       
    }
}
   
       

    

