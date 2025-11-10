
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */

public class ConstantesCalculo {
    public static void main(String[] args) {
        final double IVA = 0.21;
        final double DESCUENTO = 0.15;
        final int MINIMO_COMPRA = 50;
        
        double precioProducto = 100.0;
        double precioConIva = precioProducto * (1 + IVA);
        double precioFinal = precioConIva;
        
        if(precioProducto > MINIMO_COMPRA) {
            precioFinal = precioConIva * (1 - DESCUENTO);
        }
        System.out.println("Precio original: " + precioProducto);
        System.out.println("Precio con IVA: " + precioConIva);
        System.out.println("Precio final: " + precioFinal);
       
    }
}