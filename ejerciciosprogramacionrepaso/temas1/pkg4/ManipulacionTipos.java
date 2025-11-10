
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */
public class ManipulacionTipos {
    
    public static void main(String[] args) {
  
        // Demostración de diferentes tipos primitivos
        byte byteVal = 127;
        short shortVal = 32000;
        int intVal = 2000000;
        long longVal = 9000000000L;
        float floatVal = 3.14159f;
        double doubleVal = 2.718281828459045;
        char charVal = 'Ω';
        boolean boolVal = false;
        // operaciones entre diferentes tipos
        double resultado1 = byteVal + doubleVal;
        float resultado2 = shortVal * floatVal;
        long resultado3 = intVal + longVal;
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        System.out.println("Carácter especial: " + charVal);
    }
}
