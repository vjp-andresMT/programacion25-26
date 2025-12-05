
package tema06;

/**
 *
 * @author andres
 */

    // Clase abstracta Vehículo
abstract class Vehiculo {
    // Atributo común a todos los vehículos
    protected int velocidad;  // protected para que las clases hijas puedan acceder
    
    // Constructor de la clase Vehículo
    public Vehiculo(int velocidadInicial) {
        this.velocidad = velocidadInicial;
    }
    
    // Método abstracto que deben implementar las clases hijas
    public abstract void mostrarMovimiento();
    
    // Método getter para obtener la velocidad
    public int getVelocidad() {
        return velocidad;
    }
    
    // Método setter para cambiar la velocidad
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}

