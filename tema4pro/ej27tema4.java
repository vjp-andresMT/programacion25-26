
package tema4java;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author andres
 */
public class ej27tema4 {

    
    public static void main(String[] args) {
        // Creo el objeto para leer lo que escriba el usuario
        Scanner entrada = new Scanner(System.in);
        // Creo el objeto para generar números aleatorios
        Random caraocruz = new Random();
        
        // Variable para saber si el usuario acertó
        boolean acertado = false;
        
        System.out.println("¡JUEGO DE CARA O CRUZ!");
        System.out.println("Tienes que adivinar si sale cara o cruz");
        
        // Mientras no acierte, sigo pidiendo
        while (!acertado) {
            // Pido al usuario que elija
            System.out.println("Elige (cara/cruz): ");
            String eleccionUsuario = entrada.nextLine().toLowerCase();
            
            // Verifico que haya elegido una opción válida
            if (!eleccionUsuario.equals("cara") && !eleccionUsuario.equals("cruz")) {
                System.out.println("Por favor, escribe solo 'cara' o 'cruz'");
                continue; // Vuelvo al inicio del bucle
            }
            
            // Genero un número aleatorio (0 = cara, 1 = cruz)
            int resultadoMoneda = caraocruz.nextInt(2);
            String resultadoTexto;
            
            // Convierto el número en texto
            if (resultadoMoneda == 0) {
                resultadoTexto = "cara";
            } else {
                resultadoTexto = "cruz";
            }
            
            // Muestro lo que salió
            System.out.println("Ha salido: " + resultadoTexto);
            
            // Compruebo si acertó
            if (eleccionUsuario.equals(resultadoTexto)) {
                System.out.println("¡ENHORABUENA! ¡Has acertado!");
                acertado = true; // Cambio la variable para salir del bucle
            } else {
                System.out.println("Has perdido... ¡Vuelve a intentarlo!");
            }
        }
        
        
    }
}

