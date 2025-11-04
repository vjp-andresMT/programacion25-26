package tema4;

/**
 *
 * @author alumno
 */
public class ej26tema4 {
  
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        int i = 2;
        while (i < numero) {
            if (numero % i == 0) {
                return false;
            }
            i++;
        }
        
        return true;
    }
}

