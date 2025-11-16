
package repasotema1.pkg2.pkg3.pkg4;

/**
 *
 * @author andres
 */

public class MathBasico {
    public static void main(String[] args) {
        // operaciones matematicas basicas
        System.out.println("Valor de PI: " + Math.PI);
        System.out.println("valor de E: " + Math.E);
        
        // Potencias y raices
        System.out.println("2^3 = " + Math.pow(2, 3));
        System.out.println("Raiz cuadrada de 16 : " + Math.sqrt(16));
        
        // Valores Absolutos
        System.out.println("Valor absoluto de -5: " + Math.abs(-5));
        
        // Redondeo
        System.out.println("Redondeo de 3.6: " + Math.round(3.6));
        System.out.println("Techo de 3.2: " + Math.ceil(3.2));
        System.out.println("Piso de 3.8: " + Math.floor(3.8));
    }
}
