
package utilidades;
import java.util.Scanner;
import utilidades.VerificadorPar;

/**
 *
 * @author andreS
 */
public class VerificarParImpar {
  


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un numero: ");
        int numero = entrada.nextInt();
        
        String resultado = VerificadorPar.comprobarParImpar(numero);
        System.out.println("El número introducido es " + resultado);
    }
}

