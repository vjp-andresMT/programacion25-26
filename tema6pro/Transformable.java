
package tema06;

/**
 *
 * @author andres
 */

    // Interfaz Transformable con las operaciones requeridas
     interface Transformable {
    // Devuelve una cadena con todas las cadenas del objeto separadas por '#'
    String concatenarTodo();
    
    // Devuelve una cadena con las iniciales de todas las cadenas del objeto
    String obtenerIniciales();
    
    // Cuenta todas las vocales de todas las cadenas del objeto
    void contarVocales();
    
    // Devuelve la cadena más larga de todas las cadenas del objeto
    String obtenerCadenaMasLarga();
    
    // Busca una cadena específica en el objeto
    boolean buscarCadena(String cadena);
}

