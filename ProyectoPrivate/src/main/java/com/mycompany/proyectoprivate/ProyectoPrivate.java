package com.mycompany.proyectoprivate;
import java.util.Scanner;
import miclaseprivate.Estudiante;
import miclaseprivate.EstudianteGraduado;
public class ProyectoPrivate{
    
    public static void main(String[] args) {
  Estudiante nou= new Estudiante();
  Scanner sc= new Scanner(System.in);
  System.out.println("\n Ingrese nombre, edad, nota y carnet del primero separados por enter");
 nou.setNombre(sc.next());
        nou.setEdad(sc.nextInt());
        nou.setCarnet(sc.nextInt());
        nou.setNota(sc.nextInt());
 
  Estudiante nou2 = new Estudiante();
   System.out.println("\n Ingrese nombre, edad, nota y carnet del segundo separados por enter");
  nou2.setNombre(sc.next());
        nou2.setEdad(sc.nextInt());
        nou2.setCarnet(sc.nextInt());
        nou2.setNota(sc.nextInt());
         EstudianteGraduado nouu = new EstudianteGraduado();
 EstudianteGraduado nouu2 = new EstudianteGraduado();
System.out.println("\n Detalles del 1°:");
         System.out.println("Nombre: " + nou.getNombre());
        System.out.println("Edad: " + nou.getEdad());
        System.out.println("Carnet: " + nou.getCarnet());
        nou.calificar();
        nou.calcularPromedio();
        nou.imprimirPromedio();
        System.out.print("Título de tesis: ");
        nouu.setTituloTesis(sc.next());
        System.out.print("Año de graduación: ");
        nouu.setAnoGraduacion(sc.nextInt());
        System.out.println("Título de tesis: " + nouu.getTituloTesis());
        System.out.println("Año de graduación: " + nouu.getAnoGraduacion());

        
        // Imprimir detalles del segundo objeto (nou2)
        System.out.println("\nDetalles del 2°:");
    System.out.println("Nombre: " + nou2.getNombre());
        System.out.println("Edad: " + nou2.getEdad());
        System.out.println("Carnet: " + nou2.getCarnet());
        nou2.calificar();
        nou2.calcularPromedio();
        nou2.imprimirPromedio();
        System.out.print("Título de tesis: ");
        nouu2.setTituloTesis(sc.next());
        System.out.print("Año de graduación: ");
        nouu2.setAnoGraduacion(sc.nextInt());
          System.out.println("Título de tesis: " + nouu2.getTituloTesis());
        System.out.println("Año de graduación: " + nouu2.getAnoGraduacion());
       
        
} } 
