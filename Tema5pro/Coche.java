
package tema5java;

/**
 *
 * @author andres
 */
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;

    // Métodos para establecer valores
    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public void establecerModelo(String modelo) {
        this.modelo = modelo;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    // Métodos de funcionamiento del coche
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
    }

    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }

    public void acelerarCoche() {
        if (motorEncendido) {
            velocidad += 20;
        }
    }

    public void frenarCoche() {
        if (motorEncendido && velocidad >= 6) {
            velocidad -= 6;
        }
    }

    public void obtenerEstado() {
        System.out.println("=== ESTADO DEL COCHE ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Motor encendido: " + motorEncendido);
        System.out.println("=========================");
    }
}

