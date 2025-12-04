
package tema06;

/**
 *
 * @author andres
 */

// 1. Primero creamos la clase abstracta Persona
// 'abstract' significa que no podemos crear objetos directamente de esta clase,
// pero otras clases pueden heredar de ella
public abstract class Persona {
    
    // Atributo para almacenar el nombre de la persona
    // 'protected' significa que las clases hijas pueden acceder a este atributo
    protected String nombre;
    
    // Constructor de la clase Persona
    // Se ejecuta automáticamente cuando creamos un objeto de tipo Persona (o de sus hijas)
    public Persona(String nombre) {
        this.nombre = nombre; // 'this.nombre' se refiere al atributo de la clase
    }
    
    // Método abstracto para saludar
    // 'abstract' significa que las clases hijas DEBEN implementar este método
    public abstract String saludar();
    
    // Método getter para obtener el nombre
    // Es una buena práctica tener métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }
}

