package tema3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
// Realiza un programa en el que le solicites al usuario 2 números y, si el primer número introducido es mayor que 10, se
// multipliquen, y en caso contrario que se sumen. Muestra al usuario la
// operación realizada y el resultado.
// • Muestra por pantalla el resultado de la siguiente forma:
// Por favor, introduzca un numero: xxx
// Ahora, introduzca un segundo numero: xxx
// La operación que se realizó es suma o producto y el resultado es xxx
public class ej2tema3 {
public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        
        // Pedir el primer número al usuario
        System.out.print("Por favor, introduzca un numero: ");
        int numero1 = scanner.nextInt();
        
        // Pedir el segundo número al usuario
        System.out.print("Ahora, introduzca un segundo numero: ");
        int numero2 = scanner.nextInt();
        
        // Variable para guardar el resultado
        int resultado;
        // Variable para guardar el nombre de la operación
        String operacion;
        
        // Verificar si el primer número es mayor que 10
        if (numero1 > 10) {
            // Si es mayor que 10, multiplicamos
            resultado = numero1 * numero2;
            operacion = "producto";
        } else {
            // Si no es mayor que 10, sumamos
            resultado = numero1 + numero2;
            operacion = "suma";
        }
        
        // Mostrar el resultado
        System.out.println("La operación que se realizó es " + operacion + 
                          " y el resultado es " + resultado);
        
       
    }
}