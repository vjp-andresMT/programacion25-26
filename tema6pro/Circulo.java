
package tema06;

/**
 *
 * @author andres
 */

   
// La clase Circulo hereda de FiguraGeometrica
public class Circulo extends FiguraGeometrica {
    
    // Atributo específico del círculo
    private double radio; // en centímetros
    
    // Constructor
    public Circulo(String color, double radio) {
        super(color); // Llama al constructor de la clase padre
        this.radio = radio;
    }
    
    // Implementación del método para calcular el área
    // Área del círculo = π × r²
    @Override // Indica que sobrescribimos un método de la clase padre
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    // Implementación del método para calcular el perímetro
    // Perímetro del círculo = 2 × π × r
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    // Método getter para el radio
    public double getRadio() {
        return radio;
    }
    
    // Método setter para el radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

