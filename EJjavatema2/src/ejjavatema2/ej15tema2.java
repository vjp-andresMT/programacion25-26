
package ejjavatema2;

/**
 *
 * @author andres
 */
public class ej15tema2 {
     public static void main(String[] args) {
     // Paso 1: Declarar la variable tiempo en segundos
        int tiempo = 10000;
       
        // Paso 2: Calcular las horas, minutos y segundos
        // Primero calculamos las horas (1 hora = 3600 segundos)
        int horas = tiempo / 3600;
       
        // Luego calculamos los segundos que sobran después de quitar las horas
        int segundosRestantes = tiempo % 3600;
       
        // Con los segundos restantes, calculamos los minutos (1 minuto = 60 segundos)
        int minutos = segundosRestantes / 60;
       
        // Finalmente, los segundos que quedan después de quitar horas y minutos
        int segundos = segundosRestantes % 60;
       
        // Paso 3: Mostrar el resultado por pantalla
        System.out.println("10.000 segundos hacen un total de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
}


