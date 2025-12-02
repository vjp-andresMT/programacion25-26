
package tema06;

/**
 *
 * @author andres
 */
// Clase principal para probar el programa
public class TestCalculadora {
    

    public static void main(String[] args) {
        
        System.out.println("=== PRIMERA PARTE: Creación directa ===");
        
        // Crear objetos directamente de cada subclase
        Suma suma1 = new Suma(5, 3);
        Multiplicacion mult1 = new Multiplicacion(4, 6);
        Potencia pot1 = new Potencia(2, 3);
        
        // Probar los métodos
        suma1.realizarOperacion();
        mult1.realizarOperacion();
        pot1.realizarOperacion();
        
        System.out.println("\n=== SEGUNDA PARTE: Polimorfismo ===");
        
        // POLIMORFISMO: Crear objetos usando la clase padre Calculadora
        Calculadora calculadora1 = new Suma(10, 5);
        Calculadora calculadora2 = new Multiplicacion(7, 8);
        Calculadora calculadora3 = new Potencia(3, 4);
        
        // Probar los métodos (polimorfismo en acción)
        calculadora1.realizarOperacion();
        calculadora2.realizarOperacion();
        calculadora3.realizarOperacion();
    }
}



