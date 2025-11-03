package tema3java;

/**
 *
 * @author andres
 */
import java.util.Scanner;

public class ej7tema3 {
public static void main(String[]args){
   


   
        Scanner scanner = new Scanner(System.in);
        
       // Pedir el día de la semana al usuario
        System.out.println("Por favor, introduzca un número del 1 al 7 (1=Lunes, 7=Domingo): ");
        int diaSemana = scanner.nextInt();
        
        // Variable para saber si es laborable
        boolean laborable;
        
        // Usar switch para determinar si es laborable
        switch (diaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
                break;
            default:
                System.out.println("Error: El número debe estar entre 1 y 7");
                return; // Salir del programa si hay error
        }
        
        // Mostrar el resultado
        if (laborable) {
            System.out.println("El día es laborable");
        } else {
            System.out.println("El día no es laborable (fin de semana)");
        }
        
        
    }
} 
    
    
    
    
    
    
}
    
    
    
    
    
    

