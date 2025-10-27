
package tema4java;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej1tema4 {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        int numero = entrada.nextInt();
        
        String resultado = comprobarNumero(numero);
        System.out.println("El número introducido es " + resultado);
    }
    
    public static String comprobarNumero(int num) {
        if (num >= 0) {
            return "positivo";
        } else {
            return "negativo";
        }
    }
}

