package tema06;


/**
 *
 * @author andres
 */

// Clase abstracta Animal (clase raíz)
abstract class Animal {
    // Atributos protegidos (accesibles por las subclases)
    protected String nombre;
    protected int edad;
    protected double peso;
    
    // Constructor de la clase Animal
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    // Métodos abstractos (deben ser implementados por las subclases)
    public abstract void mostrarSonido();
    public abstract void mostrarAlimentacion();
    public abstract void mostrarHabitat();
    public abstract void mostrarNombreCientifico();
    
    // Método concreto para mostrar información básica
    public void mostrarInfoBasica() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
    }
}





    
   


