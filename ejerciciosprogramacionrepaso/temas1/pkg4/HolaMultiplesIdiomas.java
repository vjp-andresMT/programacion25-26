
package ejerciciosprogramacionrepaso.temas1.pkg4;

/**
 *
 * @author andres
 */

    public class HolaMultiplesIdiomas {
 
    public static void main(String[] args ) {
        String[] saludo = {"hola", "Hello", "Bonjour","ciao","hallo"};
        for(int i = 0; i < saludo.length; i++) {
            System.out.println(saludo[i] + "Mundo - saludo " + (i+1));
        }
    }
}
