
package tema4;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej21tema4 {
    

    public static void main(String[] args) {
        int numero1 = pedirPrimerNumero();
        int numero2 = pedirSegundoNumero(numero1);
        int suma = calcularSumaPares(numero1, numero2);
        mostrarResultado(numero1, numero2, suma);
    }
    
    public static int pedirPrimerNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int numero = entrada.nextInt();
        return numero;
    }
    
    public static int pedirSegundoNumero(int primerNumero) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introduce el segundo número (mayor que " + primerNumero + "): ");
            numero = entrada.nextInt();
            
            if (numero <= primerNumero) {
                System.out.println("Error: El segundo número debe ser mayor que " + primerNumero);
            }
            
        } while (numero <= primerNumero);
        
        return numero;
    }
    
    public static int calcularSumaPares(int num1, int num2) {
        int suma = 0;
        
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        
        return suma;
    }
    
    public static void mostrarResultado(int num1, int num2, int suma) {
        System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + suma);
    }
}

