
package tema3java;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej24tema3 {
   


    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int numero;
        int contador = 0;
        
        // Pedimos el número hasta que sea mayor que 0
        do {
            System.out.print("Introduce un número mayor que 0: ");
            numero = Entrada.nextInt();
            
            if (numero <= 0) {
                System.out.println("Error: El número debe ser mayor que 0.");
            }
        } while (numero <= 0);
        
        // Encontramos y mostramos los múltiplos de 3
        System.out.println("Los múltiplos de 3 entre 1 y " + numero + " son:");
        
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) { // Si el resto de dividir entre 3 es 0, es múltiplo
                System.out.println(i);
                contador++; // Aumentamos el contador
            }
        }
        
        // Mostramos el total
        System.out.println("El total de múltiplos de 3 mostrados es: " + contador);
        
    
    }
} 

