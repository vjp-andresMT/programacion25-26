
package tema06;

/**
 *
 * @author andres
 */

// 3. Clase Profesor que también hereda de Persona
public class Profesor extends Persona {
    
    // Atributo específico de la clase Profesor
    private String especialidad;
    
    // Constructor de Profesor
    public Profesor(String nombre, String especialidad) {
        super(nombre); // Llama al constructor de Persona
        this.especialidad = especialidad;
    }
    
    // Implementación del método abstracto saludar()
    @Override
    public String saludar() {
        return "Hola, soy el profesor " + nombre + " y soy de la especialidad de " + especialidad;
    }
    
    // Método getter para la especialidad
    public String getEspecialidad() {
        return especialidad;
    }
}

