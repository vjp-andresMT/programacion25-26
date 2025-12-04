
package tema06;

/**
 *
 * @author andres
 */

   
// Clase base ABSTRACTA para todos los triángulos
// Debe ser abstracta porque tiene un método abstracto (calcularPerimetro())
public abstract class Triangulo extends FiguraGeometrica {
    
    // Atributos comunes a todos los triángulos
    protected double base;    // en centímetros
    protected double altura;  // en centímetros
    
    // Constructor
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    // Implementación del método para calcular el área
    // Área del triángulo = (base × altura) / 2
    // Este método es CONCRETO (tiene implementación)
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    // Método abstracto para el perímetro
    // Cada tipo de triángulo lo calcula diferente
    // NO tiene implementación aquí, solo la firma
    @Override
    public abstract double calcularPerimetro();
    
    // Getters y setters
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
}