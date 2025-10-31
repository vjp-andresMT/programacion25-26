
package ej9tema4;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Ej9tema4 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedir tres números al usuario
        System.out.println("Ingresa el primer número: ");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Ingresa el segundo número: ");
        double numero2 = entrada.nextDouble();
        
        System.out.println("Ingresa el tercer número: ");
        double numero3 = entrada.nextDouble();
        
        // Llamar al método de la otra clase para encontrar el menor
        operacionesjavaej9tema4.encontrarMenor(numero1, numero2, numero3);
        
    
    }
}
    
    

