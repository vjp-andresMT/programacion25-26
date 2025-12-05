
package tema06;

/**
 *
 * @author andres
 */

    // Interfaz ControlRemoto con los métodos requeridos
interface ControlRemoto {
    void apagar();                 // Apagar el dispositivo
    void encender();               // Encender el dispositivo
    void bajarVolumen();           // Bajar el volumen
    void subirVolumen();           // Subir el volumen
    void cambiarCanal(float canal); // Cambiar canal o emisora
}

