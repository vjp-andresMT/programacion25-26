
package tema06;

/**
 *
 * @author andres
 */

// Archivo: Main.java

public class Mainej3 {
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA DE FIGURAS GEOMÉTRICAS ===\n");
        
        // -------------------------------
        // PRIMERA PARTE: Crear objetos normalmente
        // -------------------------------
        System.out.println("--- CREANDO OBJETOS DIRECTAMENTE ---\n");
        
        // 1. Crear un Círculo
        Circulo circulo = new Circulo("Rojo", 5.0);
        System.out.println("CÍRCULO:");
        System.out.println("  Color: " + circulo.getColor());
        System.out.println("  Radio: " + circulo.getRadio() + " cm");
        System.out.println("  Área: " + String.format("%.2f", circulo.calcularArea()) + " cm²");
        System.out.println("  Perímetro: " + String.format("%.2f", circulo.calcularPerimetro()) + " cm\n");
        
        // 2. Crear un Rectángulo
        Rectangulo rectangulo = new Rectangulo("Azul", 4.0, 6.0);
        System.out.println("RECTÁNGULO:");
        System.out.println("  Color: " + rectangulo.getColor());
        System.out.println("  Base: " + rectangulo.getBase() + " cm");
        System.out.println("  Altura: " + rectangulo.getAltura() + " cm");
        System.out.println("  Área: " + rectangulo.calcularArea() + " cm²");
        System.out.println("  Perímetro: " + rectangulo.calcularPerimetro() + " cm\n");
        
        // 3. Crear un Cuadrado
        Cuadrado cuadrado = new Cuadrado("Verde", 4.0);
        System.out.println("CUADRADO:");
        System.out.println("  Color: " + cuadrado.getColor());
        System.out.println("  Lado: " + cuadrado.getLado() + " cm");
        System.out.println("  Área: " + cuadrado.calcularArea() + " cm²");
        System.out.println("  Perímetro: " + cuadrado.calcularPerimetro() + " cm\n");
        
        // 4. Crear un Triángulo Rectángulo (CORREGIDO)
        TrianguloRectangulo triangulo1 = new TrianguloRectangulo("Amarillo", 3.0, 4.0);
        System.out.println("TRIÁNGULO RECTÁNGULO 1:");
        System.out.println("  Color: " + triangulo1.getColor());
        System.out.println("  Base: " + triangulo1.getBase() + " cm");
        System.out.println("  Altura: " + triangulo1.getAltura() + " cm");
        System.out.println("  Área: " + triangulo1.calcularArea() + " cm²");
        System.out.println("  Perímetro: " + String.format("%.2f", triangulo1.calcularPerimetro()) + " cm");
        System.out.println("  Hipotenusa: " + String.format("%.2f", triangulo1.calcularHipotenusa()) + " cm");
        System.out.println("  Tipo: " + triangulo1.determinarTipoTriangulo() + "\n");
        
        // Otro triángulo para probar el tipo Isósceles
        TrianguloRectangulo triangulo2 = new TrianguloRectangulo("Naranja", 5.0, 5.0);
        System.out.println("TRIÁNGULO RECTÁNGULO 2 (Isósceles):");
        System.out.println("  Color: " + triangulo2.getColor());
        System.out.println("  Base: " + triangulo2.getBase() + " cm");
        System.out.println("  Altura: " + triangulo2.getAltura() + " cm");
        System.out.println("  Área: " + triangulo2.calcularArea() + " cm²");
        System.out.println("  Perímetro: " + String.format("%.2f", triangulo2.calcularPerimetro()) + " cm");
        System.out.println("  Hipotenusa: " + String.format("%.2f", triangulo2.calcularHipotenusa()) + " cm");
        System.out.println("  Tipo: " + triangulo2.determinarTipoTriangulo() + "\n");
        
        // -------------------------------
        // SEGUNDA PARTE: Usar POLIMORFISMO
        // -------------------------------
        System.out.println("--- USANDO POLIMORFISMO (FiguraGeometrica) ---\n");
        
        // Creamos un arreglo de FiguraGeometrica
        FiguraGeometrica[] figuras = new FiguraGeometrica[4];
        
        // Llenamos el arreglo con diferentes figuras
        figuras[0] = new Circulo("Morado", 3.0);           // Un círculo
        figuras[1] = new Rectangulo("Cyan", 2.0, 7.0);     // Un rectángulo  
        figuras[2] = new Cuadrado("Rosa", 5.0);            // Un cuadrado
        figuras[3] = new TrianguloRectangulo("Marrón", 6.0, 8.0); // Un triángulo rectángulo
        
        // Recorremos todas las figuras usando un bucle for
        System.out.println("Recorriendo todas las figuras:");
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("\nFigura " + (i + 1) + ":");
            
            // Polimorfismo: Java sabe qué método llamar según el tipo real del objeto
            System.out.println("  Color: " + figuras[i].getColor());
            System.out.println("  Área: " + String.format("%.2f", figuras[i].calcularArea()) + " cm²");
            System.out.println("  Perímetro: " + String.format("%.2f", figuras[i].calcularPerimetro()) + " cm");
            
            // Verificamos si la figura es un TrianguloRectangulo
            if (figuras[i] instanceof TrianguloRectangulo) {
                // Hacemos casting a TrianguloRectangulo para acceder a métodos específicos
                TrianguloRectangulo tr = (TrianguloRectangulo) figuras[i];
                System.out.println("  Hipotenusa: " + String.format("%.2f", tr.calcularHipotenusa()) + " cm");
                System.out.println("  Tipo: " + tr.determinarTipoTriangulo());
            }
        }
        
        // -------------------------------
        // TERCERA PARTE: Recorrido con for-each
        // -------------------------------
        System.out.println("\n\n--- RECORRIENDO CON FOR-EACH ---\n");
        
        int contador = 1;
        for (FiguraGeometrica figura : figuras) {
            String nombreClase = figura.getClass().getSimpleName();
            
            System.out.println("Figura " + contador + " - " + nombreClase + 
                             ": Área = " + String.format("%.2f", figura.calcularArea()) + " cm², " +
                             "Perímetro = " + String.format("%.2f", figura.calcularPerimetro()) + " cm");
            contador++;
        }
        
        // -------------------------------
        // CUARTA PARTE: Demostración adicional (CORREGIDO)
        // -------------------------------
        System.out.println("\n\n--- DEMOSTRACIÓN ADICIONAL ---\n");
        
        // Creamos más figuras (CORREGIDO - sin nombres de parámetros)
        FiguraGeometrica figura1 = new Circulo("Dorado", 10.0);
        FiguraGeometrica figura2 = new TrianguloRectangulo("Plateado", 9.0, 12.0);
        
        // Demostración del polimorfismo
        System.out.println("Demostración del polimorfismo:");
        System.out.println("Figura 1 (Círculo):");
        System.out.println("  Área: " + String.format("%.2f", figura1.calcularArea()));
        System.out.println("  Perímetro: " + String.format("%.2f", figura1.calcularPerimetro()));
        
        System.out.println("\nFigura 2 (Triángulo Rectángulo):");
        System.out.println("  Área: " + String.format("%.2f", figura2.calcularArea()));
        System.out.println("  Perímetro: " + String.format("%.2f", figura2.calcularPerimetro()));
        
        // Solo podemos acceder a métodos específicos después de verificar el tipo
        if (figura2 instanceof TrianguloRectangulo) {
            TrianguloRectangulo tr = (TrianguloRectangulo) figura2;
            System.out.println("  Hipotenusa: " + String.format("%.2f", tr.calcularHipotenusa()));
            System.out.println("  Tipo: " + tr.determinarTipoTriangulo());
        }
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}