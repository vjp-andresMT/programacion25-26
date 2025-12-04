
package tema06;

/**
 *
 * @author andres
 */

 

// 4. Clase principal con el método main para probar nuestro programa
public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA DE PERSONAS ===");
        System.out.println();
        
        // Crear un objeto Alumno
        // 'new' crea una nueva instancia (objeto) de la clase Alumno
        Alumno alumno1 = new Alumno("Carlos", "2ºA");
        
        // Crear un objeto Profesor
        Profesor profesor1 = new Profesor("Ana", "Matemáticas");
        
        // Crear otro Alumno
        Alumno alumno2 = new Alumno("María", "1ºB");
        
        // Crear otro Profesor
        Profesor profesor2 = new Profesor("Luis", "Historia");
        
        // Usar el método saludar() de cada objeto
        System.out.println("--- SALUDOS ---");
        System.out.println(alumno1.saludar());
        System.out.println(profesor1.saludar());
        System.out.println(alumno2.saludar());
        System.out.println(profesor2.saludar());
        
        System.out.println();
        
        // También podemos crear un arreglo de Personas
        // Esto es posible porque Alumno y Profesor SON tipos de Persona
        System.out.println("--- LISTA DE TODAS LAS PERSONAS ---");
        Persona[] personas = {alumno1, profesor1, alumno2, profesor2};
        
        // Recorremos el arreglo con un bucle for-each
        for (Persona persona : personas) {
            System.out.println(persona.saludar());
            // Aunque 'persona' es de tipo Persona, Java sabe qué versión
            // del método saludar() llamar (la de Alumno o la de Profesor)
            // Esto se llama POLIMORFISMO
        }
        
        System.out.println();
        System.out.println("=== FIN DEL PROGRAMA ===");
    }
}

