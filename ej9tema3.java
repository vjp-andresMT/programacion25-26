
package tema3java;
import java.util.Scanner;

/**
 *
 * @author andres
 */
// Escribe un programa en JAVA en el que el usuario introduzca cuatro números enteros y luego el programa los muestre
// por pantalla ordenados de forma creciente.(de menor a mayor)
// • Muestra por pantalla el resultado de la siguiente forma:
// Por favor, introduzca el primer numero: 8
// Ahora, introduzca un segundo numero: 5
// Introduzca el tercer numero: 9
// Por último, introduzca un cuarto numero: 1
// El orden de los números introducidos es el 1 - 5 - 8 - 9
public class ej9tema3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir los cuatro números al usuario
        System.out.print("Por favor, introduzca el primer numero: ");
        int a = scanner.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        int b = scanner.nextInt();
        
        System.out.print("Introduzca el tercer numero: ");
        int c = scanner.nextInt();
        
        System.out.print("Por último, introduzca un cuarto numero: ");
        int d = scanner.nextInt();
        
        // Variable temporal para hacer intercambios
        int temp;
        
        // Primera pasada - comparamos de izquierda a derecha
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        
        if (c > d) {
            temp = c;
            c = d;
            d = temp;
        }
        
        // Segunda pasada - volvemos a comparar
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        
        // Tercera pasada - una última comparación
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        // Mostrar el resultado
        System.out.println("El orden de los números introducidos es el " + 
                          a + " - " + b + " - " + c + " - " + d);
        
        
    }
}