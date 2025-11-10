
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */
public class SistemaConstantes {

    public static void main(String[] args) {
        // Constantes para configuración del sistema
        final int MAX_INTENTOS = 3;
        final double TASA_INTERES = 0.05;
        final int DIAS_GRACIA = 5;
        final String MONEDA = "EUR";
        
        // Simulación de sistema bancario
        double saldo = 1000.0;
        int intentosFallidos = 0;
        int diasRetraso = 3;
        
        System.out.println("Sistema Bancario - Moneda: " + MONEDA);
        System.out.println("Saldo inicial: " + saldo + MONEDA);
        
        // Calcular intereses por retraso
        if(diasRetraso > DIAS_GRACIA) {
            double intereses = saldo * TASA_INTERES;
            saldo += intereses;
            System.out.println("Intereses por retraso: " + intereses + MONEDA);
        }
        
        System.out.println("Saldo final: " + saldo + MONEDA);
        System.out.println("Máximo intentos permitidos: " + MAX_INTENTOS);
    }
}
