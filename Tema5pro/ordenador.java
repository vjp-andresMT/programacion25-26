
package tema5java;
import java.util.Scanner;

/**
 *
 * @author andres
 */

    class Ordenador {
    int ram;
    int discoDuro;
    String procesador;
    String tarjetaGrafica;
    double precio;
    
    // Constructor por defecto
    public Ordenador() {}
    
    // Constructor con parámetros 
    public Ordenador(int r, int dd, String p, String tg, double pr) {
        ram = r;
        discoDuro = dd;
        procesador = p;
        tarjetaGrafica = tg;
        precio = pr;
    }
    
    // Métodos establecer 
    void establecerRam(int r) {
        ram = r;
    }
    
    void establecerDiscoDuro(int dd) {
        discoDuro = dd;
    }
}

