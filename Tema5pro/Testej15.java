
package tema5java;

/**
 *
 * @author andres
 */

    // Clase Test para probar el sistema
public class Testej15 {
    public static void main(String[] args) {
        // Crear 3 direcciones
        Direccion dir1 = new Direccion("calle del pilar", "4", "2ºB", "Plasencia");
        Direccion dir2 = new Direccion("avenida alemania", "7", "1ºA", "Cáceres");
        Direccion dir3 = new Direccion("Calle flor", "10", "4ºD", "Badajoz");
        
        // Crear 3 empleados con sus direcciones
        Empleado emp1 = new Empleado("pepe martin", 30000, dir1);
        Empleado emp2 = new Empleado("andres gomez", 35000, dir2);
        Empleado emp3 = new Empleado("jorge mohedano", 32000, dir3);
        
        // Mostrar datos de los empleados
        mostrarEmpleado(emp1, 1);
        mostrarEmpleado(emp2, 2);
        mostrarEmpleado(emp3, 3);
    }
    
    // Método para mostrar los datos de un empleado
    public static void mostrarEmpleado(Empleado emp, int numeroEmpleado) {
        System.out.println("EMPLEADO " + numeroEmpleado + ":");
        System.out.println("Nombre: " + emp.nombre);
        System.out.println("Salario: " + emp.salario + "€");
        System.out.println("\nDirección:");
        System.out.println("Calle: " + emp.direccion.calle);
        System.out.println("Número: " + emp.direccion.numero);
        System.out.println("Puerta: " + emp.direccion.piso);
        System.out.println("Ciudad: " + emp.direccion.ciudad);
        System.out.println("\n" + "=".repeat(30) + "\n");
    }
}

