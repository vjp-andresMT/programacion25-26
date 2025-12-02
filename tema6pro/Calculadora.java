
package tema06;

/**
 *
 * @author andres
 */
   // Clase abstracta Calculadora
    abstract class Calculadora {
    // Atributo protegido (accesible por las subclases)
    protected double numero;
    
    // Constructor
    public Calculadora(double numero) {
        this.numero = numero;
    }
    
    // Método abstracto que las subclases deben implementar
    public abstract void realizarOperacion();
}
    
