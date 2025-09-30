
package ejjavatema2;
import java.util.Scanner;

/**
 *
 * @author andres 
 */
public class ej24tema2 {
    
    public static void main(String[] args) {
        // Creamos el lector para el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos las 6 notas una por una
        System.out.println("Por favor, introduzca la nota de Programación:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Introduzca la nota de Lenguajes de Marcas:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Introduzca la nota de Bases de Datos:");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Introduzca la nota de Entornos de Desarrollo:");
        double nota4 = scanner.nextDouble();
        
        System.out.println("Introduzca la nota de Sistemas Informáticos:");
        double nota5 = scanner.nextDouble();
        
        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral:");
        double nota6 = scanner.nextDouble();
        
        // Calculamos la media (sumamos todas y dividimos entre 6)
        double suma = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;
        double media = suma / 6;
        
        // Mostramos el resultado
        System.out.println("Su nota media del curso es de: " + media);
        
        
    }
}

