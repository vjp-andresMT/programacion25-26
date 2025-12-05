
package tema06;

/**
 *
 * @author andres
 */

    // Clase Televisor que implementa la interfaz ControlRemoto
class Televisor implements ControlRemoto {
    // Atributos de la clase Televisor
    private boolean encendido;  // Estado de encendido/apagado
    private int canal;          // Canal actual (inicializado en 1)
    private int volumen;        // Volumen actual (inicializado en 10)
    
    // Constructor de la clase Televisor
    public Televisor() {
        this.encendido = false;  // Por defecto, el televisor está apagado
        this.canal = 1;          // Canal inicial es 1
        this.volumen = 10;       // Volumen inicial es 10
    }
    
    // Métodos getter y setter (excepto para encendido)
    
    // Obtener el canal actual
    public int getCanal() {
        return canal;
    }
    
    // Cambiar el canal (solo para uso interno, no desde control remoto)
    public void setCanal(int canal) {
        if (canal > 0) {  // Validamos que el canal sea positivo
            this.canal = canal;
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
    
    // Verificar si el televisor está encendido
    public boolean isEncendido() {
        return encendido;
    }
    
    // Método para mostrar la información del televisor
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL TELEVISOR ===");
        System.out.println("Estado: " + (encendido ? "ENCENDIDO" : "APAGADO"));
        if (encendido) {
            System.out.println("Canal actual: " + canal);
            System.out.println("Volumen actual: " + volumen);
        }
        System.out.println("==================================");
    }
    
    // Implementación de los métodos de la interfaz ControlRemoto
    
    // Método para encender el televisor
    @Override
    public void encender() {
        // Solo encender si no está ya encendido
        if (!encendido) {
            encendido = true;
            System.out.println("Televisor encendido. Canal actual: " + canal);
        } else {
            System.out.println("El televisor ya está encendido.");
        }
    }
    
    // Método para apagar el televisor
    @Override
    public void apagar() {
        // Solo apagar si está encendido
        if (encendido) {
            System.out.println("La TV se apagará en 10s");
            encendido = false;
            // Aquí podríamos implementar un retraso de 10 segundos si fuera necesario
        } else {
            System.out.println("El televisor ya está apagado.");
        }
    }
    
    // Método para bajar el volumen
    @Override
    public void bajarVolumen() {
        // Solo bajar volumen si está encendido
        if (encendido) {
            // Decrementar en 1, pero no menos de 0
            if (volumen > 0) {
                volumen--;
                System.out.println("Volumen actual: " + volumen);
            } else {
                System.out.println("El volumen ya está al mínimo (0).");
            }
        } else {
            System.out.println("No se puede bajar el volumen. El televisor está apagado.");
        }
    }
    
    // Método para subir el volumen
    @Override
    public void subirVolumen() {
        // Solo subir volumen si está encendido
        if (encendido) {
            // Incrementar en 1, pero no más de 100
            if (volumen < 100) {
                volumen++;
                System.out.println("Volumen actual: " + volumen);
            } else {
                System.out.println("El volumen ya está al máximo (100).");
            }
        } else {
            System.out.println("No se puede subir el volumen. El televisor está apagado.");
        }
    }
    
    // Método para cambiar de canal
    @Override
    public void cambiarCanal(float canal) {
        // Solo cambiar canal si está encendido
        if (encendido) {
            // Convertimos el float a int (televisores normalmente usan canales enteros)
            int nuevoCanal = (int) canal;
            if (nuevoCanal > 0) {
                this.canal = nuevoCanal;
                System.out.println("Canal actual: " + this.canal);
            } else {
                System.out.println("Error: El canal debe ser un número positivo.");
            }
        } else {
            System.out.println("No se puede cambiar de canal. El televisor está apagado.");
        }
    }
}

