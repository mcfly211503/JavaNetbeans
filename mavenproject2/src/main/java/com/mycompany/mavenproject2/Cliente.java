
package com.mycompany.mavenproject2;

public class Cliente extends Personas {
    
    private int nit;
     public Cliente(String nombre, String apellido, int cui, int nit) {
        super(nombre, apellido, cui);
        this.nit=nit;
    }
     
     public int getnit(){
         return nit;
     }
     public void setnit(int nit){
         this.nit=nit;
     }
     
    
}
