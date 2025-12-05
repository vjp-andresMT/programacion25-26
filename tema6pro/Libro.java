
package tema06;

/**
 *
 * @author andre
 */

    // Clase Libro que implementa la interfaz Transformable
class Libro implements Transformable {
    // Atributos de la clase Libro
    private String titulo;
    private String autor;
    private String genero;
    
    // Constructor de la clase Libro
    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    // Métodos getter para acceder a los atributos
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getGenero() {
        return genero;
    }
    
    // Implementación de los métodos de la interfaz Transformable
    
    // Método para concatenar todas las cadenas separadas por '#'
    @Override
    public String concatenarTodo() {
        // Concatenamos título, autor y género separados por '#'
        return titulo + "#" + autor + "#" + genero;
    }
    
    // Método para obtener las iniciales de todas las cadenas
    @Override
    public String obtenerIniciales() {
        // Tomamos el primer carácter de cada cadena (si no está vacía)
        String inicialTitulo = (titulo != null && !titulo.isEmpty()) ? String.valueOf(titulo.charAt(0)) : "";
        String inicialAutor = (autor != null && !autor.isEmpty()) ? String.valueOf(autor.charAt(0)) : "";
        String inicialGenero = (genero != null && !genero.isEmpty()) ? String.valueOf(genero.charAt(0)) : "";
        
        // Concatenamos las iniciales
        return inicialTitulo + inicialAutor + inicialGenero;
    }
    
    // Método para contar todas las vocales de todas las cadenas
    @Override
    public void contarVocales() {
        // Unimos todas las cadenas del libro
        String todasLasCadenas = titulo + autor + genero;
        
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
        System.out.println("El libro tiene un total de " + contadorVocales + " vocales.");
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
        if (titulo.length() >= autor.length() && titulo.length() >= genero.length()) {
            return titulo;
        } else if (autor.length() >= titulo.length() && autor.length() >= genero.length()) {
            return autor;
        } else {
            return genero;
        }
    }
    
    // Método para buscar una cadena específica en el objeto
    @Override
    public boolean buscarCadena(String cadena) {
        // Comparamos la cadena buscada con cada atributo (ignorando mayúsculas/minúsculas)
        return titulo.equalsIgnoreCase(cadena) || 
               autor.equalsIgnoreCase(cadena) || 
               genero.equalsIgnoreCase(cadena);
    }
}

