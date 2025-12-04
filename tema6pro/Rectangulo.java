
package tema06;

/**
 *
 * @author andres
 */




public class Rectangulo extends FiguraGeometrica {
    
    // Atributos específicos del rectángulo
    private double base;    // en centímetros
    private double altura;  // en centímetros
    
    // Constructor
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    // Implementación del método para calcular el área
    // Área del rectángulo = base × altura
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    // Implementación del método para calcular el perímetro
    // Perímetro del rectángulo = 2 × (base + altura)
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
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