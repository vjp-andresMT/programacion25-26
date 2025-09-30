
package ejjavatema2;

/**
 *
 * @author andres
 */
public class ej16tema2 {
     public static void main(String[] args) {
      // Paso 1: Declarar la variable con el total de dinero
        int totalEuros = 130;
       
        // Paso 2: Calcular cuántos billetes de 50 euros caben
        int billetes50 = totalEuros / 50;
       
        // Paso 3: Calcular el dinero que sobra después de quitar los billetes de 50
        int dineroRestante = totalEuros % 50;
       
        // Paso 4: Calcular cuántos billetes de 10 euros caben con el dinero restante
        int billetes10 = dineroRestante / 10;
       
        // Paso 5: Mostrar el resultado por pantalla
        System.out.println("130 euros hacen un total de: " + billetes50 + " billetes de 50 euros y " + billetes10 + " billetes de 10 euros.");
    }
}

