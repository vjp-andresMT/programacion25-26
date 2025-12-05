
package tema06;

/**
 *
 * @author andres
 */

    // Clase Test principal con el método main
public class Testej8 {
    
    // Método procesarVehiculo que recibe cualquier vehículo
    public static void procesarVehiculo(Vehiculo vehiculo) {
        System.out.println("\n--- Procesando vehículo ---");
        
        // 1. Mostrar el movimiento del vehículo
        vehiculo.mostrarMovimiento();
        
        // 2. Verificar si es un coche
        if (vehiculo instanceof Coche) {
            // Convertimos el vehículo a coche
            Coche coche = (Coche) vehiculo;
            // Encendemos el aire
            coche.encenderAire();
            // Mostramos el movimiento después de encender el aire
            coche.mostrarMovimiento();
        }
        
        // 3. Verificar si es una moto
        else if (vehiculo instanceof Moto) {
            // Convertimos el vehículo a moto
            Moto moto = (Moto) vehiculo;
            // Hacemos un caballito
            moto.hacerCaballito();
            // Mostramos el movimiento después de hacer el caballito
            moto.mostrarMovimiento();
        }
        
        System.out.println("--- Fin del procesamiento ---");
    }
    
    // Método main para probar el programa
    public static void main(String[] args) {
        System.out.println("=== PROGRAMA DE VEHÍCULOS ===");
        
        // 1. Crear un coche con velocidad inicial de 80 km/h
        System.out.println("\n1. Creando un coche...");
        Coche miCoche = new Coche(80);
        System.out.println("Velocidad inicial del coche: " + miCoche.getVelocidad() + " km/h");
        System.out.println("¿Aire encendido?: " + miCoche.isAireEncendido());
        
        // 2. Crear una moto con velocidad inicial de 60 km/h
        System.out.println("\n2. Creando una moto...");
        Moto miMoto = new Moto(60);
        System.out.println("Velocidad inicial de la moto: " + miMoto.getVelocidad() + " km/h");
        System.out.println("¿Haciendo caballito?: " + miMoto.isHaciendoCaballito());
        
        System.out.println("\n=== PROCESANDO COCHE ===");
        // 3. Procesar el coche usando el método procesarVehiculo
        procesarVehiculo(miCoche);
        
        System.out.println("\n=== PROCESANDO MOTO ===");
        // 4. Procesar la moto usando el método procesarVehiculo
        procesarVehiculo(miMoto);
        
        System.out.println("\n=== PRUEBAS ADICIONALES ===");
        
        // 5. Probar el coche de nuevo para ver que el aire ya está encendido
        System.out.println("\n5. Intentando encender el aire del coche otra vez:");
        miCoche.encenderAire();  // Debería mostrar que ya está encendido
        
        // 6. Probar la moto de nuevo para ver que ya está haciendo caballito
        System.out.println("\n6. Intentando hacer caballito con la moto otra vez:");
        miMoto.hacerCaballito();  // Debería mostrar que ya está haciendo caballito
        
        // 7. Crear más vehículos y procesarlos
        System.out.println("\n7. Creando y procesando más vehículos:");
        
        // Crear un coche deportivo
        Coche cocheDeportivo = new Coche(120);
        procesarVehiculo(cocheDeportivo);
        
        // Crear una moto deportiva
        Moto motoDeportiva = new Moto(100);
        procesarVehiculo(motoDeportiva);
        
        // 8. Demostración de polimorfismo con un array de vehículos
        System.out.println("\n8. Demostración de polimorfismo:");
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Coche(90);
        vehiculos[1] = new Moto(70);
        vehiculos[2] = new Coche(110);
        
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\nProcesando vehículo " + (i+1) + " del array:");
            procesarVehiculo(vehiculos[i]);
        }
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}

