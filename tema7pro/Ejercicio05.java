package tema07;
import java.util.Scanner;

/**
 * Ejercicio 05:
 * - Array bidimensional de 4 filas x 2 columnas.
 * - El usuario introduce los 8 números.
 * - Se muestra la matriz de forma ordenada.
 * - Se calculan y muestran: el número mayor, el menor y la suma total.
 * 
 * @author andres
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        // Creo la matriz de 4x2
        int[][] matriz = new int[4][2];
        
        // Pido al usuario que introduzca los valores
        introducirDatos(matriz);
        
        // Muestro la matriz de forma bonita
        System.out.println("\nMatriz introducida:");
        mostrarMatriz(matriz);
        
        // Calculo y muestro resultados
        System.out.println("\nResultados:");
        System.out.println("Número mayor: " + calcularMayor(matriz));
        System.out.println("Número menor: " + calcularMenor(matriz));
        System.out.println("Suma total: " + calcularSuma(matriz));
    }
    
    /**
     * Método para que el usuario introduzca los 8 números en la matriz.
     */
    public static void introducirDatos(int[][] matriz) {
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) { // 4 filas
            for (int j = 0; j < 2; j++) { // 2 columnas
                System.out.print("Introduce el número en la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }
    
    /**
     * Método para mostrar la matriz con un formato sencillo y ordenado.
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t hace una tabulación
            }
            System.out.println(); // salto de línea al final de cada fila
        }
    }
    
    /**
     * Método que devuelve el número mayor de la matriz.
     */
    public static int calcularMayor(int[][] matriz) {
        int mayor = matriz[0][0]; // empiezo asumiendo que el primer número es el mayor
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }
    
    /**
     * Método que devuelve el número menor de la matriz.
     */
    public static int calcularMenor(int[][] matriz) {
        int menor = matriz[0][0]; // empiezo con el primer número como el menor
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }
    
    /**
     * Método que devuelve la suma de todos los elementos de la matriz.
     */
    public static int calcularSuma(int[][] matriz) {
        int suma = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                suma = suma + matriz[i][j]; // voy sumando cada elemento
            }
        }
        return suma;
    }
}