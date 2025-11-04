
package tema4;
 import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej19tema4 {
    
    public static void main(String[] args) {
        String dia = pedirDia();
        int posicion = obtenerPosicion(dia);
        mostrarResultado(dia, posicion);
    }
    
    public static String pedirDia() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un día de la semana: ");
        String dia = entrada.nextLine();
        return dia;
    }
    
    public static int obtenerPosicion(String dia) {
        switch(dia.toLowerCase()) {
            case "lunes":
                return 1;
            case "martes":
                return 2;
            case "miércoles":
            case "miercoles":
                return 3;
            case "jueves":
                return 4;
            case "viernes":
                return 5;
            case "sábado":
            case "sabado":
                return 6;
            case "domingo":
                return 7;
            default:
                return 0; // Si no es un día válido
        }
    }
    
    public static void mostrarResultado(String dia, int posicion) {
        if (posicion == 0) {
            System.out.println("Error: '" + dia + "' no es un día de la semana válido");
        } else {
            System.out.println("El " + dia + " es el " + posicion + "º día de la semana");
        }
    }
}


