
package repasotema1.pkg2.pkg3.pkg4;

/**
 *
 * @author andres
 */

public class PrioridadBasica {
    public static void main(String[] args) {
        int resultado1 = 2 + 3 * 4; // 14(multiplicacion primero)
        int resultado2 = (2 + 3) * 4; // 20 (parentesis primero)
        
        System.out.println("2 + 3 * 4 = " + resultado1);
        System.out.println("(2 + 3) * 4 = " + resultado2);
    }
}
