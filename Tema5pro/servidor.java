
package tema5java;

/**
 *
 * @author andres
 */
public class servidor {
    class Servidor extends Ordenador {
    int tamañoMonitor;
    String modeloTeclado;
    String modeloRaton;
    
    // Constructor por defecto
    public Servidor() {}
    
    // Constructor con parámetros
    public Servidor(int tm, String mt, String mr) {
        tamañoMonitor = tm;
        modeloTeclado = mt;
        modeloRaton = mr;
    }
}
}
