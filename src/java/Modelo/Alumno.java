/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author profl
 */
public final class Alumno {
    private int comision = 2108;
    private String  descripcion = "";

    public Alumno(int comision, String descripcion) {
        setComision(comision);
        setDescripcion(descripcion);
        
    }

    public Alumno(int comision) {
        
        setComision(comision);
        setDescripcion("");
        
    }   

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        if (comision != 0){
        this.comision = comision;
        } else       {
            this.comision = 1000;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        
        if (!"".equals(descripcion)) {
                    this.descripcion = descripcion;
        } else {
        this.descripcion = "no tiene una descripción adecuada!";
        }
    }
    
    
    

    
}
