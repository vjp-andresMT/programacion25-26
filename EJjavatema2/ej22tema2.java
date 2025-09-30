
package ejjavatema2;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej22tema2 {
 
    public static void main(String[] args) {
        // Creamos el lector para el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos el lado del triángulo
        System.out.println("Por favor, introduzca la medida de un lado:");
        double lado = scanner.nextDouble();
        
        // Calculamos el perímetro (es muy fácil: 3 veces el lado)
        double perimetro = 3 * lado;
        
        // Calculamos el área (esta es la fórmula que me sé)
        double area = (1.732 / 4) * lado * lado;
        
        // Mostramos los resultados
        System.out.println("El área de un triángulo de lado: " + lado + " es: " + area);
        System.out.println("El perímetro de un triángulo de lado: " + lado + " es: " + perimetro);
        
       
    }
}

