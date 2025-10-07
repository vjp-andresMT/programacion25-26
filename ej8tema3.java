
package tema3java;
 import java.util.Scanner; //importamos el scanner

/**
 *
 * @author andres
 */
// Realiza un programa que dado un importe en euros nos indique número óptimo de billetes de 50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y
// de 1 euro. En caso de que NO haya billetes/monedas de algún tipo NO se mostrarán.
// • Por ejemplo:
// Por favor, indique una cantidad de dinero: 232
// 232 Euros se descomponen en:
// Billetes de 50: 4
// Billetes de 20: 1
// Billetes de 10: 1
// Monedas de 2 euros: 1
// En el tema anterior: 232 Euros se descomponen en 4 billetes de 50, 1 billetes de 20, 1 billetes de 10, 0 billetes de 5, 1 monedas de 2 euros y 0 monedas de 1 euro.
public class ej8tema3 {
   


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos la cantidad de dinero al usuario
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int cantidad = entrada.nextInt();
        
        System.out.println(cantidad + " Euros se descomponen en:");
        
        // Calculamos billetes de 50
        int billetes50 = cantidad / 50;
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }
        cantidad = cantidad % 50;  // Lo que sobra después de quitar los billetes de 50
        
        // Calculamos billetes de 20
        int billetes20 = cantidad / 20;
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }
        cantidad = cantidad % 20;  // Lo que sobra después de quitar los billetes de 20
        
        // Calculamos billetes de 10
        int billetes10 = cantidad / 10;
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }
        cantidad = cantidad % 10;  // Lo que sobra después de quitar los billetes de 10
        
        // Calculamos billetes de 5
        int billetes5 = cantidad / 5;
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        cantidad = cantidad % 5;  // Lo que sobra después de quitar los billetes de 5
        
        // Calculamos monedas de 2
        int monedas2 = cantidad / 2;
        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }
        cantidad = cantidad % 2;  // Lo que sobra después de quitar las monedas de 2
        
        // Calculamos monedas de 1
        int monedas1 = cantidad;
        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
        
      
    }
}

