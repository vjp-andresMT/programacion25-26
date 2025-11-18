
package tema5java;

/**
 *
 * @author Andres
 */
public class Curso {
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos = 0;

    // Métodos para establecer valores
    public void establecerNombreyHoras(String nombre, int horas) {
        this.nombre = nombre;
        this.numeroHoras = horas;
    }

    // Métodos para obtener valores
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerHoras() {
        return numeroHoras;
    }

    // Métodos estáticos
    public static void sumarCursos() {
        numeroDeCursos++;
    }

    public static int verNumeroCursos() {
        return numeroDeCursos;
    }
}

