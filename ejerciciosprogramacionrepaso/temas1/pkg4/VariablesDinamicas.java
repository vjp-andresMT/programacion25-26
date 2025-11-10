
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */

public class VariablesDinamicas {
    
    public static void main(String[] args) {
        // Variables que cambian dinámicamente
        int contador = 0;
        double acumulador = 0.0;
        String historial = "";
        
        for (int i = 1; i<=5; i++){
            contador += i;
            acumulador += i * 1.5;
            historial += "Paso " + i + ": contador=" + contador +  
                    ", acumulador=" + acumulador + "\n";
        }
        System.out.println("Resultado final:");
        System.out.println("Contador: " + contador);
        System.out.println("Acumulador: " + acumulador);
        System.out.println("Historial:\n" + historial);
        
    }
}
