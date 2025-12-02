package tema06;

/**
 *
 * @author andres
 */
public class Test {
    
         public static void main(String[] args) {
        System.out.println("=== CREACIÓN DIRECTA DE OBJETOS ===");
        
        // Crear objetos directamente de cada clase
        Perro perro = new Perro("Bruno", 1, 15.5);
        Lobo lobo = new Lobo("Lobo", 3, 40.0);
        Leon leon = new Leon("Scar", 7, 250.0);
        Gato gato = new Gato("Lucas", 4, 6.5);
        
        // Mostrar información de cada animal
        mostrarAnimal(perro, "PERRO");
        mostrarAnimal(lobo, "LOBO");
        mostrarAnimal(leon, "LEÓN");
        mostrarAnimal(gato, "GATO");
        
        System.out.println("\n=== POLIMORFISMO CON CLASE ANIMAL ===");
        
        // Crear objetos usando polimorfismo (todos como tipo Animal)
        Animal animal1 = new Perro("Teo", 7, 12.0);
        Animal animal2 = new Lobo("Berlin", 8, 45.0);
        Animal animal3 = new Leon("Calamardo", 5, 220.0);
        Animal animal4 = new Gato("Don Gato", 4, 9.0);
        
        // Probar los métodos con polimorfismo
        mostrarAnimal(animal1, "PERRO (POLIMORFISMO)");
        mostrarAnimal(animal2, "LOBO (POLIMORFISMO)");
        mostrarAnimal(animal3, "LEÓN (POLIMORFISMO)");
        mostrarAnimal(animal4, "GATO (POLIMORFISMO)");
    }
    
    // Método para mostrar información de cualquier animal
    public static void mostrarAnimal(Animal animal, String tipo) {
        System.out.println("\n--- " + tipo + " ---");
        animal.mostrarInfoBasica();
        animal.mostrarSonido();
        animal.mostrarAlimentacion();
        animal.mostrarHabitat();
        animal.mostrarNombreCientifico();
    }
}
            
        
        
        
    

