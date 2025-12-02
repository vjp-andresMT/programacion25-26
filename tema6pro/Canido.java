package tema06;

/**
 *
 * @author andres
 */

    // Clase Canido (subclase de Animal)
abstract class Canido extends Animal {
    // Constructor que llama al constructor de Animal
    public Canido(String nombre, int edad, double peso) {
        super(nombre, edad, peso); // Llama al constructor de la clase padre
    }
}

