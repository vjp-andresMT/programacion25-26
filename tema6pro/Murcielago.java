
package tema06;

/**
 *
 * @author andres
 */
// Clase Murcielago que hereda de Mamifero e implementa Volador
class Murcielago extends Mamifero implements Volador {
    private int alturaVuelo;  // Atributo específico del murciélago (en metros)
    
    // Constructor
    public Murcielago(String nombre, String sexo, String color, int edad, int alturaVuelo) {
        super(nombre, sexo, color, edad);  // Llama al constructor de Mamifero
        this.alturaVuelo = alturaVuelo;
    }



// Implementación de métodos de la interfaz Volador
    @Override
    public String obtenerMensajeVolador() {
        return "El murciélago es un animal volador";
    }
    
    @Override
    public void aumentarAlturaVuelo() {
        alturaVuelo += 5;  // Aumenta la altura en 5 metros
        System.out.println(nombre + " ha subido 5 metros. Ahora vuela a " + alturaVuelo + " metros.");
    }
    
    @Override
    public void bajarAlturaVuelo() {
        if (alturaVuelo >= 5) {
            alturaVuelo -= 5;  // Disminuye la altura en 5 metros
            System.out.println(nombre + " ha bajado 5 metros. Ahora vuela a " + alturaVuelo + " metros.");
        } else {
            System.out.println(nombre + " ya está muy bajo para bajar más.");
        }
    }
    
    @Override
    public void mostrarAlturaVuelo() {
        System.out.println(nombre + " vuela a " + alturaVuelo + " metros de altura.");
    }
}




