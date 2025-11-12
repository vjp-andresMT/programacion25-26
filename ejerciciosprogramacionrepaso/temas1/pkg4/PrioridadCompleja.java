
package repasotema1.pkg2.pkg3.pkg4;

/**
 *
 * @author andres
 */

public class PrioridadCompleja {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2;
        
        // Expresión compleja con multiples operadores
        int resultado = a + b * c / 2 - 1; // 5 + (3*2)/2 -1 = 5 + 3 - 1 = 7
        int resultadoConParentesis = (a + b) * c / (2 - 1); // 8 * 2 / 1 = 16
        
        boolean expresionLogica = a > b && c < a || b == 3; // true && true || true = true
        System.out.println("Sin parentesis: " + resultado);
        System.out.println("Con Parentesis: " + resultadoConParentesis);
        System.out.println("Expresión Lógica: " + expresionLogica);
    }
}
