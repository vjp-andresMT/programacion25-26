
package tema06;

/**
 *
 * @author andres
 */

// Clase Ornitorrinco que hereda de Mamifero e implementa Oviparo
class Ornitorrinco extends Mamifero implements Oviparo {
    private int numHuevos;  // Atributo específico del ornitorrinco
    
    // Constructor
    public Ornitorrinco(String nombre, String sexo, String color, int edad, int numHuevos) {
        super(nombre, sexo, color, edad);  // Llama al constructor de Mamifero
        this.numHuevos = numHuevos;
    }
    
   // Implementación de métodos de la interfaz Oviparo
    @Override
    public String obtenerMensajeOviparo() {
        return "El omitorrínco es un mamífero ovíparo";
    }
    
    @Override
    public void ponerHuevo() {
        numHuevos++;  // Aumenta el número de huevos en 1
        System.out.println(nombre + " ha puesto un huevo. Ahora tiene " + numHuevos + " huevos.");
    }
    
    @Override
    public void incubarHuevo() {
        if (numHuevos > 0) {
            numHuevos--;  // Disminuye el número de huevos en 1
            System.out.println(nombre + " está incubando un huevo. Le quedan " + numHuevos + " huevos.");
        } else {
            System.out.println(nombre + " no tiene huevos para incubar.");
        }
    }
    
    @Override
    public void mostrarNumHuevos() {
        System.out.println(nombre + " tiene " + numHuevos + " huevos.");
    }
}

   
        