
package tema3java;

/**
 *
 * @author andres
 */
public class ej28tema3 {
   
    public static void main(String[] args) {
        // Generar número aleatorio entre 1 y 100
        double aleatorio = Math.random() * 100;
        aleatorio = Math.floor(aleatorio);
        int numero = (int) aleatorio + 1;
        
        // Mostrar el número generado
        System.out.println("El número aleatorio es: " + numero);
        
        // Determinar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR");
        } else {
            System.out.println("El número " + numero + " es IMPAR");
        }
    }
}
