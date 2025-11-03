
package tema3;
import java.util.Scanner;

/**
 *
 * @author andres
 */
// Diseña un programa en JAVA que lea tres números e
// imprima por pantalla el mayor de ellos.
// • Muestra por pantalla el resultado de la siguiente forma:
// Por favor, introduzca el primer numero: xxx
// Ahora, introduzca un segundo numero: xxx
// Por último, introduzca un tercer numero: xxx
//El número mayor de los introducidos es el xxx

public class ej3tema3 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los tres números al usuario
        System.out.print("Por favor, introduzca el primer numero: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();
        
        System.out.print("Por último, introduzca un tercer numero: ");
        int numero3 = entrada.nextInt();
        
        // Variable para guardar el número mayor
        int mayor;
        
        // Compararamos los números para encontrar el mayor
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }
        
        // Mostramos el resultado
        System.out.println("El número mayor de los introducidos es el " + mayor);
        
   
    }
}

