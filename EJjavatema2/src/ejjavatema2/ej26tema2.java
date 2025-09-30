
package ejjavatema2;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej26tema2 {
    


    public static void main(String[] args) {
        // Creamos el lector para el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos el número de 4 cifras
        System.out.println("Por favor, introduzca un número de 4 cifras:");
        int numero = scanner.nextInt();
        
        // Separamos cada cifra usando división y módulo
        int primeraCifra = numero / 1000;
        int segundaCifra = (numero / 100) % 10;
        int terceraCifra = (numero / 10) % 10;
        int cuartaCifra = numero % 10;
        
        // Mostramos cada cifra por separado
        System.out.println("La primera cifra es: " + primeraCifra);
        System.out.println("La segunda cifra es: " + segundaCifra);
        System.out.println("La tercera cifra es: " + terceraCifra);
        System.out.println("La cuarta cifra es: " + cuartaCifra);
        
      
    }
}

