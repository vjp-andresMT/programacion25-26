
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */

public class ConversionTipos {
    public static void main(String[] args) {
        String textoNumero = "123";
        int numero = Integer.parseInt(textoNumero);
        double decimal = Double.parseDouble("45.67");
        String texto = String.valueOf(89);
        System.out.println("String a int: " + numero);
        
        System.out.println("String a double: " + decimal);
        System.out.println("int a String: " + texto);
    }
}
