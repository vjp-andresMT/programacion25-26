
package tema06;

/**
 *
 * @author andres
 */

    // Clase Radio que implementa la interfaz ControlRemoto
class Radio implements ControlRemoto {
    // Atributos de la clase Radio
    private boolean encendido;  // Estado de encendido/apagado
    private float emisora;      // Emisora actual (inicializado en 80.0)
    private int volumen;        // Volumen actual (inicializado en 15)
    
    // Constructor de la clase Radio
    public Radio() {
        this.encendido = false;  // Por defecto, la radio está apagada
        this.emisora = 80.0f;    // Emisora inicial es 80.0
        this.volumen = 15;       // Volumen inicial es 15
    }
    
    // Métodos getter y setter (excepto para encendido)
    
    // Obtener la emisora actual
    public float getEmisora() {
        return emisora;
    }
    
    // Cambiar la emisora (solo para uso interno, no desde control remoto)
    public void setEmisora(float emisora) {
        if (emisora > 0) {  // Validamos que la emisora sea positiva
            this.emisora = emisora;
        }
    }
    
    // Obtener el volumen actual
    public int getVolumen() {
        return volumen;
    }
    
    // Cambiar el volumen (solo para uso interno, no desde control remoto)
    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 100) {  // Validamos rango de volumen
            this.volumen = volumen;
        }
    }
    
    // Verificar si la radio está encendida
    public boolean isEncendido() {
        return encendido;
    }
    
    // Método para mostrar la información de la radio
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DE LA RADIO ===");
        System.out.println("Estado: " + (encendido ? "ENCENDIDA" : "APAGADA"));
        if (encendido) {
            System.out.println("Emisora actual: " + emisora + " FM");
            System.out.println("Volumen actual: " + volumen);
        }
        System.out.println("================================");
    }
    
    // Implementación de los métodos de la interfaz ControlRemoto
    
    // Método para encender la radio
    @Override
    public void encender() {
        // Solo encender si no está ya encendida
        if (!encendido) {
            encendido = true;
            System.out.println("Radio encendida.");
        } else {
            System.out.println("La radio ya está encendida.");
        }
    }
    
    // Método para apagar la radio
    @Override
    public void apagar() {
        // Solo apagar si está encendida
        if (encendido) {
            encendido = false;
            System.out.println("Radio apagada.");
        } else {
            System.out.println("La radio ya está apagada.");
        }
    }
    
    // Método para bajar el volumen
    @Override
    public void bajarVolumen() {
        // Solo bajar volumen si está encendida
        if (encendido) {
            // Decrementar en 5, pero no menos de 0
            if (volumen >= 5) {
                volumen -= 5;
                System.out.println("Volumen bajado 5 unidades. Volumen actual: " + volumen);
            } else {
                // Si el volumen es menor a 5, bajamos al mínimo (0)
                volumen = 0;
                System.out.println("Volumen al mínimo (0).");
            }
        } else {
            System.out.println("No se puede bajar el volumen. La radio está apagada.");
        }
    }
    
    // Método para subir el volumen
    @Override
    public void subirVolumen() {
        // Solo subir volumen si está encendida
        if (encendido) {
            // Incrementar en 5, pero no más de 100
            if (volumen <= 95) {
                volumen += 5;
                System.out.println("Volumen subido 5 unidades. Volumen actual: " + volumen);
            } else {
                // Si el volumen es mayor a 95, subimos al máximo (100)
                volumen = 100;
                System.out.println("Volumen al máximo (100).");
            }
        } else {
            System.out.println("No se puede subir el volumen. La radio está apagada.");
        }
    }
    
    // Método para cambiar de emisora (canal en la interfaz)
    @Override
    public void cambiarCanal(float canal) {
        // Solo cambiar emisora si está encendida
        if (encendido) {
            if (canal > 0) {
                this.emisora = canal;
                System.out.println("Emisora cambiada a: " + emisora + " FM");
            } else {
                System.out.println("Error: La emisora debe ser un número positivo.");
            }
        } else {
            System.out.println("No se puede cambiar de emisora. La radio está apagada.");
        }
    }
}

