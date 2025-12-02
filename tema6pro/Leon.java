package tema06;
/**
 *
 * @author andres
 */

// Clase Leon (subclase de Felino)
class Leon extends Felino {
    // Constructor
    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    // Implementación de los métodos abstractos
    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Rugido");
    }
    
    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: Carnívora");
    }
    
    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: Sabana");
    }
    
    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Panthera leo");
    }
}
