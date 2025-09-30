
package ejjavatema2;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ejercicio25tema2 {
public static void main (String [] args) {

// creamos el scanner
 Scanner scanner =  new Scanner (System.in);
 // pedimos el primer numero al usuario
    System.out.println("Introduzca el primer numero");
    double numeroUno = scanner.nextDouble();
  // pedimos el segundo numero al usuario
    System.out.println("Introduzca el segundo numero");
    double numeroDos = scanner.nextDouble();
   // pedimos el tercer numero al usuario
    System.out.println("Introduzca el tercer numero");
    double numeroTres = scanner.nextDouble();
    
    // calculamos la suma de los numeros
    double suma = numeroUno + numeroDos + numeroTres;
    
    // calculamos el producto de los numeros
    double producto = numeroUno * numeroDos * numeroTres;
    
    System.out.println("la suma de los numeros introducidos es: " + suma);
    System.out.println("el producto de los numeros introducidos es: " + producto);
}
}
