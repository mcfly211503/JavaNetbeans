package com.mycompany.mavenproject2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Mavenproject2 {
    public static void main(String args []){
        List<libros> listaLibros;
        listaLibros = new ArrayList<>();
        List<Usuarios> listaUsuarios;
        listaUsuarios = new ArrayList<>();
    Scanner scanner;
    scanner = new Scanner (System.in);
    int n=19, x;
    while (n!=10)
    {
        System.out.println("Opciones para crear un libro o nuevo cliente:\n");
        System.out.println("1. Registrar un libro \n");
        System.out.println("2. Registrar un cliente");
            System.out.println("Opciones para majenar un producto:\n");
        System.out.println("4. hacer inventario\n");
        System.out.println("5.Buscar producto y detalles\n");
        System.out.println("6. prestar un libro\n");;
        System.out.println("8. Lista de productos registrados\n");
        System.out.println("9. Lista de clientes\n");
        System.out.println("Presione 10 para salir\n");
        
        
        n=scanner.nextInt();
       
    
        switch (n) {
            case 1 -> {
                libros nou = new libros ("", 0);
                nou.setnombre(scanner.next());
                nou.setcodigo( scanner.nextInt());
                listaLibros.add(nou);
            }
            case 2 -> {
                Usuarios nou2 = new Usuarios ("", "", 0);
                nou2.setnombre(scanner.next());
                nou2.setapellido(scanner.next());
                nou2.setcui(scanner.nextInt());
                 listaUsuarios.add(nou2);
            }

            case 4-> {
                for (int i=0; i<listaLibros.size(); i++)
                {
                  listaLibros.get(i).libroinfo();
                }
            }
              
            case 5->{
              System.out.println("Ingrese el codigo del libro");
                int l = scanner.nextInt();
                for (int i = 0; i < listaLibros.size(); i++){
                 libros nou3 = listaLibros.get(i);
                 if (nou3.getcodigo()==l)
                 {
                     System.out.println("Ingrese el nombre, precio y cantidad nuevos, el codigo es ineditable3¿");
                     nou3.setnombre(scanner.next());
                nou3.setprecio(scanner.nextInt());
                nou3.setcantidad(scanner.nextInt());
                 }
             }
            }
          
            case 6->{
              
            }
            case 7->{
                
                System.out.println("Ingrese el apellido");
                String ap = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Ingrese el nombre");
                String ap2 = scanner.nextLine();
                System.out.println("Ingrese cui y nit separados de enter");
                int cu = scanner.nextInt();
                int ni = scanner.nextInt();
                Cliente per = new Cliente (ap2, ap, cu, ni);
                listaClientes.add(per);
                
                System.out.println("Ingrese el codigo del producto a seleccionar");
                int m = scanner.nextInt();
                for (int i = 0; i < listaProductos.size(); i++){
                 libros nou3 = listaProductos.get(i);
                 if (nou3.getcodigo()==m)
                 {
                     System.out.println("Ingrese la cantidad de artucilos a llevar");
                     int p = scanner.nextInt();
                     if (p<nou3.getcantidad())
                     {
                         nou3.setcantidad(nou3.getcantidad()-p); 
                    
                     }
                     else {
                         System.out.println("No puede llevarse mas objetos que los que existen");
                     }
                     
                     
                 }
                 else {
                    System.out.println("codigo erroneo, intente de nuevo");
                 }
            }
                }
            
            case 8 ->{
                for (int i=0; i<listaProductos.size(); i++ )
                {
                    System.out.println("Producto " +(i+1));
                    System.out.println(listaProductos.get(i).productoinfo() +"\n");
                }
            }
            
            case 9->{
                for (int i=1; i<listaClientes.size()+1; i++){
                    System.out.println("Cliente " +i);
                    System.out.println(listaClientes.get(i-1).getnombre());
                    System.out.println(listaClientes.get(i-1).getapellido());
                    System.out.println(listaClientes.get(i-1).getcui());
                    System.out.println(listaClientes.get(i-1).getnit());
                }
            }
            
            
            case 10->{
                break;
            }
        
            default-> {
            System.out.println("Opcion invalida");
             }
            }
    
    }
        }

}
                
           
   
                
   
