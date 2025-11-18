
package tema5java;

/**
 *
 * @author andres
 */
public class TestCurso {
    public class Test {
        public static void main(String[] args) {
        // Crear dos objetos de la clase Curso
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        // Establecer datos para curso1
        curso1.establecerNombreyHoras("Programación", 200);
        Curso.sumarCursos();

        // Establecer datos para curso2
        curso2.establecerNombreyHoras("Bases de Datos", 180);
        Curso.sumarCursos();

        // Mostrar datos de los cursos
        System.out.println("=== CURSO 1 ===");
        System.out.println("Nombre: " + curso1.obtenerNombre());
        System.out.println("Horas: " + curso1.obtenerHoras());

        System.out.println("=== CURSO 2 ===");
        System.out.println("Nombre: " + curso2.obtenerNombre());
        System.out.println("Horas: " + curso2.obtenerHoras());

        // Mostrar número total de cursos
        System.out.println("Número total de cursos: " + Curso.verNumeroCursos());
    }
}
}
