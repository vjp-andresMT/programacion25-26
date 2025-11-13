
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */

public class SaltoBasico {
    public static void main(String[] args) {
        // uso de break
        System.out.println("Break - para en 5:");
        for (int i = 1; i <=10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println("Numero: " + i);
            }
        // uso de continue
        System.out.println("\ncontinue - salta numeros pares:");
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println("numero impar: " + i);
        }
        // uso de return 
        System.out.println("\nAntes del return");
        return; //Termina el metodo main
        // System.out.println("Esto no se ejuta"); // error de compilacion
            }
        }
    
