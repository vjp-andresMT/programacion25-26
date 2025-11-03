
package tema4;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class numerosentreunoej13 {
  


    
    public static void main(String[] args) {
        int numero = pedirNumero();
        mostrarResultado(numero);
    }
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("Introduce un número mayor que 1: ");
            num = entrada.nextInt();
            
            if (!esValido(num)) {
                System.out.println("Error: El número debe ser mayor que 1");
            }
            
        } while (!esValido(num));
        
  
        return num;
    }
    
    public static boolean esValido(int numero) {
        if (numero > 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void mostrarResultado(int numero) {
        System.out.println("Números entre 1 y " + numero + ":");
        
        for (int i = 2; i < numero; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println(); // Salto de línea al final
    }
}

