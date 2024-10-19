
package com.mycompany.mavenproject2;

public class Personas {
    private String nombre;
    private String apellido;
    private int cui;
    
    public Personas (String nombre, String apellido, int cui){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cui=cui;
    }
    
    public String getnombre(){
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public int getcui(){
        return cui;
    }
    
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setapellido(String apellido){
        this.apellido=apellido;
    }
    public void setcui(int cui){
        this.cui=cui;
    }
    
}
