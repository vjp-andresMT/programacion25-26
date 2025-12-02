package tema06;

/**
 *
 * @author andres
 */

    // Clase Felino (subclase de Animal)
abstract class Felino extends Animal {
    // Constructor que llama al constructor de Animal
    public Felino(String nombre, int edad, double peso) {
        super(nombre, edad, peso); // Llama al constructor de la clase padre
    }
}

