
package tema3java;

/**
 *
 * @author andres
 */
public class ej26tema3 {
    
    public static void main(String[] args) {
        int suma = 0;
        
        for (int numero = 111; numero <= 222; numero++) {
            if (numero % 2 != 0) {
                suma = suma + numero;
            }
        }
        
        System.out.println("La suma total de los números impares es: " + suma);
    }
}

