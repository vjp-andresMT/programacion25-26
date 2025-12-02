
package tema06;

/**
 *
 * @author andres
 */


// Clase Suma que hereda de Calculadora
class Suma extends Calculadora {
    private double sumando;
    
    public Suma(double numero, double sumando) {
        super(numero);
        this.sumando = sumando;
    }
    
    @Override
    public void realizarOperacion() {
        double resultado = numero + sumando;
        System.out.println("Suma: " + numero + " + " + sumando + " = " + resultado);
    }
}


