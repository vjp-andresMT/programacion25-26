
package tema4java;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej8tema4 {
    


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedir los cuatro números
        System.out.println("Por favor, introduzca el primer numero: ");
        int a = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        int b = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        int c = entrada.nextInt();
        
        System.out.println("Por último, introduzca un cuarto numero: ");
        int d = entrada.nextInt();
        
        // Ordenar los números comparándolos de dos en dos
        // Vamos a asegurarnos de que a sea el más pequeño
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (a > d) {
            int temp = a;
            a = d;
            d = temp;
        }
        
        // Ahora asegurarnos de que b sea el segundo más pequeño
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (b > d) {
            int temp = b;
            b = d;
            d = temp;
        }
        
        // Finalmente, ordenar c y d
        if (c > d) {
            int temp = c;
            c = d;
            d = temp;
        }
        
        // Mostrar el resultado
        System.out.println("El orden de los números introducidos es el " + 
                          a + " - " + b + " - " + c + " - " + d);
    }
}

