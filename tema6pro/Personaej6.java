
package tema06;

/**
 *
 * @author andres
 */

    // Clase Persona que implementa la interfaz Transformable
class Personaej6 implements Transformable {
    // Atributos de la clase Persona
    private String nombre;
    private String apellidos;
    private String alias;
    
    // Constructor de la clase Persona
    public Personaej6(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    
    // Métodos getter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getAlias() {
        return alias;
    }
    
    // Implementación de los métodos de la interfaz Transformable
    
    // Método para concatenar todas las cadenas separadas por '#'
    @Override
    public String concatenarTodo() {
        // Concatenamos nombre, apellidos y alias separados por '#'
        return nombre + "#" + apellidos + "#" + alias;
    }
    
    // Método para obtener las iniciales de todas las cadenas
    @Override
    public String obtenerIniciales() {
        // Tomamos el primer carácter de cada cadena (si no está vacía)
        String inicialNombre = (nombre != null && !nombre.isEmpty()) ? String.valueOf(nombre.charAt(0)) : "";
        String inicialApellidos = (apellidos != null && !apellidos.isEmpty()) ? String.valueOf(apellidos.charAt(0)) : "";
        String inicialAlias = (alias != null && !alias.isEmpty()) ? String.valueOf(alias.charAt(0)) : "";
        
        // Concatenamos las iniciales
        return inicialNombre + inicialApellidos + inicialAlias;
    }
    
    // Método para contar todas las vocales de todas las cadenas
    @Override
    public void contarVocales() {
        // Unimos todas las cadenas de la persona
        String todasLasCadenas = nombre + apellidos + alias;
        
        // Contamos las vocales (mayúsculas y minúsculas)
        int contadorVocales = 0;
        for (int i = 0; i < todasLasCadenas.length(); i++) {
            char caracter = todasLasCadenas.charAt(i);
            // Verificamos si el carácter es una vocal
            if (esVocal(caracter)) {
                contadorVocales++;
            }
        }
        
        // Mostramos el resultado por pantalla
        System.out.println("La persona tiene un total de " + contadorVocales + " vocales.");
    }
    
    // Método auxiliar para verificar si un carácter es una vocal
    private boolean esVocal(char c) {
        c = Character.toLowerCase(c); // Convertimos a minúscula para simplificar la comparación
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú';
    }
    
    // Método para obtener la cadena más larga
    @Override
    public String obtenerCadenaMasLarga() {
        // Comparamos la longitud de cada atributo
        if (nombre.length() >= apellidos.length() && nombre.length() >= alias.length()) {
            return nombre;
        } else if (apellidos.length() >= nombre.length() && apellidos.length() >= alias.length()) {
            return apellidos;
        } else {
            return alias;
        }
    }
    
    // Método para buscar una cadena específica en el objeto
    @Override
    public boolean buscarCadena(String cadena) {
        // Comparamos la cadena buscada con cada atributo (ignorando mayúsculas/minúsculas)
        return nombre.equalsIgnoreCase(cadena) || 
               apellidos.equalsIgnoreCase(cadena) || 
               alias.equalsIgnoreCase(cadena);
    }
}

