
package mainej10tema4;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class pedirnumeroej10tema4 {
   

    public static int pedirnumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
        int numero = entrada.nextInt();
        return numero;
    }
}

