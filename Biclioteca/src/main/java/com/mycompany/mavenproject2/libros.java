
package com.mycompany.mavenproject2;
public class libros {
    private String nombre;
    private String poseedor;
    private int codigo;
        private int dia;
    private int mes;
    private int an;
    public libros (String nombre, int codigo){
        this.nombre=nombre;
        this.poseedor="nadie";
        this.codigo=codigo;
        this.dia=0;
        this.an=0;
        this.mes=0;
    }
    
    
    public libros (String nombre, String poseedor, int cantidad, int codigo, int dia, int mes, int an){
        this.nombre=nombre;
        this.poseedor=poseedor;
        this.codigo=codigo;
        this.dia=dia;
        this.an=an;
        this.mes=mes;
    }
    
    public String getnombre(){
        return nombre;
    }
    public String getposeedor(){
        return poseedor;
    }
    public int getcodigo(){
        return codigo;
    }
    public int getdia(){
        return dia;
    }
    public int getmes(){
        return mes;
    }
    public int getan(){
        return an;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setposeedor (String poseedor){
        this.poseedor=poseedor;
    }
    public void setcodigo (int codigo){
        this.codigo=codigo;
    }
    public void setdia (int dia){
        this.dia=dia;
    }
    public void setmes (int mes){
        this.mes=mes;
    }
    public void setan (int an){
        this.an=an;
    }
    
    public String libroinfo() {
    return "Nombre: " + nombre + "\n" +
           "En presatmo a: " + poseedor + "\n" +
           "Código de producto: " + codigo + "\n" +
           "Fecha de prestamo: " +dia +"/" +mes +"/" +an;
}

}
