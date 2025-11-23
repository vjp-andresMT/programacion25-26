
package tema5java;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Testej25 {
    public class Test {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Crear objetos Servidor con constructor parametrizado
        servidor serv1 = crearServidorParametrizado();
        servidor serv2 = crearServidorParametrizado();
        
        // Crear objetos Portátil con constructor parametrizado
        portatil port1 = crearPortatilParametrizado();
        portatil port2 = crearPortatilParametrizado();
        
        // Crear objetos con constructor por defecto
        servidor servDefecto = new servidor();
        portatil portDefecto = new portatil();
        
        // Establecer valores para objetos por defecto
        establecerServidorDefecto(servDefecto);
        establecerPortatilDefecto(portDefecto);
        
        // Mostrar datos 
        
    }
    
    static servidor crearServidorParametrizado() {
        System.out.println("Creando Servidor (parametrizado):");
        System.out.print("RAM: ");
        int ram = sc.nextInt();
        
        System.out.print("Disco duro: ");
        int disco = sc.nextInt();
        
        System.out.print("Procesador: ");
        String proc = sc.next();
        
        System.out.print("Tarjeta gráfica: ");
        String tg = sc.next();
        
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        
        System.out.print("Tamaño monitor: ");
        int tm = sc.nextInt();
        
        System.out.print("Modelo teclado: ");
        String tec = sc.next();
        
        System.out.print("Modelo ratón: ");
        String rat = sc.next();
        
        servidor s = new servidor(tm, tec, rat);
        s.establecerRam(ram);
        s.establecerDiscoDuro(disco);
        
        return s;
    }
    
    static portatil crearPortatilParametrizado() {
        System.out.println("Creando Portátil (parametrizado):");
        System.out.print("Marca: ");
        String marca = sc.next();
        
        System.out.print("Tamaño pantalla: ");
        double tam = sc.nextDouble();
        
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        
        return new portatil(marca, tam, peso);
    }
    
    static void establecerServidorDefecto(Servidor s) {
        System.out.println("Estableciendo Servidor por defecto:");
        System.out.print("RAM: ");
        s.ram = sc.nextInt();  // Acceso directo en lugar de usar método
    }
    
    static void establecerPortatilDefecto(Portatil p) {
        System.out.println("Estableciendo Portátil por defecto:");
        System.out.print("Marca: ");
        p.marca = sc.next();
    }
}
}
