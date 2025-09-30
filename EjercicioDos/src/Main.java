
import Clase.Instituto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alumno
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Instituto> instituto = new ArrayList<>();
        int opcion = 0;
        String texto = "";

        do {
            opcion = menu(scanner);

            switch (opcion) {
                case 1:
                    rellenarLista(scanner, instituto);
                    break;
                case 2:
                    mostrarInstituto(instituto);
                    break;
                case 3:
                    mostrarInstitutoYAlumno(instituto, texto);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion inválida. Elige una opcion correcta.");
            }

        } while (opcion != 4);

    }

    //crearemos el menú que nos devolverá la opcion introducida por el usuario.
    public static int menu(Scanner scanner) {
        System.out.println("Elige una opcion: ");
        System.out.println("1.Rellenar instituto: ");
        System.out.println("2.Mostrar instituto: ");
        System.out.println(" Mostrar instituto con alumnos: ");
        System.out.println("4.Salir");

        return scanner.nextInt();
    }

    //rellenamos la lista pasando los datos que pedimos (nombre, localidad, alumno y dni) a la lista que hemos declarado en el ArrayList.
    //también pediremos al usuario si quiere seguir introduciendo más datos o no. 
    public static void rellenarLista(Scanner scanner, ArrayList<Instituto> insti) {
        String opcion = "";
        do {
            System.out.println("Introduce el nombre del instituto: ");
            String nombre = scanner.next();

            System.out.println("Introduce la localidad del instituto: ");
            String localidad = scanner.next();

            System.out.println("Introduce el nombre de un alumno: ");
            String nombreAlumno = scanner.next();

            System.out.println("Introduce el DNI del alumno: ");
            String dni = scanner.next();

            insti.add(new Instituto());

            System.out.println("¿Desea añadir otro alumno? (si/no)");
            opcion = scanner.next();
        } while (opcion.equalsIgnoreCase("si"));
    }

    //Mostraremos los datos del ArrayList. Lo primero que haremos es comprobar si la lista está vacia, en caso de estarlo avisaremos al usuario. 
    //Si la lista tiene dato, iteraremos y mostraremos los datos del instituto, localidad, etc. 
    public static void mostrarInstituto(ArrayList<Instituto> insti) {
        if (insti.isEmpty()) {
            System.out.println("La lista no tiene datos.");
        }
        Iterator iterador = (Iterator) new Instituto();

        for (Instituto i : insti) {
            System.out.println("Nombre " + i.getNombreInstituto() + " localidad " + i.getLocalidad() + " nombre alumno " + i.getAlumno());
        }

    }

    //Mostraremos por pantalla el nombre del instituto y del alumno que ha buscado el usuario. 
    public static void mostrarInstitutoYAlumno(ArrayList<Instituto> insti, String texto) {
        if (insti.isEmpty()) {
            System.out.println("La lista no tiene datos para mostrar.");
        }

    }
}
