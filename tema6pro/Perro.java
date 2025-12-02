
package tema06;

/**
 *
 * @author andres
 */

class Perro extends Canido {
    // Constructor
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    // Implementación de los métodos abstractos
    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Ladrido");
    }
    
    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: Carnívora");
    }
    
    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: Doméstico");
    }
    
    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Canis lupus familiaris");
    }
}

