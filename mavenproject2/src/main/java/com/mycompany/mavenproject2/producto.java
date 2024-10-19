
package com.mycompany.mavenproject2;
public class producto {
    private String nombre;
    private int precio;
    private int cantidad;
    private int codigo;
    
    public producto (String nombre, int precio){
        this.nombre=nombre;
        this.precio=precio;
            this.cantidad = 0; 
    this.codigo = 0;   
    }
    public producto (String nombre, int precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.codigo = 0;   
    }
    public producto (String nombre, int precio, int cantidad, int codigo){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.codigo=codigo;
    }
    
    public String getnombre(){
        return nombre;
    }
    public int getprecio(){
        return precio;
    }
    public int getcantidad(){
        return cantidad;
    }
    public int getcodigo(){
        return codigo;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setprecio (int precio){
        this.precio=precio;
    }
    public void setcantidad (int cantidad){
    this.cantidad=cantidad; 
    }
    public void setcodigo (int codigo){
        this.codigo=codigo;
    }
    public String productoinfo() {
    return "Nombre: " + nombre + "\n" +
           "Precio: " + precio + "\n" +
           "Cantidad en stock: " + cantidad + "\n" +
           "Código de producto: " + codigo;
}
public int inven(){
    return precio*cantidad;
}
}
