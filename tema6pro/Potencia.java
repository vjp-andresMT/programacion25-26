
package tema06;

/**
 *
 * @author andres
 */

    // Clase Multiplicacion que hereda de Calculadora
class Potencia extends Calculadora {
    private double exponente;
    
    public Potencia(double numero, double exponente) {
        super(numero);
        this.exponente = exponente;
    }
    
    @Override
    public void realizarOperacion() {
        double resultado = Math.pow(numero, exponente);
        System.out.println("Potencia: " + numero + " ^ " + exponente + " = " + resultado);
    }
}
