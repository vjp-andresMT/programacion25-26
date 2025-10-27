/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;
import java.util.Scanner;
import utilidades.comparadorNumeros;

/**
 *
 * @author andres
 */
public class comparadorNumeros {
   


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();
        
        System.out.println("Por último, introduzca un tercer numero: ");
        int numero3 = entrada.nextInt();
        
        compararnumeros.encontrarMayor(numero1, numero2, numero3);
    }
}

