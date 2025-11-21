
package tema5java;
 

/**
 *
 * @author andres
 */

   

// Clase Alumno
class Alumno {
    private String nombre;
    private int nota;
    
    // Constructor
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        setNota(nota); // Usamos el setter para validar
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getNota() {
        return nota;
    }
    
    // Setter con validación
    public void setNota(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("ERROR: La nota debe estar entre 0 y 10");
            this.nota = -1; // Valor para indicar error
        }
    }
    
    // Método para obtener calificación
    public String obtenerCalificacion() {
        if (nota == -1) {
            return "NOTA INVÁLIDA";
        } else if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota >= 5 && nota <= 6) {
            return "Bien";
        } else if (nota >= 7 && nota <= 8) {
            return "Notable";
        } else if (nota >= 9 && nota <= 10) {
            return "Sobresaliente";
        } else {
            return "ERROR";
        }
    }
    
    // Método para mostrar información completa
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + (nota == -1 ? "ERROR" : nota));
        System.out.println("Calificación: " + obtenerCalificacion());
    }
    
    // Método para ver si está aprobado
    public boolean estaAprobado() {
        return nota >= 5 && nota <= 10;
    }
    
    // Método para obtener mensaje personalizado
    public String getMensaje() {
        if (nota == -1) {
            return nombre + " tiene una nota inválida";
        } else if (estaAprobado()) {
            return "¡Felicidades " + nombre + "! Has aprobado con " + obtenerCalificacion();
        } else {
            return nombre + ", necesitas estudiar más. Tienes " + obtenerCalificacion();
        }
    }
}


