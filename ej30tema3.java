
package tema3java;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author andres 
 */
public class ej30tema3 {
    


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Generar número aleatorio entre 1 y 100
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int numeroUsuario = 0;
        boolean adivinado = false;
        
        System.out.println("¡He generado un número entre 1 y 100!");
        System.out.println("¿Puedes adivinarlo?");
        
        // Bucle hasta que adivine
        while (!adivinado) {
            try {
                System.out.print("Introduce tu número: ");
                numeroUsuario = entrada.nextInt();
                intentos = intentos + 1;
                
                if (numeroUsuario < numeroSecreto) {
                    System.out.println("El número secreto es MAYOR que " + numeroUsuario);
                } else if (numeroUsuario > numeroSecreto) {
                    System.out.println("El número secreto es MENOR que " + numeroUsuario);
                } else {
                    System.out.println("¡FELICIDADES! ¡Has adivinado el número!");
                    System.out.println("El número secreto era: " + numeroSecreto);
                    System.out.println("Número de intentos: " + intentos);
                    adivinado = true;
                }
                
            } catch (InputMismatchException e) {
                // Si el usuario introduce algo que no es un número
                System.out.println("¡Error! Has introducido algo que no es un número.");
                intentos = intentos + 1; // Contamos el error como intento
                entrada.next(); // Limpiamos el buffer del scanner
                System.out.println("Este error cuenta como un intento. Llevas " + intentos + " intentos.");
            }
        }
        
    
    }
}
