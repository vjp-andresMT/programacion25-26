/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejjavatema2;

/**
 *
 * @author alumno
 */
public class operadores {
    //operadores
    // suma: +
    // resta -
    // multiplicacion: *
    //  division: /
    //  modulo: %
    public static void main(String[] args) {
    int num1 = 4;
    int num2 = 2;
    
        System.out.println(num1 + num2);
        System.out.println(num1 % num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    
    //  operadores relacionales
    
    // > < == <= !=
        System.out.println(num1 > num2);
        System.out.println(num1 != num2);
        System.out.println(num1 < num2);
        
    // operadores logicos
    // OR: ||
    // AND: &&
    // XOR: ^
    // NOT: !
    
    boolean condicion1 = true;
    boolean condicion2 = false;
    
   System.out.println(condicion1 || condicion2);
   
   System.out.println(condicion1 && condicion2);
   
   System.out.println(condicion1 ^ condicion2);
   
   System.out.println(!condicion2);
   
   // operadores unarios
   // -
   // +
   // ++
       
   
   
   
   
   System.out.println(- num1);
   
   System.out.println(+ num1);
   
   System.out.println(num1++);
   
   num2--;
   num2 = num2 - 1;
   System.out.println(num2);
   
   // operadores de asignacion
   
   // = += -= *= /= %=
   
    num2 += 2;
    num2 = num2 + 2;
    System.out.println(num2);
    num1 %= 2;
    num1 = num1 % 2;
    System.out.println(num1);
    
    // conversion de tipos (casting)
    
    short dato1 = 4;
    int dato2;
    dato2 = dato1;
    
    long dato3 = 3;
    dato2 = (int)dato3;
    
    
    
    
    
        
        
   
   
   
   
   
    
    
   
        
}
}
