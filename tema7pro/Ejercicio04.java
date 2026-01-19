package tema07;
import java.util.Random;

/**
 * Ejercicio 04: 
 * - Crear un array bidimensional de 4x3 (4 filas, 3 columnas).
 * - Llenarlo con números aleatorios entre 100 y 200 (incluidos).
 * - Mostrar solo los números pares del array.
 * 
 * @author andres
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        // Creo el array de 4 filas y 3 columnas
        int[][] matriz = new int[4][3];
        
        // Lleno la matriz con números aleatorios
        llenarMatriz(matriz);
        
        // Muestro solo los números pares
        System.out.println("Números pares en la matriz:");
        mostrarPares(matriz);
    }
    
    /**
     * Llena la matriz con números aleatorios entre 100 y 200. */
    
    public static void llenarMatriz(int[][] matriz) {
        Random rand = new Random();
        
        for (int i = 0; i < matriz.length; i++) { // recorro filas
            for (int j = 0; j < matriz[i].length; j++) { // recorro columnas
                
                matriz[i][j] = rand.nextInt(101) + 100; // ahora sí: 100 a 200 inclusive
            }
        }
    }
    
    /**
     * Muestra solo los números pares de la matriz.
     */
    public static void mostrarPares(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Compruebo si el número es par usando el módulo
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println(); // salto de línea al final
    }
}