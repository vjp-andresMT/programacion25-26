
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */

public class BuclesBasicos {
    public static void main(String[] args) {
        // for simple
        System.out.println("contador 1 al 5:");
        for(int i = 1; i <= 5; i++) {
            System.out.println("numero: " + i);
        }
        // while simple
        System.out.println("\ncontador regresivo 5 al 1:");
        int j = 5;
        while (j > 0) {
            System.out.println("numero: " + j);
            j--;
        }
        // Do-While
        System.out.println("\ndo-while (ejecuta al menos una vez):");
        int k = 10;
        do {
            System.out.println("numero: " + k);
            k++;
        } while(k < 5);
    }
}
        
    

