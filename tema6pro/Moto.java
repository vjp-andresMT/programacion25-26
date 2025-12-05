
package tema06;

/**
 *
 * @author andres
 */

    // Clase Moto que hereda de Vehículo
class Moto extends Vehiculo {
    // Atributo específico de la moto
    private boolean haciendoCaballito;
    
    // Constructor de la clase Moto
    public Moto(int velocidadInicial) {
        super(velocidadInicial);  // Llama al constructor de la clase padre
        this.haciendoCaballito = false;  // Por defecto, no está haciendo caballito
    }
    
    // Implementación del método abstracto mostrarMovimiento
    @Override
    public void mostrarMovimiento() {
        System.out.println("La moto está circulando a " + velocidad + " km/h");
    }
    
    // Método específico de la moto para hacer caballito
    public void hacerCaballito() {
        // Verificamos si la moto no está haciendo un caballito
        if (!haciendoCaballito) {
            haciendoCaballito = true;  // La moto comienza a hacer caballito
            velocidad += 15;  // Aumentamos la velocidad en 15 km/h
            System.out.println("La moto está haciendo un caballito. La velocidad aumenta");
        } else {
            System.out.println("La moto ya está haciendo un caballito");
        }
    }
    
    // Método para dejar de hacer caballito (no solicitado pero útil)
    public void dejarCaballito() {
        if (haciendoCaballito) {
            haciendoCaballito = false;
            System.out.println("La moto ha dejado de hacer el caballito");
        }
    }
    
    // Método getter para saber si está haciendo caballito
    public boolean isHaciendoCaballito() {
        return haciendoCaballito;
    }
}

