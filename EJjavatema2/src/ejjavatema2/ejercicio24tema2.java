
package ejjavatema2;
import java.util.Scanner;

/**
 *
 * @author andres 
 */
public class ejercicio24tema2 {
  
public static void main(String[] args) {
    
// creamos el lector para el teclado
Scanner scanner = new Scanner (System.in);

// pedimos la primera nota
System.out.println("Introduzca la nota de programacion:");
double notaPro = scanner.nextDouble();

// pedimos la segunda nota 
System.out.println("Introduzca la nota de lenguajes de marcas");
double notaLenguaje = scanner.nextDouble();

// pedimos la tercera nota 
System.out.println("Introduzca la nota de base de datos");
double notaBase = scanner.nextDouble();

// pedimos la cuarta nota
System.out.println("Introduzca la nota de entornos de desarrollo");
double notaEntornos = scanner.nextDouble();
// pedimos la quinta nota
System.out.println("Introduzca la nota de sistemas informaticos");
double notaSistemas = scanner.nextDouble();
// pedimos la sexta nota
System.out.println("Introduzca la nota de formacion y orientacion laboral");
double notaFol = scanner.nextDouble();
// pedimos la séptima nota
System.out.println("Introduzca la nota de ingles profesional");
double notaIngles = scanner.nextDouble();
//calculamos la media
double suma = notaPro + notaLenguaje + notaBase + notaEntornos + notaSistemas + notaFol + notaIngles;
double media = suma/7;
    System.out.println("su nota media del curso es :" + media);





    
    
    
}
}
