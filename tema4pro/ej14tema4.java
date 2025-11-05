
package tema4java;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej14tema4 {
    


    
    public static void main(String[] args) {
        int numero = pedirNumero();
        calcularMultiplos(numero);
    }
    
    // Método para pedir el número con do-while
    public static int pedirNumero() {
        Scanner entrada= new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduce un número mayor que 0: ");
            numero = entrada.nextInt();
            
            if (numero <= 0) {
                System.out.println("Error! El número debe ser mayor que 0.");
            }
            
        } while (numero <= 0);
        
        return numero;
    }
    
    // Método para calcular y mostrar los múltiplos
    public static void calcularMultiplos(int numero) {
        int contador = 0;
        
        System.out.println("Múltiplos de 3 entre 1 y " + numero + ":");
        
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador = contador + 1;
            }
        }
        
        System.out.println("");
        System.out.println("Total de números mostrados: " + contador);
    }
}

