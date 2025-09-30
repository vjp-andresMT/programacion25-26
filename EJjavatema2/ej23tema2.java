
package ejjavatema2;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej23tema2 {
    
    public static void main(String[] args) {
        // Creamos el lector para el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos el precio del producto
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar:");
        double precio = scanner.nextDouble();
        
        // Pedimos cuántas unidades quiere
        System.out.println("¿Cuántas unidades quiere llevarse?");
        int unidades = scanner.nextInt();
        
        // Calculamos el total (precio × unidades)
        double total = precio * unidades;
        
        // Mostramos el resultado
        System.out.println("El precio total de su compra es de: " + total + " Euros.");
        
       
    }
}

