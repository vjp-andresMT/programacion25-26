package tema07;
import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 15:
 * Menú interactivo para gestionar ventas mensuales de coches.
 * Opciones: rellenar, mostrar normal, mostrar al revés, suma total,
 * suma meses pares, mes con más ventas, salir.
 * 
 * @author andres
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        // Arrays necesarios
        int[] ventas = new int[12]; // ventas mensuales
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        int opcion;
        
        do {
            mostrarMenu();
            System.out.print("Elige una opción (1-7): ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    rellenarVentas(ventas, rand);
                    System.out.println("Ventas rellenadas con números aleatorios entre 10 y 100.");
                    break;
                case 2:
                    mostrarVentas(ventas, meses);
                    break;
                case 3:
                    mostrarVentasAlReves(ventas, meses);
                    break;
                case 4:
                    System.out.println("Suma total de ventas del año: " + calcularSumaTotal(ventas));
                    break;
                case 5:
                    System.out.println("Suma de ventas de meses pares: " + calcularSumaMesesPares(ventas));
                    break;
                case 6:
                    mostrarMesConMasVentas(ventas, meses);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
            System.out.println(); // línea en blanco para separar ejecuciones
            
        } while (opcion != 7); // repetimos hasta que elija 7
        
      
    }
    
    /**
     * Muestra el menú de opciones.
     */
    public static void mostrarMenu() {
        System.out.println("\n========== MENÚ DE VENTAS ==========");
        System.out.println("1. Rellenar ventas con números aleatorios (10-100)");
        System.out.println("2. Mostrar ventas normales");
        System.out.println("3. Mostrar ventas al revés");
        System.out.println("4. Mostrar suma total del año");
        System.out.println("5. Mostrar suma de meses pares");
        System.out.println("6. Mostrar mes con más ventas");
        System.out.println("7. Salir");
        System.out.println("====================================");
    }
    
    /**
     * Rellena el array de ventas con números aleatorios entre 10 y 100.
     */
    public static void rellenarVentas(int[] ventas, Random rand) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = rand.nextInt(91) + 10; // 10 + [0 a 90] → 10 a 100
        }
    }
    
    /**
     * Muestra las ventas con el nombre del mes.
     */
    public static void mostrarVentas(int[] ventas, String[] meses) {
        System.out.println("\nVENTAS MENSUALES:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    /**
     * Muestra las ventas al revés (diciembre a enero).
     */
    public static void mostrarVentasAlReves(int[] ventas, String[] meses) {
        System.out.println("\nVENTAS AL REVÉS (de diciembre a enero):");
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    
    /**
     * Calcula y devuelve la suma total de todas las ventas.
     */
    public static int calcularSumaTotal(int[] ventas) {
        int suma = 0;
        for (int venta : ventas) {
            suma += venta;
        }
        return suma;
    }
    
    /**
     * Calcula y devuelve la suma de las ventas de los meses pares (febrero, abril, etc.).
     * En el array, los meses pares están en índices impares: 1, 3, 5, 7, 9, 11.
     */
    public static int calcularSumaMesesPares(int[] ventas) {
        int suma = 0;
        for (int i = 1; i < ventas.length; i += 2) { // i empieza en 1 (febrero) y va de 2 en 2
            suma += ventas[i];
        }
        return suma;
    }
    
    /**
     * Muestra el nombre del mes con más ventas.
     */
    public static void mostrarMesConMasVentas(int[] ventas, String[] meses) {
        int maxVenta = ventas[0];
        int indiceMax = 0;
        
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > maxVenta) {
                maxVenta = ventas[i];
                indiceMax = i;
            }
        }
        
        System.out.println("Mes con más ventas: " + meses[indiceMax] + " (" + maxVenta + ")");
    }
}