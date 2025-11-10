
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */

public class IntercambioVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("antes - a " + a + ", b: " + b);
        //Intercambiar valores
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Después - a: " + a + ", b: " + b);
    }
}
