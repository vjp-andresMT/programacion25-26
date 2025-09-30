
package ejjavatema2;

/**
 *
 * @author andres
 */
public class ej13tema2 {
    public static void main(String[] args) {
     // Paso 1: Declarar las dos variables con sus valores iniciales
        int numa = 1;
        int numb = 2;
       
        // Paso 2: Mostrar los valores antes del intercambio
        System.out.println("La variable numa contiene el valor " + numa + " y la variable numb contiene el valor " + numb + ".");
       
        // Paso 3: Intercambiar los valores usando una variable temporal
        // Es como cuando intercambiamos líquidos entre dos vasos, necesitamos un tercer vaso
        int temporal = numa;   // Guardamos el valor de numa en temporal (temporal = 1)
        numa = numb;           // Ahora asignamos el valor de numb a numa (numa = 2)
        numb = temporal;       // Finalmente asignamos el valor guardado a numb (numb = 1)
       
        // Paso 4: Mostrar los valores después del intercambio
        System.out.println("Ahora, la variable numa contiene el valor " + numa + " y la variable numb contiene el valor " + numb + ".");
    }
}


