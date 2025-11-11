
package repasotema1.pkg2.pkg3.pkg4;

/**
 *
 * @author andres
 */

       
       
public class OperadoresComplejos {
    public static void main(String[] args ) {
        //operadores de asignacion compuesta
        int numero = 10;
        numero += 5; //numero = 15
        numero *= 2; //numero = 30
        numero %= 7; //numero = 2
       //operadores de bits
        int a = 5; //0101 en binario
        int b = 3; //0011 en binario

        int and = a & b; // 0001 = 1
        int or = a | b; // 0111 = 7
        int xor = a ^ b; // 0110 = 6
        int shift = a << 1; // 1010 = 10

       // operadores de incremento/decremento
          int contador = 0;
          int preIncremento = ++contador; // contador=1; preIncremento=1
          int postIncremento = contador++; // postIncremento=1, contador=2
          
          System.out.println("Número final: " + numero);
          System.out.println("Operaciones de bits:");
          System.out.println("a & b = " + and);
          System.out.println("a | b = " + or);
          System.out.println("a ^ b = " + xor);
          System.out.println("a << 1 = " + shift);
          System.out.println("Pre-incremento: " + preIncremento);
          System.out.println("post-incremento: " + postIncremento);
          System.out.println("contador final: " + contador);
        
    }
}
