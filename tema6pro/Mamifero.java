
package tema06;

/**
 *
 * @author andres
 */

    // Clase principal Mamifero con atributos básicos
class Mamifero {
    String nombre;
    String sexo;
    String color;
    int edad;
    
    // Constructor para crear un mamífero con datos iniciales
    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    // Método para mostrar los datos del mamífero
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + sexo);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad + " años");
    }
}



    // Interfaz para mamíferos que ponen huevos
interface Oviparo {
    String obtenerMensajeOviparo();
    void ponerHuevo();
    void incubarHuevo();
    void mostrarNumHuevos();
}

 // Interfaz para mamíferos que vuelan
 interface Volador {
     String obtenerMensajeVolador();
     void mostrarAlturaVuelo();
     void aumentarAlturaVuelo();
     void bajarAlturaVuelo();
     
     
 }


       
        
        