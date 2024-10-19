package com.mycompany.mavenproject2;
import java.util.ArrayList;
import java.util.List;
public class Usuarios {
    private String nombre;
    private String apellido;
    private int cui;
    private final List<libros> librosPrestados;
    
    public Usuarios (String nombre, String apellido, int cui){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cui=cui;
        this.librosPrestados = new ArrayList<>();
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
        public List<libros> getLibrosPrestados() {
        return librosPrestados;
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
   
    public void prestarLibro(libros libro) {
        librosPrestados.add(libro);
    }
    
}
