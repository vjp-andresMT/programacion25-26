
package tema4java;

/**
 *
 * @author andres
 */
public class operacionesMatematicasej16 {
   

    public static void main(String[] args) {
        System.out.println("Resultados de las operaciones:");
        System.out.println("------------------------------");
        
        raizCuadrada();
        potenciaCubo();
        exponencial();
        logaritmo();
        menorValor();
        valorAbsoluto();
        redondeo();
        seno();
    }
    
    public static void raizCuadrada() {
        double resultado = Math.sqrt(64);
        System.out.println("Raíz cuadrada de 64 = " + resultado);
    }
    
    public static void potenciaCubo() {
        double resultado = Math.pow(8, 3);
        System.out.println("8 elevado al cubo = " + resultado);
    }
    
    public static void exponencial() {
        double resultado = Math.exp(2);
        System.out.println("Exponencial de 2 = " + resultado);
    }
    
    public static void logaritmo() {
        double resultado = Math.log(2.71828);
        System.out.println("Logaritmo de 2.71828 = " + resultado);
    }
    
    public static void menorValor() {
        double resultado = Math.min(2, 3);
        System.out.println("Menor valor entre 2 y 3 = " + resultado);
    }
    
    public static void valorAbsoluto() {
        double resultado = Math.abs(-4.5);
        System.out.println("Valor absoluto de -4.5 = " + resultado);
    }
    
    public static void redondeo() {
        double resultado = Math.round(-4.5);
        System.out.println("Redondeo de -4.5 = " + resultado);
    }
    
    public static void seno() {
        // Convertir 45 grados a radianes
        double radianes = Math.toRadians(45);
        double resultado = Math.sin(radianes);
        System.out.println("Seno de 45 grados = " + resultado);
    }
}

