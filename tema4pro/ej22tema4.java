
package tema4java;

/**
 *
 * @author andres
 */
public class ej22tema4 {
  
    
    public static void main(String[] args) {
        // Mostrar las constantes directamente
        System.out.println("Constante PI: " + Math.PI);
        System.out.println("Constante Euler: " + Math.E);
        
        // Usar el método que recibe números
        mostrarConNumeros(5, 10);
    }
    
    // Método que muestra resultados usando números recibidos
    public static void mostrarConNumeros(double numero1, double numero2) {
        System.out.println("Usando los números " + numero1 + " y " + numero2 + ":");
        System.out.println(numero1 + " * PI = " + numero1 * Math.PI);
        System.out.println(numero2 + " * Euler = " + numero2 * Math.E);
    }
}

