
package tema3java;

/**
 *
 * @author andres
 */
public class ej14tema3 {
  
    public static void main(String[] args) {
        int contador = 0; // Contador de números pares encontrados
        int numero = 2;   // Empezamos con el primer número par
        
        while (contador < 100) { // Repetimos hasta tener 100 números pares
            System.out.println(numero);
            numero = numero + 2; // Pasamos al siguiente número par
            contador++; // Aumentamos el contador
        }
    }
}

