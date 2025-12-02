
package tema06;

/**
 *
 * @author andres
 */

    // Clase Multiplicacion que hereda de Calculadora
class Multiplicacion extends Calculadora {
    private double multiplicador;
    
    public Multiplicacion(double numero, double multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }
    
    @Override
    public void realizarOperacion() {
        double resultado = numero * multiplicador;
        System.out.println("Multiplicación: " + numero + " × " + multiplicador + " = " + resultado);
    }
}


