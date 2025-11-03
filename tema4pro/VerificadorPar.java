
package utilidades;

/**
 *
 * @author andres
 */
public class VerificadorPar {
    
    public static String comprobarParImpar(int numero) {
        if (numero % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }
}

