
package tema06;

/**
 *
 * @author andres
 */

   
// Clase abstracta que será la base para todas nuestras figuras
// 'abstract' significa que no podemos crear objetos directamente de esta clase
public abstract class FiguraGeometrica {
    
    // Atributo común a todas las figuras
    protected String color;
    
    // Constructor - se ejecuta al crear un objeto de las clases hijas
    public FiguraGeometrica(String color) {
        this.color = color; // 'this' se refiere al atributo de la clase
    }
    
    // Métodos abstractos - las clases hijas DEBEN implementarlos
    public abstract double calcularArea();     // Para calcular el área
    public abstract double calcularPerimetro(); // Para calcular el perímetro
    
    // Métodos getter y setter (para acceder y modificar el color)
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Método concreto (no abstracto) que pueden usar todas las figuras
    public void mostrarColor() {
        System.out.println("Soy de color " + color);
    }
}

