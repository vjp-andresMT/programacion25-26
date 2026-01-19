
package tema07;
import java.util.Scanner;
/**
 *
 * @author andres
 *Ejercicio 14.- Diseña programa que almacene las temperaturas medias de
un mes que introduzca un usuario. Para hacerlo más sencillo vamos a
suponer que el mes tiene 28 días y está formado por 4 semanas de 7 días.
Hasta que el usuario pulse 5, mostrar un menú que nos permita:
1. Rellenar las temperaturas.
2. Mostrar las temperaturas.
3. Visualizar la temperatura media del mes.
4. Día o días más calurosos del mes. Ejemplo: El día o días más calurososfueron:
• ElJueves de la Semana 3 con 40 grados.
• El Sábado de la Semana 4 con 40 grados.
5. Salir del programa.
• Fíjate que necesitarás otro array con el nombre de los días de la semana.
 * /
 **/

public class Ejercicio14 {
    
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[][] temperaturas = new double[4][7]; // 4 semanas, 7 días
        boolean datosRellenados = false;
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Rellenar las temperaturas.");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Visualizar la temperatura media del mes.");
            System.out.println("4. Dia o dias mas calurosos del mes.");
            System.out.println("5. Salir del programa.");
            System.out.print("Elige una opcion: ");
            
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    rellenarTemperaturas(temperaturas, teclado);
                    datosRellenados = true;
                    break;
                case 2:
                    if (datosRellenados) {
                        mostrarTemperaturas(temperaturas, diasSemana);
                    } else {
                        System.out.println("Primero debes rellenar las temperaturas (opcion 1).");
                    }
                    break;
                case 3:
                    if (datosRellenados) {
                        mostrarMediaMes(temperaturas);
                    } else {
                        System.out.println("Primero debes rellenar las temperaturas (opcion 1).");
                    }
                    break;
                case 4:
                    if (datosRellenados) {
                        mostrarDiasMasCalurosos(temperaturas, diasSemana);
                    } else {
                        System.out.println("Primero debes rellenar las temperaturas (opcion 1).");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        } while (opcion != 5);

       
    }

    // 1. Rellenar las temperaturas
    public static void rellenarTemperaturas(double[][] temp, Scanner sc) {
        for (int semana = 0; semana < 4; semana++) {
            System.out.println("\n--- Semana " + (semana + 1) + " ---");
            for (int dia = 0; dia < 7; dia++) {
                System.out.print("Introduce la temperatura del " + 
                    obtenerNombreDia(dia) + ": ");
                temp[semana][dia] = sc.nextDouble();
            }
        }
        System.out.println("Temperaturas introducidas correctamente.");
    }

    // Utilidad para obtener el nombre del día
    public static String obtenerNombreDia(int indice) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        return dias[indice];
    }

    // 2. Mostrar las temperaturas
    public static void mostrarTemperaturas(double[][] temp, String[] dias) {
        System.out.println("\n--- Temperaturas del mes ---");
        for (int semana = 0; semana < 4; semana++) {
            System.out.println("Semana " + (semana + 1) + ":");
            for (int dia = 0; dia < 7; dia++) {
                System.out.printf("%s: %.1f°C%n", dias[dia], temp[semana][dia]);
            }
            System.out.println(); // línea en blanco entre semanas
        }
    }

    // 3. Temperatura media del mes
    public static void mostrarMediaMes(double[][] temp) {
        double suma = 0;
        int totalDias = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                suma += temp[i][j];
                totalDias++;
            }
        }
        double media = suma / totalDias;
        System.out.printf("\nLa temperatura media del mes es: %.2f°C%n", media);
    }

    // 4. Días más calurosos
    public static void mostrarDiasMasCalurosos(double[][] temp, String[] dias) {
        // Primero encontramos la temperatura máxima
        double maxTemp = temp[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (temp[i][j] > maxTemp) {
                    maxTemp = temp[i][j];
                }
            }
        }

        // Luego mostramos todos los días que tienen esa temperatura máxima
        System.out.println("\nEl dia o dias mas calurosos fueron:");
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                if (temp[semana][dia] == maxTemp) {
                    System.out.printf("• El %s de la Semana %d con %.1f grados.%n",
                            dias[dia], semana + 1, maxTemp);
                }
                
            }
        }
    }
}

