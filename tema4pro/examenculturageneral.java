
package tema4;
import java.util.Scanner;

/**
 *
 * @author andres
 * ejercicio 20 del tema 4 realizado en clase el 3/11/2025
 */
    public class examenculturageneral { // Creamos la clase examenculturageneral donde tendremos declaradas las constantes que usaremos durante el programa
      public final static String RESPUESTA1 = "Madrid";
      public final static String RESPUESTA2 = "Colón";
      
      public final static String PREGUNTA1 = "¿Cuál es la capital de España";
      public final static String PREGUNTA2 = "¿Quién descubrio América?";
      
      public final static int PUNTUACION = 5;
      
      public static String  pedirRespuesta() { // en este metodo pedir respuesta le pediremos al usuario que introduzca la respuesta a las preguntas
          Scanner entrada = new Scanner(System.in);
          String respuestaUsuario = entrada.nextLine();
          return respuestaUsuario;
      }
      
      public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) { // en este metodo comprobaremos la respuesta introducida por el usuario
          boolean correcto;
          if(respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)){
              correcto = true;
          } else {
              correcto = false;
          }
          return correcto;
              
      }
      

      public static void main(String[] args) { // Clase principal donde se ejecutara el programa en el llamaremos a los metodos creados anteriormente 
        
       int puntuacionFinal = 0;
       String respuesta;
          System.out.println("EXAMEN DE CULTURA GENERAL");
          System.out.println(PREGUNTA1);
          respuesta = pedirRespuesta();
          
          if(comprobarRespuesta(respuesta,RESPUESTA1)){
              System.out.println("Muy bien,respuesta correcta");
              puntuacionFinal += PUNTUACION;
          } else {
              System.out.println("No es correcto.La respuesta correcta sería " + RESPUESTA2);
          }
          System.out.println(PREGUNTA2);
          respuesta = pedirRespuesta();
          
          if (comprobarRespuesta(respuesta,RESPUESTA2)) {
              System.out.println("Muy bien,respuesta correcta");
              
          }
                  
    }
}
