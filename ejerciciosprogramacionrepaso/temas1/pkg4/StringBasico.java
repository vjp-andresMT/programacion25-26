
package repasotema1.pkg2.pkg3.pkg4;

/**
 *
 * @author andres
 */
public class StringBasico {
    
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        
        // Métodos básicos
        System.out.println("Texto original: " + texto);
        System.out.println("Longitud: " + texto.length());
        System.out.println("En mayúsculas: " + texto.toUpperCase());
        System.out.println("En minúsculas: " + texto.toLowerCase());
        System.out.println("Primer carácter: " + texto.charAt(0));
        System.out.println("Substring (0-4): " + texto.substring(0, 4));
        
        // Búsqueda
        System.out.println("Contiene 'Mundo': " + texto.contains("Mundo"));
        System.out.println("Índice de 'Mundo': " + texto.indexOf("Mundo"));
        
        // Comparación
        String otroTexto = "Hola Mundo";
        System.out.println("¿Son iguales? " + texto.equals(otroTexto));
        System.out.println("¿Son iguales (ignore case)? " + texto.equalsIgnoreCase("hola mundo"));
    }
}

