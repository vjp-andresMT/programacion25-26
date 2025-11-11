
package repasotema1.pkg2.pkg3.pkg4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author andres
 * Ejercicio que aplica todos los conocimientos adqueridos del tema 1 al 4
 */

  

public class SistemaGestionAcademica {
    
    // Constantes para configuración del sistema
    private static final int MAX_ESTUDIANTES = 50;
    private static final double NOTA_APROBACION = 6.0;
    private static final int EDAD_MINIMA = 16;
    private static final int EDAD_MAXIMA = 80;
    
    // Arrays para almacenar datos
    private static String[] nombres = new String[MAX_ESTUDIANTES];
    private static int[] edades = new int[MAX_ESTUDIANTES];
    private static double[] notas = new double[MAX_ESTUDIANTES];
    private static int contadorEstudiantes = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== SISTEMA DE GESTIÓN ACADÉMICA ===");
        
        boolean ejecutando = true;
        
        while(ejecutando) {
            mostrarMenu();
            int opcion = obtenerOpcionValida(scanner);
            
            switch(opcion) {
                case 1:
                    agregarEstudiante(scanner);
                    break;
                case 2:
                    generarEstudiantesAleatorios(random, 5);
                    break;
                case 3:
                    mostrarEstudiantes();
                    break;
                case 4:
                    calcularEstadisticas();
                    break;
                case 5:
                    buscarEstudiante(scanner);
                    break;
                case 6:
                    actualizarNota(scanner);
                    break;
                case 7:
                    ejecutando = false;
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        
        scanner.close();
    }
    
    // Método estático para mostrar menú
    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Generar estudiantes aleatorios");
        System.out.println("3. Mostrar todos los estudiantes");
        System.out.println("4. Ver estadísticas");
        System.out.println("5. Buscar estudiante");
        System.out.println("6. Actualizar nota");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    // Método estático para obtener opción válida
    public static int obtenerOpcionValida(Scanner scanner) {
        while(true) {
            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                if(opcion >= 1 && opcion <= 7) {
                    return opcion;
                } else {
                    System.out.print("Opción debe ser entre 1-7. Intente nuevamente: ");
                }
            } catch(NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número: ");
            }
        }
    }
    
    // Método estático para agregar estudiante
    public static void agregarEstudiante(Scanner scanner) {
        if(contadorEstudiantes >= MAX_ESTUDIANTES) {
            System.out.println("Capacidad máxima alcanzada.");
            return;
        }
        
        System.out.println("\n--- AGREGAR ESTUDIANTE ---");
        
        // Entrada y validación del nombre
        String nombre;
        while(true) {
            System.out.print("Nombre del estudiante: ");
            nombre = scanner.nextLine().trim();
            if(!nombre.isEmpty() && nombre.length() >= 2) {
                break;
            }
            System.out.println("El nombre debe tener al menos 2 caracteres.");
        }
        
        // Entrada y validación de la edad
        int edad = 0;
        boolean edadValida = false;
        while(!edadValida) {
            try {
                System.out.print("Edad del estudiante (" + EDAD_MINIMA + "-" + EDAD_MAXIMA + "): ");
                edad = Integer.parseInt(scanner.nextLine());
                if(edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA) {
                    edadValida = true;
                } else {
                    System.out.println("La edad debe estar entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA);
                }
            } catch(NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
            }
        }
        
        // Entrada y validación de la nota
        double nota = 0.0;
        boolean notaValida = false;
        while(!notaValida) {
            try {
                System.out.print("Nota del estudiante (0-10): ");
                nota = Double.parseDouble(scanner.nextLine());
                if(nota >= 0 && nota <= 10) {
                    notaValida = true;
                } else {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } catch(NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
            }
        }
        
        // Almacenar datos
        nombres[contadorEstudiantes] = nombre;
        edades[contadorEstudiantes] = edad;
        notas[contadorEstudiantes] = Math.round(nota * 100.0) / 100.0; // Redondear a 2 decimales
        contadorEstudiantes++;
        
        System.out.println("✅ Estudiante agregado exitosamente.");
    }
    
    // Método estático para generar estudiantes aleatorios
    public static void generarEstudiantesAleatorios(Random random, int cantidad) {
        if(contadorEstudiantes + cantidad > MAX_ESTUDIANTES) {
            System.out.println("No hay espacio para " + cantidad + " estudiantes más.");
            return;
        }
        
        String[] nombresAleatorios = {"Ana García", "Carlos López", "María Rodríguez", "José Martínez", 
                                    "Laura Hernández", "Miguel González", "Elena Pérez", "David Sánchez",
                                    "Isabel Ramírez", "Francisco Torres"};
        
        for(int i = 0; i < cantidad; i++) {
            nombres[contadorEstudiantes] = nombresAleatorios[random.nextInt(nombresAleatorios.length)];
            edades[contadorEstudiantes] = random.nextInt(EDAD_MAXIMA - EDAD_MINIMA + 1) + EDAD_MINIMA;
            notas[contadorEstudiantes] = Math.round((random.nextDouble() * 10) * 100.0) / 100.0;
            contadorEstudiantes++;
        }
        
        System.out.println("✅ " + cantidad + " estudiantes aleatorios generados.");
    }
    
    // Método estático para mostrar estudiantes
    public static void mostrarEstudiantes() {
        if(contadorEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        System.out.printf("%-5s %-20s %-8s %-8s %-12s%n", 
                         "ID", "NOMBRE", "EDAD", "NOTA", "ESTADO");
        System.out.println("------------------------------------------------");
        
        for(int i = 0; i < contadorEstudiantes; i++) {
            String estado = determinarEstado(notas[i]);
            System.out.printf("%-5d %-20s %-8d %-8.2f %-12s%n", 
                            (i+1), nombres[i], edades[i], notas[i], estado);
        }
    }
    
    // Método estático para determinar estado académico
    public static String determinarEstado(double nota) {
        if(nota >= NOTA_APROBACION) {
            if(nota >= 9) return "EXCELENTE";
            else if(nota >= 8) return "MUY BUENO";
            else if(nota >= 7) return "BUENO";
            else return "APROBADO";
        } else {
            if(nota >= 5) return "REPITE";
            else return "REPROBADO";
        }
    }
    
    // Método estático para calcular estadísticas
    public static void calcularEstadisticas() {
        if(contadorEstudiantes == 0) {
            System.out.println("No hay datos para calcular estadísticas.");
            return;
        }
        
        double sumaNotas = 0;
        double notaMaxima = notas[0];
        double notaMinima = notas[0];
        int aprobados = 0;
        int excelentes = 0;
        
        for(int i = 0; i < contadorEstudiantes; i++) {
            sumaNotas += notas[i];
            
            if(notas[i] > notaMaxima) notaMaxima = notas[i];
            if(notas[i] < notaMinima) notaMinima = notas[i];
            
            if(notas[i] >= NOTA_APROBACION) {
                aprobados++;
                if(notas[i] >= 9) excelentes++;
            }
        }
        
        double promedio = sumaNotas / contadorEstudiantes;
        double porcentajeAprobados = (aprobados * 100.0) / contadorEstudiantes;
        
        System.out.println("\n--- ESTADÍSTICAS ACADÉMICAS ---");
        System.out.printf("Total estudiantes: %d%n", contadorEstudiantes);
        System.out.printf("Promedio general: %.2f%n", promedio);
        System.out.printf("Nota más alta: %.2f%n", notaMaxima);
        System.out.printf("Nota más baja: %.2f%n", notaMinima);
        System.out.printf("Estudiantes aprobados: %d (%.1f%%)%n", aprobados, porcentajeAprobados);
        System.out.printf("Estudiantes excelentes: %d%n", excelentes);
        
        // Análisis adicional usando Math
        double varianza = calcularVarianza(notas, promedio, contadorEstudiantes);
        System.out.printf("Desviación estándar: %.2f%n", Math.sqrt(varianza));
    }
    
    // Método estático para calcular varianza
    public static double calcularVarianza(double[] datos, double promedio, int n) {
        double suma = 0;
        for(int i = 0; i < n; i++) {
            suma += Math.pow(datos[i] - promedio, 2);
        }
        return suma / n;
    }
    
    // Método estático para buscar estudiante
    public static void buscarEstudiante(Scanner scanner) {
        if(contadorEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        
        System.out.print("\nIngrese nombre o parte del nombre a buscar: ");
        String busqueda = scanner.nextLine().toLowerCase();
        
        boolean encontrado = false;
        System.out.println("\n--- RESULTADOS DE BÚSQUEDA ---");
        
        for(int i = 0; i < contadorEstudiantes; i++) {
            if(nombres[i].toLowerCase().contains(busqueda)) {
                if(!encontrado) {
                    System.out.printf("%-5s %-20s %-8s %-8s %-12s%n", 
                                    "ID", "NOMBRE", "EDAD", "NOTA", "ESTADO");
                    System.out.println("------------------------------------------------");
                    encontrado = true;
                }
                
                String estado = determinarEstado(notas[i]);
                System.out.printf("%-5d %-20s %-8d %-8.2f %-12s%n", 
                                (i+1), nombres[i], edades[i], notas[i], estado);
            }
        }
        
        if(!encontrado) {
            System.out.println("No se encontraron estudiantes con ese nombre.");
        }
    }
    
    // Método estático para actualizar nota
    public static void actualizarNota(Scanner scanner) {
        if(contadorEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        
        mostrarEstudiantes();
        
        int id = 0;
        boolean idValido = false;
        
        while(!idValido) {
            try {
                System.out.print("\nIngrese el ID del estudiante a actualizar: ");
                id = Integer.parseInt(scanner.nextLine());
                
                if(id >= 1 && id <= contadorEstudiantes) {
                    idValido = true;
                } else {
                    System.out.println("ID debe estar entre 1 y " + contadorEstudiantes);
                }
            } catch(NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
            }
        }
        
        // Mostrar datos actuales
        int indice = id - 1;
        System.out.printf("Estudiante seleccionado: %s (Nota actual: %.2f)%n", 
                         nombres[indice], notas[indice]);
        
        // Solicitar nueva nota
        double nuevaNota = 0.0;
        boolean notaValida = false;
        
        while(!notaValida) {
            try {
                System.out.print("Nueva nota (0-10): ");
                nuevaNota = Double.parseDouble(scanner.nextLine());
                if(nuevaNota >= 0 && nuevaNota <= 10) {
                    notaValida = true;
                } else {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } catch(NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
            }
        }
        
        // Actualizar nota
        double notaAnterior = notas[indice];
        notas[indice] = Math.round(nuevaNota * 100.0) / 100.0;
        
        System.out.printf("✅ Nota actualizada: %.2f → %.2f%n", notaAnterior, notas[indice]);
        
        // Mostrar cambio de estado si aplica
        String estadoAnterior = determinarEstado(notaAnterior);
        String estadoNuevo = determinarEstado(notas[indice]);
        
        if(!estadoAnterior.equals(estadoNuevo)) {
            System.out.printf("Cambio de estado: %s → %s%n", estadoAnterior, estadoNuevo);
        }
    }
}

