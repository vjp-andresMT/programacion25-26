
package tema3java;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej15tema3 {



    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        int numero = Entrada.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
     
    }
}

