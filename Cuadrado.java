
package tema06;

/**
 *
 * @author andres
 */


// El cuadrado es un caso especial de rectángulo
// Podría heredar de Rectangulo, pero por seguir el ejercicio lo haremos directo de FiguraGeometrica
public class Cuadrado extends FiguraGeometrica {
    
    // Atributo específico del cuadrado
    private double lado; // en centímetros
    
    // Constructor
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }
    
    // Implementación del método para calcular el área
    // Área del cuadrado = lado × lado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    // Implementación del método para calcular el perímetro
    // Perímetro del cuadrado = 4 × lado
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    // Getter y setter
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
}

