
package tema3java;

/**
 *
 * @author andres
 */
public class ej25tema3 {
   
    public static void main(String[] args) {
        int suma = 0;
        
        for (int numero = 17; numero <= 139; numero++) {
            if (numero % 2 == 0) {
                suma = suma + numero;
            }
        }
        
        System.out.println("La suma total de los números pares es: " + suma);
    }
} 

