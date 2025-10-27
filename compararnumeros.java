
package utilidades;

/**
 *
 * @author andres
 */
public class compararnumeros {
    


    public static void encontrarMayor(int num1, int num2, int num3) {
        int mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El número mayor de los introducidos es el " + mayor);
    }
}

