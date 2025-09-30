
package ejjavatema2;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class ej21tema2 {
   


    public static void main(String[] args) {
        // Paso 1: Crear el Scanner para leer lo que escribe el usuario
        Scanner scanner = new Scanner(System.in);
        
        // Paso 2: Pedir al usuario que introduzca los segundos
        System.out.println("Por favor, introduzca un número de segundos:");
        int segundosTotales = scanner.nextInt();
        
        // Paso 3: Calcular los días (1 día = 86400 segundos)
        int dias = segundosTotales / 86400;
        
        // Paso 4: Calcular los segundos que sobran después de quitar los días
        int segundosRestantes = segundosTotales % 86400;
        
        // Paso 5: Calcular las horas con los segundos restantes (1 hora = 3600 segundos)
        int horas = segundosRestantes / 3600;
        
        // Paso 6: Calcular los segundos que sobran después de quitar las horas
        segundosRestantes = segundosRestantes % 3600;
        
        // Paso 7: Calcular los minutos con los segundos restantes (1 minuto = 60 segundos)
        int minutos = segundosRestantes / 60;
        
        // Paso 8: Calcular los segundos finales que quedan
        int segundos = segundosRestantes % 60;
        
        // Paso 9: Mostrar el resultado por pantalla
        System.out.println(segundosTotales + " segundos hacen un total de: " + dias + " días, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
        
        
    }
}

