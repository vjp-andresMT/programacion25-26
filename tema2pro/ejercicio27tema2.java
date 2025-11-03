
package ejjavatema2;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ejercicio27tema2 {
public static void main(String[] args) {
    


    // Creamos el scanner para leer los datos del usuario
    
   Scanner scanner = new Scanner(System.in);
   // Pedimos al usuario un numero
    System.out.println("introduce un numero");
    int numeroIntroducido = scanner.nextInt();
    
    //  Calculamos el doble del numero introducido por el usuario
    int dobleNumero = numeroIntroducido * numeroIntroducido;
    
    // Calculamos el cubo del numero introducido por el usuario
    
    int cuboNumero = numeroIntroducido * numeroIntroducido * numeroIntroducido;
    
            
   
}
}
