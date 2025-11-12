
package repasotema1.pkg2.pkg3.pkg4;

/**
 *
 * @author andres
 */

public class CastBasico {
    public static void main(String[] args) {
        double numeroDouble = 9.78;
        int numeroEntero = (int) numeroDouble; // Cast explicito
        
        System.out.println("Double original: " + numeroDouble);
        System.out.println("Entero después del cast: " + numeroEntero);
        
        // Cast implicito (promocion)
        int a = 10;
        double b = a; // Cast implicito de int a double
        System.out.println("int a double (implicito): " + b);
    } 
}
