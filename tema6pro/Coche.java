
package tema06;

/**
 *
 * @author andres
 */

    // Clase Coche que hereda de Vehículo
class Coche extends Vehiculo {
    // Atributo específico del coche
    private boolean aireEncendido;
    
    // Constructor de la clase Coche
    public Coche(int velocidadInicial) {
        super(velocidadInicial);  // Llama al constructor de la clase padre
        this.aireEncendido = false;  // Por defecto, el aire está apagado
    }
    
    // Implementación del método abstracto mostrarMovimiento
    @Override
    public void mostrarMovimiento() {
        System.out.println("El coche está circulando a " + velocidad + " km/h");
    }
    
    // Método específico del coche para encender el aire
    public void encenderAire() {
        // Verificamos si el aire no está encendido
        if (!aireEncendido) {
            aireEncendido = true;  // Encendemos el aire
            // Reducimos la velocidad en 10 km/h
            if (velocidad >= 10) {
                velocidad -= 10;
            } else {
                velocidad = 0;  // Si la velocidad es menor a 10, la ponemos a 0
            }
            System.out.println("El coche ha encendido el aire. La velocidad se reduce");
        } else {
            System.out.println("El aire ya está encendido");
        }
    }
    
    // Método getter para saber si el aire está encendido
    public boolean isAireEncendido() {
        return aireEncendido;
    }
}

