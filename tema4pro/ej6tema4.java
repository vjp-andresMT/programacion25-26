
package tema4;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej6tema4 {
    


    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la nota del alumno (0-10): ");
        int nota = entrada.nextInt();
        
        // Llamamos al método que evalúa la nota
        evaluarNota(nota);
        
      
    }
    
    public static void evaluarNota(int nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10");
        } else if (nota >= 0 && nota <= 4) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
    }
}

