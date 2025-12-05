
package tema06;

/**
 *
 * @author andres
 */

    // Clase Test para probar el programa
public class Testej6 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DIRECTA DE LAS CLASES ===");
        
        // 1. Crear un objeto de la clase Libro
        System.out.println("\n--- Probando la clase Libro ---");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico");
        
        // Probar los métodos del libro
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Género: " + libro1.getGenero());
        System.out.println("Concatenar todo: " + libro1.concatenarTodo());
        System.out.println("Iniciales: " + libro1.obtenerIniciales());
        System.out.print("Contar vocales: ");
        libro1.contarVocales();
        System.out.println("Cadena más larga: " + libro1.obtenerCadenaMasLarga());
        System.out.println("Buscar 'García': " + libro1.buscarCadena("García"));
        System.out.println("Buscar 'Ficción': " + libro1.buscarCadena("Ficción"));
        
        // 2. Crear un objeto de la clase Persona
        System.out.println("\n--- Probando la clase Persona ---");
        Personaej6 persona1 = new Personaej6("María", "González Pérez", "Mary");
        
        // Probar los métodos de la persona
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellidos: " + persona1.getApellidos());
        System.out.println("Alias: " + persona1.getAlias());
        System.out.println("Concatenar todo: " + persona1.concatenarTodo());
        System.out.println("Iniciales: " + persona1.obtenerIniciales());
        System.out.print("Contar vocales: ");
        persona1.contarVocales();
        System.out.println("Cadena más larga: " + persona1.obtenerCadenaMasLarga());
        System.out.println("Buscar 'María': " + persona1.buscarCadena("María"));
        System.out.println("Buscar 'Juan': " + persona1.buscarCadena("Juan"));
        
        System.out.println("\n=== PRUEBA CON POLIMORFISMO (usando la interfaz) ===");
        
        // 3. Usar polimorfismo: crear objetos a partir de la interfaz Transformable
        System.out.println("\n--- Polimorfismo con Libro ---");
        Transformable transformable1 = new Libro("El principito", "Antoine de Saint-Exupéry", "Fábula");
        
        // Probar los métodos a través de la interfaz
        System.out.println("Concatenar todo: " + transformable1.concatenarTodo());
        System.out.println("Iniciales: " + transformable1.obtenerIniciales());
        System.out.print("Contar vocales: ");
        transformable1.contarVocales();
        System.out.println("Cadena más larga: " + transformable1.obtenerCadenaMasLarga());
        System.out.println("Buscar 'principito': " + transformable1.buscarCadena("principito"));
        System.out.println("Buscar 'Novela': " + transformable1.buscarCadena("Novela"));
        
        System.out.println("\n--- Polimorfismo con Persona ---");
        Transformable transformable2 = new Personaej6("Carlos", "López Rodríguez", "Carlitos");
        
        // Probar los métodos a través de la interfaz
        System.out.println("Concatenar todo: " + transformable2.concatenarTodo());
        System.out.println("Iniciales: " + transformable2.obtenerIniciales());
        System.out.print("Contar vocales: ");
        transformable2.contarVocales();
        System.out.println("Cadena más larga: " + transformable2.obtenerCadenaMasLarga());
        System.out.println("Buscar 'Carlos': " + transformable2.buscarCadena("Carlos"));
        System.out.println("Buscar 'Ana': " + transformable2.buscarCadena("Ana"));
        
        System.out.println("\n=== PRUEBA ADICIONAL CON ARRAY DE TRANSFORMABLES ===");
        
        // 4. Demostración adicional del polimorfismo
        Transformable[] transformables = new Transformable[3];
        transformables[0] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela");
        transformables[1] = new Personaej6("Ana", "Martínez Sánchez", "Anita");
        transformables[2] = new Libro("1984", "George Orwell", "Ciencia ficción");
        
        System.out.println("\n--- Recorriendo array de Transformables ---");
        for (int i = 0; i < transformables.length; i++) {
            System.out.println("\nElemento " + (i+1) + ":");
            System.out.println("Concatenar todo: " + transformables[i].concatenarTodo());
            System.out.println("Iniciales: " + transformables[i].obtenerIniciales());
            System.out.print("Contar vocales: ");
            transformables[i].contarVocales();
            System.out.println("Cadena más larga: " + transformables[i].obtenerCadenaMasLarga());
            System.out.println("Buscar 'de': " + transformables[i].buscarCadena("de"));
        }
    }
}

