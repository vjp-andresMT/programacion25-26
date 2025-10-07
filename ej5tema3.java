package javatema3;
import java.util.Scanner; //importamos el scanner

/**
 *
 * @author andres
 */
// Implementa un algoritmo en JAVA que le pida
// al usuario un número por teclado. Posteriormente, el
// programa le dirá al usuario si el número introducido es par
// o impar.
public class ej5tema3 {
 
public void main(String[]args) {
    // creamos el scanner
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int numeroIntroducido = entrada.nextInt();
   
    
// verificamos si el numero es par o impar
    if(numeroIntroducido % 2 == 0){
        System.out.println("el numero introducido es par");
    
 } else {
            System.out.println("El número introducido es impar");
    }
}
}
    

 

        
      
        
        
    
