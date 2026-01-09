
package tema07;
import java.util.Scanner;

/**
 *
 * @author andres
 */

 //  Ejercicio 01.- Escribir un programa que contenga un
 //  método que pida al usuario 10 números enteros y los
 //  guarde en un array unidimensional. Luego, otro método,
 //  mostrará solo los números pares que contiene el array.

public class Ejercicio01 {

    
    public static void main(String[] args) {
      
        // Creo un array para almacenar 10 números
        int[] numeros = new int[10];
       
        // Llamo al método para pedir los números
        pedirNumeros(numeros);
      
        // Llamo al método para mostrar los pares
        mostrarPares(numeros);
    }
    
    // Método en el que pido 10 números al usuario
    public static void pedirNumeros(int[] array) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa 10 números enteros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        
    }
    
    // Método en el que muestro solo los números pares
    public static void mostrarPares(int[] array) {
        System.out.println("\nNúmeros pares ingresados:");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}


