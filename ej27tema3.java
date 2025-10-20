
package tema3java;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author andres
 */
public class ej27tema3 {
   


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedir los dos números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        
        int opcion;
        
        do {
            // Mostrar el menú
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1.- Sumar los números");
            System.out.println("2.- Restar los números");
            System.out.println("3.- Multiplicar los números");
            System.out.println("4.- Dividir los números");
            System.out.println("5.- Salir del programa");
            System.out.print("Elige una opción (1-5): ");
            
            opcion = entrada.nextInt();
            
            // Realizar la operación según la opción elegida
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                    
                case 2:
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                    
                case 3:
                    System.out.println("Resultado: " + num1 + " × " + num2 + " = " + (num1 * num2));
                    break;
                    
                case 4:
                    try {
                        if (num2 == 0) {
                            throw new ArithmeticException("División por cero");
                        }
                        System.out.println("Resultado: " + num1 + " ÷ " + num2 + " = " + (num1 / num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                    
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }
            
        } while (opcion != 5); // Repetir hasta que elija salir
        
        
    }
}

