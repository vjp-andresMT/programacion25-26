
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */
public class MetodosEstaticosBasicos {
  
    
    // Método estático simple
    public static void saludar() {
        System.out.println("¡Hola desde método estático!");
    }
    
    // Método estático con parámetros y retorno
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // Llamada a métodos estáticos
        saludar();
        
        int resultado = sumar(5, 3);
        System.out.println("5 + 3 = " + resultado);
        
        // Llamada desde la misma clase
        double area = calcularAreaCirculo(2.5);
        System.out.println("Área del círculo: " + area);
    }
    
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
}
public class MetodosEstaticosBasicos {
    
    //Método estatico simple
    public static void saludar() {
        System.out.println("hola desde metodo estatico");
    }
    // metodo estatico con parametros y retorno
    
    }
}
