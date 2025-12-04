package tema06;

/**
 *
 * @author alumno
 */

 
// 2. Clase Alumno que hereda de Persona
// 'extends' significa que Alumno es una clase hija de Persona
public class Alumno extends Persona {
    
    // Atributo específico de la clase Alumno
    private String grupo;
    
    // Constructor de Alumno
    // Usamos 'super' para llamar al constructor de la clase padre (Persona)
    public Alumno(String nombre, String grupo) {
        super(nombre); // Llama al constructor de Persona con el nombre
        this.grupo = grupo;
    }
    
    // Implementación del método abstracto saludar()
    // ¡Obligatorio implementarlo porque la clase padre lo declaró abstracto!
    @Override
    public String saludar() {
        return "Hola, soy el alumno " + nombre + " y estoy en el grupo de " + grupo;
    }
    
    // Método getter para el grupo
    public String getGrupo() {
        return grupo;
    }
}

