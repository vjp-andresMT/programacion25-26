
package tema5java;
import java.util.Scanner;

/**
 *
 * @author andres
 */

    // Clase Test principal
public class Test {
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Creamos 3 alumnos
        Alumno[] alumnos = new Alumno[3];
        
        // Solicitamos datos para cada alumno
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- ALUMNO " + (i + 1) + " ---");
            alumnos[i] = crearAlumno();
        }
        
        // Mostramos resultados
        mostrarResultados(alumnos);
        
      
    
    // Método para crear un alumno pidiendo datos al usuario
 
    public static Alumno crearAlumno() {
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Introduce la nota (0-10): ");
        int nota = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer
        
        return new Alumno(nombre, nota);
    }
    
    // Método para mostrar todos los resultados
    public static void mostrarResultados(Alumno[] alumnos) {
        System.out.println("\n=== RESULTADOS FINALES ===");
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("\n--- ALUMNO " + (i + 1) + " ---");
            alumnos[i].mostrarInformacion();
            System.out.println("Mensaje: " + alumnos[i].getMensaje());
            
            if (alumnos[i].estaAprobado()) {
                System.out.println(" Estado: APROBADO");
            } else if (alumnos[i].getNota() != -1) {
                System.out.println(" Estado: SUSPENDIDO");
            } else {
                System.out.println("️  Estado: ERROR EN NOTA");
            }
        }
        
        // Estadísticas adicionales
        mostrarEstadisticas(alumnos);
    }
    
    // Método para mostrar estadísticas
    public static void mostrarEstadisticas(Alumno[] alumnos) {
        System.out.println("\n=== ESTADÍSTICAS ===");
        int aprobados = 0;
        int suspendidos = 0;
        int errores = 0;
        
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() == -1) {
                errores++;
            } else if (alumno.estaAprobado()) {
                aprobados++;
            } else {
                suspendidos++;
            }
        }
        
        System.out.println("Total alumnos: " + alumnos.length);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);
        System.out.println("Errores: " + errores);
    }
}

