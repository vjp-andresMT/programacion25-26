
package tema4java;
 import java.util.Scanner;


/**
 *
 * @author andres
 */
public class JuegoAdivinarletraej17 {
   
public class JuegoAdivinarLetra {
    
    public static char generarLetraAleatoria() {
        // Genera un número entre 97 y 122 (códigos ASCII de 'a' a 'z')
        int codigoAscii = (int)(Math.random() * 26) + 97;
        return (char)codigoAscii;
    }
    
    public static char pedirLetra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adivina la letra (a-z): ");
        char letra = scanner.nextLine().charAt(0);
        return letra;
    }
    
    public static void jugar() {
        char letraSecreta = generarLetraAleatoria();
        int intentos = 0;
        boolean adivinado = false;
        
        System.out.println("¡He pensado en una letra minúscula! Adivínala.");
        
        while (!adivinado) {
            char letraUsuario = pedirLetra();
            intentos++;
            
            if (letraUsuario == letraSecreta) {
                adivinado = true;
                System.out.println("¡Correcto! Has adivinado en " + intentos + " intentos.");
            } else if (letraUsuario < letraSecreta) {
                System.out.println("La letra que buscas está DESPUÉS en el alfabeto.");
            } else {
                System.out.println("La letra que buscas está ANTES en el alfabeto.");
            }
        }
    }
}
}
