
package mainej10tema4;

/**
 *
 * @author andres
 */
public class imprimirtablaej10tema4 {
   
    public static void imprimirtabla(int numero) {
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

