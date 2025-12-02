
package tema06;

/**
 *
 * @author andres
 */

    // Clase Test para probar todo
public class TestMamifero {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DIRECTA CON LAS CLASES ===");
        System.out.println();
        
        // Crear un ornitorrinco directamente
        Ornitorrinco perry = new Ornitorrinco("Perry", "Macho", "Marrón", 3, 2);
        System.out.println("Datos del ornitorrinco:");
        perry.mostrarDatos();
        System.out.println();
        
        // Probar métodos del ornitorrinco
        System.out.println("Mensaje ovíparo: " + perry.obtenerMensajeOviparo());
        perry.mostrarNumHuevos();
        perry.ponerHuevo();
        perry.incubarHuevo();
        perry.mostrarNumHuevos();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Crear un murciélago directamente
        Murcielago batman = new Murcielago("Batman", "Macho", "Negro", 5, 10);
        System.out.println("Datos del murciélago:");
        batman.mostrarDatos();
        System.out.println();
        
        // Probar métodos del murciélago
        System.out.println("Mensaje volador: " + batman.obtenerMensajeVolador());
        batman.mostrarAlturaVuelo();
        batman.aumentarAlturaVuelo();
        batman.bajarAlturaVuelo();
        batman.mostrarAlturaVuelo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        System.out.println("=== PRUEBA CON POLIMORFISMO (USANDO INTERFACES) ===");
        System.out.println();
        
        // Crear objetos usando polimorfismo con interfaces
        System.out.println("Creando ornitorrinco desde la interfaz Oviparo...");
        Oviparo otroOrnitorrinco = new Ornitorrinco("Pepito", "Hembra", "Gris", 2, 1);
        
        // Solo podemos usar métodos de la interfaz Oviparo
        System.out.println(otroOrnitorrinco.obtenerMensajeOviparo());
        otroOrnitorrinco.mostrarNumHuevos();
        otroOrnitorrinco.ponerHuevo();
        otroOrnitorrinco.incubarHuevo();
        
        System.out.println("\n" + "-".repeat(30) + "\n");
        
        System.out.println("Creando murciélago desde la interfaz Volador...");
        Volador otroMurcielago = new Murcielago("Robin", "Hembra", "Marrón", 3, 15);
        
        // Solo podemos usar métodos de la interfaz Volador
        System.out.println(otroMurcielago.obtenerMensajeVolador());
        otroMurcielago.mostrarAlturaVuelo();
        otroMurcielago.aumentarAlturaVuelo();
        otroMurcielago.bajarAlturaVuelo();
        otroMurcielago.bajarAlturaVuelo();
        
        System.out.println("\n=== FIN DE LA PRUEBA ===");
    }
}



