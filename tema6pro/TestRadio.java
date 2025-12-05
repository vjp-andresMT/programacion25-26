
package tema06;

/**
 *
 * @author andres
 */

    // Clase Test para probar el programa
public class TestRadio {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DEL TELEVISOR ===");
        System.out.println("\n1. Creando un televisor...");
        Televisor miTelevisor = new Televisor();
        
        System.out.println("\n2. Mostrando información inicial del televisor:");
        miTelevisor.mostrarInformacion();
        
        System.out.println("\n3. Encendiendo el televisor:");
        miTelevisor.encender();
        
        System.out.println("\n4. Mostrando información del televisor encendido:");
        miTelevisor.mostrarInformacion();
        
        System.out.println("\n5. Subiendo el volumen 3 veces:");
        for (int i = 0; i < 3; i++) {
            System.out.print("   Intento " + (i+1) + ": ");
            miTelevisor.subirVolumen();
        }
        
        System.out.println("\n6. Mostrando volumen actual:");
        System.out.println("   Volumen actual: " + miTelevisor.getVolumen());
        
        System.out.println("\n7. Cambiando de canal a 5:");
        miTelevisor.cambiarCanal(5);
        
        System.out.println("\n8. Bajando el volumen:");
        miTelevisor.bajarVolumen();
        
        System.out.println("\n9. Apagando el televisor:");
        miTelevisor.apagar();
        
        System.out.println("\n10. Mostrando información final del televisor:");
        miTelevisor.mostrarInformacion();
        
        System.out.println("\n\n=== PRUEBA DE LA RADIO ===");
        System.out.println("\n1. Creando una radio...");
        Radio miRadio = new Radio();
        
        System.out.println("\n2. Mostrando información inicial de la radio:");
        miRadio.mostrarInformacion();
        
        System.out.println("\n3. Encendiendo la radio:");
        miRadio.encender();
        
        System.out.println("\n4. Mostrando información de la radio encendida:");
        miRadio.mostrarInformacion();
        
        System.out.println("\n5. Subiendo el volumen 3 veces:");
        for (int i = 0; i < 3; i++) {
            System.out.print("   Intento " + (i+1) + ": ");
            miRadio.subirVolumen();
        }
        
        System.out.println("\n6. Mostrando volumen actual:");
        System.out.println("   Volumen actual: " + miRadio.getVolumen());
        
        System.out.println("\n7. Cambiando de emisora a 95.5:");
        miRadio.cambiarCanal(95.5f);
        
        System.out.println("\n8. Bajando el volumen:");
        miRadio.bajarVolumen();
        
        System.out.println("\n9. Apagando la radio:");
        miRadio.apagar();
        
        System.out.println("\n10. Mostrando información final de la radio:");
        miRadio.mostrarInformacion();
        
        System.out.println("\n\n=== PRUEBA ADICIONAL CON POLIMORFISMO ===");
        System.out.println("\nUsando la interfaz ControlRemoto:");
        
        // Crear dispositivos usando la interfaz (polimorfismo)
        ControlRemoto dispositivo1 = new Televisor();
        ControlRemoto dispositivo2 = new Radio();
        
        System.out.println("\n--- Probando televisor a través de la interfaz ---");
        dispositivo1.encender();
        dispositivo1.subirVolumen();
        dispositivo1.cambiarCanal(8);
        dispositivo1.bajarVolumen();
        dispositivo1.apagar();
        
        System.out.println("\n--- Probando radio a través de la interfaz ---");
        dispositivo2.encender();
        dispositivo2.subirVolumen();
        dispositivo2.cambiarCanal(101.5f);
        dispositivo2.bajarVolumen();
        dispositivo2.apagar();
    }
}

