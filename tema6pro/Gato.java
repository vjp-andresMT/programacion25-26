package tema06;

/**
 *
 * @author andres
 */

// Clase Gato (subclase de Felino)
class Gato extends Felino {
    // Constructor
    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    // Implementación de los métodos abstractos
    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Maullido");
    }
    
    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: Ratones");
    }
    
    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: Doméstico");
    }
    
    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Felis silvestris catus");
    }
}


        

    

