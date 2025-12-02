package tema06;

/**
 *
 * @author andres
 */

    // Clase Lobo (subclase de Canido)
class Lobo extends Canido {
    // Constructor
    public Lobo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    // Implementación de los métodos abstractos
    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Aullido");
    }
    
    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: Carnívora");
    }
    
    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: Bosque");
    }
    
    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Canis lupus");
    }
}
