
package tema07;
import java.util.Scanner;

/**
 *
 * @author andres
 */
  // Ejercicio 02.- Realizar un programa que lea 7 números
 //  enteros y los introduzca en un array unidimensional.
 //  Luego muestras el array, intercambias los números que
 //  se encuentren en la 2ª y 4ª posición, y muestras el nuevo
 //  array por pantalla.
//   Utiliza al menos 3 métodos: uno para introducir los
//   datos, otro para mostrar los datos y otro para
//   intercambiar los datos.

public class Ejercicio02 {
  
    public static void main(String[] args) {
        // Creo un array para 7 números
        int[] numeros = new int[7];
        
        // Meto los datos
        introducirDatos(numeros);
        
        // Muestro el array original
        System.out.println("\nArray original:");
        mostrarDatos(numeros);
        
        // Intercambio 2ª y 4ª posición
        intercambiarPosiciones(numeros);
        
        // Muestro el array modificado
        System.out.println("\nArray después del intercambio:");
        mostrarDatos(numeros);
    }
    
    // Método para meter los datos
    public static void introducirDatos(int[] array) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa 7 números enteros:");
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
    }
    
    // Método para mostrar los datos
    public static void mostrarDatos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
    
    // Método para intercambiar 2ª y 4ª posición
    public static void intercambiarPosiciones(int[] array) {
        // Guardo el valor de la posición 2 (índice 1)
        int temporal = array[1];
        
        // Asigno el valor de la posición 4 (índice 3) a la posición 2
        array[1] = array[3];
        
        // Asigno el valor temporal (original de posición 2) a la posición 4
        array[3] = temporal;
    }
}



