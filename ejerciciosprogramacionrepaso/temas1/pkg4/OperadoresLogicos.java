
package repasotema1.pkg2.pkg3.pkg4;

/**
 *
 * @author andres
 */

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        int edad = 25;
        boolean tieneLicencia = true;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR Y: " + (x || y));
        System.out.println("NOT x: " + (!x));
        
        // Operadores relacionales combinados
        boolean puedeConducir = (edad >= 18) && tieneLicencia;
        System.out.println("¿Puede conducir? " + puedeConducir);
        
        // operador ternario
        String resultado = (edad >= 18) ? "mayor de edad" : "menor de edad";
        System.out.println("estado: " + resultado);
    }
}
