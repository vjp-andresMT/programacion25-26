
package ejjavatema2;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class importsyescaner {
 public static void main(String[] args) {
     
     System.out.println("Estoy aprendiendo a importar paquetes");
     //pedimos datos al usuario por teclado 
     // creamos el escaner que lea los datos
     Scanner entrada = new Scanner (System.in);
     System.out.println("¿cuanto dinero tienes en la cuenta?");
     //leemos los datos del usuario
     int dinero = entrada.nextInt();
     // mostrar el resultado
     System.out.println("tienes " + dinero + "euros");
 }
}
