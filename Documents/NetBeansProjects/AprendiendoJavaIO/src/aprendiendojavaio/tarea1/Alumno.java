/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendojavaio.tarea1;

/**
 *
 * @author vegramiv
 */
public class Alumno {
    private int numero;
    private String nombre;
    private String apellidos;

    
    // Getters
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    
    
    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
