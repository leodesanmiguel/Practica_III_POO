/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.System.out;
import static sun.rmi.transport.TransportConstants.Return;

/**
 *
 * @author profl
 */
public class Persona {
    private String nombre="";
    private String apellido="";
    
    public static void main(String[] args){
        
    }
    
    
    public String MostrarCompleto(){
        
        return getApellido() + ", " + getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
