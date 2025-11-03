
package tema3java;
 import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ej34tema3 {
   

/**
 *
 * @author alumno
 */

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        // Solicitar datos de salida
        System.out.println("Introduzca el día de salida: ");
        int diaSalida = entrada.nextInt();
       
        System.out.println("Introduzca la hora de salida (0-23): ");
        int horaSalida = entrada.nextInt();
       
        System.out.println("Introduzca el minuto de salida (0-59): ");
        int minutoSalida = entrada.nextInt();
       
        // Solicitar datos de llegada
        System.out.println("Introduzca el día de llegada: ");
        int diaLlegada = entrada.nextInt();
       
        System.out.println("Introduzca la hora de llegada (0-23): ");
        int horaLlegada = entrada.nextInt();
       
        System.out.println("Introduzca el minuto de llegada (0-59): ");
        int minutoLlegada = entrada.nextInt();
       
        // Validar que los datos sean correctos
        if (diaSalida < 1 || diaLlegada < 1) {
            System.out.println("Error: Los días deben ser números positivos.");
        } else if (horaSalida < 0 || horaSalida > 23 || horaLlegada < 0 || horaLlegada > 23) {
            System.out.println("Error: Las horas deben estar entre 0 y 23.");
        } else if (minutoSalida < 0 || minutoSalida > 59 || minutoLlegada < 0 || minutoLlegada > 59) {
            System.out.println("Error: Los minutos deben estar entre 0 y 59.");
        } else if (diaLlegada < diaSalida) {
            System.out.println("Error: El día de llegada no puede ser anterior al día de salida.");
        } else if (diaLlegada == diaSalida && horaLlegada < horaSalida) {
            System.out.println("Error: En el mismo día, la hora de llegada no puede ser anterior a la de salida.");
        } else if (diaLlegada == diaSalida && horaLlegada == horaSalida && minutoLlegada < minutoSalida) {
            System.out.println("Error: En la misma hora, el minuto de llegada no puede ser anterior al de salida.");
        } else {
            // Calcular tiempo total en minutos
            int minutosTotales;
           
            if (diaLlegada == diaSalida) {
                // Mismo día
                minutosTotales = (horaLlegada - horaSalida) * 60 + (minutoLlegada - minutoSalida);
            } else {
                // Días diferentes
                int diasDiferencia = diaLlegada - diaSalida;
                minutosTotales = diasDiferencia * 24 * 60; // Minutos de los días completos
                minutosTotales += (horaLlegada - horaSalida) * 60 + (minutoLlegada - minutoSalida);
            }
           
            // Convertir a horas y minutos
            int horas = minutosTotales / 60;
            int minutos = minutosTotales % 60;
           
            // Mostrar resultado
            System.out.println("El tiempo de viaje es: " + horas + " horas y " + minutos + " minutos.");
        }
       
     
    }
}



