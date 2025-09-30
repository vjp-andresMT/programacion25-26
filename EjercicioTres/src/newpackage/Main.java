/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Main {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            Scanner scanner = new Scanner(System.in);
            fw = new FileWriter("registro.txt", true);
            int opcion = 0;
            do {
                opcion = menu(scanner);

                switch (opcion) {
                    case 1:
                        registrarPracticas(scanner);
                        break;
                    case 2:
                        mostrarPracticas();
                        break;
                    case 3:
                        buscarRegistro(scanner);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Introduzca una opcion válida");

                }

            } while (opcion != 4);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static int menu(Scanner scanner) {
        System.out.println("--Bienvenido al registro--");
        System.out.println("1.Registrar la práctica");
        System.out.println("2.Mostrar prácticas registradas.");
        System.out.println("3.Buscar registro");
        System.out.println("4.Salir del programa.");

        return scanner.nextInt();
    }

    public static void registrarPracticas(Scanner scanner) {
        String opcion = "";
        try {
            FileWriter fw = new FileWriter("registro.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Introduce el nombre del alumno: ");
            String nombre = scanner.next();
            System.out.println("Introduce el tituto del registro: ");
            String titulo = scanner.next();
            System.out.println("Introduce la fecha: ");
            String fecha = scanner.next();

            System.out.println("¿Quiere introducir otro alumno al fichero? (Si/no)");
            if (opcion.equalsIgnoreCase("Si"));

            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void mostrarPracticas() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("registro.txt");
            br = new BufferedReader(fr);

            while (br == null) {
                try {
                    br.read();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void buscarRegistro(Scanner scanner) {
        FileReader fr = null;
        BufferedReader br = null;
        String busqueda = "";

        try {
            fr = new FileReader("registro.txt");
            br = new BufferedReader(fr);

            System.out.println("Introduce el nombre del usuario que quieres buscar: ");
            busqueda = scanner.next();

            if (busqueda != null) {
                System.out.println("Registro encontrado");
            } else {
                System.out.println("El nombre introducido no existe");
            }

            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
