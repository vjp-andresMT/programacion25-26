
package ej9tema4;

/**
 *
 * @author alumno
 */
public class operacionesjavaej9tema4 {
   
    
    // Método que recibe tres números y muestra el menor
    public static void encontrarMenor(double a, double b, double c) {
        double menor;
        
        // Encontrar el número menor
        if (a <= b && a <= c) {
            menor = a;
        } else if (b <= a && b <= c) {
            menor = b;
        } else {
            menor = c;
        }
        
        // Mostrar el resultado
        System.out.println("El número menor es: " + menor);
    }
}

