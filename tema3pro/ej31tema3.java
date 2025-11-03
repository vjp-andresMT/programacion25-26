
package tema3java;

/**
 *
 * @author andres
 */
public class ej31tema3 {
 
    public static void main(String[] args) {
        int contadorImpares = 0;
        int totalNumerosGenerados = 0;
        int impar1 = 0;
        int impar2 = 0;
        int impar3 = 0;
        
        System.out.println("Generando números aleatorios hasta obtener 3 impares...");
        
        while (contadorImpares < 3) {
            // Generar número aleatorio entre 1 y 100
            int numero = (int) (Math.random() * 100) + 1;
            totalNumerosGenerados = totalNumerosGenerados + 1;
            
            System.out.println("Número generado: " + numero);
            
            // Verificar si es impar
            if (numero % 2 != 0) {
                contadorImpares = contadorImpares + 1;
                
                // Guardar el número impar
                if (contadorImpares == 1) {
                    impar1 = numero;
                } else if (contadorImpares == 2) {
                    impar2 = numero;
                } else if (contadorImpares == 3) {
                    impar3 = numero;
                }
                
                System.out.println("¡Encontrado impar #" + contadorImpares + "!");
            }
        }
        
        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Los tres números impares encontrados son:");
        System.out.println("1º: " + impar1);
        System.out.println("2º: " + impar2);
        System.out.println("3º: " + impar3);
        System.out.println("Total de números generados: " + totalNumerosGenerados);
    }
}

