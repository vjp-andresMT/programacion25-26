
package ejjavatema2;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej32tema2 {
   


    public static void main(String[] args) {
        // Creamos el lector para el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos la cantidad de dinero
        System.out.println("Por favor, indique una cantidad de dinero:");
        int dinero = scanner.nextInt();
        
        // Calculamos los billetes de 50
        int billetes50 = dinero / 50;
        int resto = dinero % 50;
        
        // Calculamos los billetes de 20
        int billetes20 = resto / 20;
        resto = resto % 20;
        
        // Calculamos los billetes de 10
        int billetes10 = resto / 10;
        resto = resto % 10;
        
        // Calculamos los billetes de 5
        int billetes5 = resto / 5;
        resto = resto % 5;
        
        // Calculamos las monedas de 2
        int monedas2 = resto / 2;
        
        // Las monedas de 1 son lo que sobra
        int monedas1 = resto % 2;
        
        // Mostramos el resultado
        System.out.println(dinero + " Euros se descomponen en " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros y " + monedas1 + " monedas de 1 euro.");
        
      
    }
}

