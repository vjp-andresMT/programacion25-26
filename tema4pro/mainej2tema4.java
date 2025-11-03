
package tema4;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class mainej2tema4 {
    


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ej2tema4OperacionesMatematicas operaciones = new ej2tema4OperacionesMatematicas();
        
        // Solicitar los números al usuario
        System.out.println("Por favor, introduzca un numero: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();
        
        int resultado;
        String operacion;
        
        // Verificar si el primer número es mayor que 10
        if (numero1 > 10) {
            // Llamar al método de multiplicación
            resultado = operaciones.multiplicar(numero1, numero2);
            operacion = "producto";
        } else {
            // Llamar al método de suma
            resultado = operaciones.sumar(numero1, numero2);
            operacion = "suma";
        }
        
        // Mostrar el resultado
        System.out.println("La operación que se realizó es " + operacion + 
                         " y el resultado es " + resultado);
    
    }
}

