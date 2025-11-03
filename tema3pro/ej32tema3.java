
package tema3java;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej32tema3 {
 

/**
 *
 * @author alumno
 */

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        // Solicitar fecha actual
        System.out.println("Introduzca el año actual: ");
        int añoActual = entrada.nextInt();
       
        System.out.println("Introduzca el mes actual: ");
        int mesActual = entrada.nextInt();
       
        System.out.println("Introduzca el día actual: ");
        int diaActual = entrada.nextInt();
       
        // Solicitar fecha de nacimiento
        System.out.println("Ahora, introduzca su año de nacimiento: ");
        int añoNacimiento = entrada.nextInt();
       
        System.out.println("Introduzca su mes de nacimiento: ");
        int mesNacimiento = entrada.nextInt();
       
        System.out.println("Por último introduzca su día de nacimiento: ");
        int diaNacimiento = entrada.nextInt();
       
        // Calcular edad
        int años = añoActual - añoNacimiento;
        int meses = mesActual - mesNacimiento;
        int dias = diaActual - diaNacimiento;
       
        // Ajustar si los días son negativos
        if (dias < 0) {
            meses = meses - 1;
            // Calcular días del mes anterior
            int diasMesAnterior;
            if (mesActual == 1) {
                diasMesAnterior = 31;
            } else if (mesActual == 3) {
                if ((añoActual % 4 == 0 && añoActual % 100 != 0) || (añoActual % 400 == 0)) {
                    diasMesAnterior = 29;
                } else {
                    diasMesAnterior = 28;
                }
            } else if (mesActual == 5 || mesActual == 7 || mesActual == 10 || mesActual == 12) {
                diasMesAnterior = 30;
            } else {
                diasMesAnterior = 31;
            }
            dias = dias + diasMesAnterior;
        }
       
        // Ajustar si los meses son negativos
        if (meses < 0) {
            años = años - 1;
            meses = meses + 12;
        }
       
        // Mostrar resultado
        System.out.println("Su edad exacta es de " + años + " años, " + meses + " meses y " + dias + " días.");
       
       
    }
}

