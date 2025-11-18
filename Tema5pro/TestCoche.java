
package tema5java;

/**
 *
 * @author andres
 */

    public class TestCoche {
    public static void main(String[] args) {
        // Crear dos objetos de la clase Coche
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        // Establecer datos para miCoche
        miCoche.establecerMarca("Toyota");
        miCoche.establecerModelo("Corolla");
        miCoche.establecerColor("Rojo");

        // Establecer datos para cochePadre
        cochePadre.establecerMarca("Ford");
        cochePadre.establecerModelo("Focus");
        cochePadre.establecerColor("Azul");

        // Operaciones con miCoche
        miCoche.arrancarCoche();
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        // Operaciones con cochePadre
        cochePadre.arrancarCoche();
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }
        cochePadre.apagarCoche();

        // Mostrar estados
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();
    }
}

