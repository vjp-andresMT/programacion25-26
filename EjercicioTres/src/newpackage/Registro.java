/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;



/**
 *
 * @author alumno
 */
public class Registro extends ObjectOutputStream {

    private String nombre;
    private String titulo;
    private String fechaEntrega;

    //constructor: 
    public Registro() throws IOException, SecurityException {
        super();
    }
    public Registro(OutputStream out) throws IOException{
        super(out);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
@Override
protected void writeStreamHeader() throws IOException{
    
}
}
