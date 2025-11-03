package tema3java;
import java.util.Scanner;
/**
 *
 * @author andres
 */
// Escribir un algoritmo en JAVA que pida tres
// números e imprima por pantalla el menor de ellos
  public class ej4tema3 {
  public static void main(String[]args) {
     
        Scanner scanner = new Scanner(System.in);
        
        // Pedir los tres números al usuario
        System.out.print("Por favor, introduzca el primer numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Por último, introduzca un tercer numero: ");
        int numero3 = scanner.nextInt();
        
        // Variable para guardar el número menor
        int menor;
        
        // Comparar los números para encontrar el menor
        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }
        
        // Mostrar el resultado
        System.out.println("El número menor de los introducidos es el " + menor);
        
    }
}
