package com.mycompany.proyecto;
import java.util.Scanner;
import miclase.Estudiante;
public class Proyecto {
    
    public static void main(String[] args) {
  Estudiante nou= new Estudiante();
  Scanner sc= new Scanner(System.in);
  System.out.println("\n Ingrese nombre, edad, nota y carnet del primero separados por enter");
  nou.nombre=sc.next();
  nou.edad=sc.nextInt();
   nou.nota=sc.nextInt();
  nou.carnet=sc.nextInt();
 
  Estudiante nou2 = new Estudiante();
   System.out.println("\n Ingrese nombre, edad, nota y carnet del segundo separados por enter");
  nou2.nombre=sc.next();
  nou2.edad=sc.nextInt();
    nou2.nota=sc.nextInt();
  nou2.carnet=sc.nextInt();

System.out.println("\n Detalles del 1°:");
        System.out.println("Nombre: " + nou.nombre);
        System.out.println("Edad: " + nou.edad);
        Estudiante.calificar(nou.nota);
        System.out.println("Carnet: " + nou.carnet);
        Estudiante.getcal();
        
        
        // Imprimir detalles del segundo objeto (nou2)
        System.out.println("\nDetalles del 2°:");
        System.out.println("Nombre: " + nou2.nombre);
        System.out.println("Edad: " + nou2.edad);
        Estudiante.calificar(nou2.nota);
        System.out.println("Carnet: " + nou2.carnet);
        Estudiante.getcal();
       
        
} } 
