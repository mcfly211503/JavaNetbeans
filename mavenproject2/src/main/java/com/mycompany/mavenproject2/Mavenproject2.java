package com.mycompany.mavenproject2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Mavenproject2 {
    public static void main(String args []){
        List<producto> listaProductos = new ArrayList<>();
        List <Cliente> listaClientes = new ArrayList<>();
    Scanner scanner= new Scanner (System.in);
    int n=19, x;
    while (n!=10)
    {
        System.out.println("Opciones para crear un producto:\n");
        System.out.println("1. Nombre y precio\n");
        System.out.println("2. Nombre, precio y cantidad en stock\n");
        System.out.println("3. Nombre, precio, cantidad en stock y código\n");
            System.out.println("Opciones para majenar un producto:\n");
        System.out.println("4. hacer inventario\n");
        System.out.println("5.Buscar producto y detalles\n");
        System.out.println("6. editar atributos\n");
        System.out.println("7. Venta\n");
        System.out.println("8. Lista de productos registrados\n");
        System.out.println("9. Lista de clientes\n");
        System.out.println("Presione 10 para salir\n");
        
        
        n=scanner.nextInt();
       
    
        switch (n) {
            case 1 -> {
                producto nou = new producto ("", 0);
                nou.setnombre(scanner.next());
                nou.setprecio( scanner.nextInt());
                listaProductos.add(nou);
            }
            case 2 -> {
                producto nou2 = new producto ("", 0, 0);
                nou2.setnombre(scanner.next());
                nou2.setprecio(scanner.nextInt());
                nou2.setcantidad(scanner.nextInt());
                 listaProductos.add(nou2);
            }
            case 3 -> {
                producto nou3 = new producto ("", 0, 0, 0);
                nou3.setnombre(scanner.next());
                nou3.setprecio(scanner.nextInt());
                nou3.setcantidad(scanner.nextInt());
                nou3.setcodigo(scanner.nextInt());
                 listaProductos.add(nou3);
            }
            case 4-> {
                System.out.println("Ingrese el codigo del producto");
             x=scanner.nextInt();
             for (int i = 0; i < listaProductos.size(); i++) {
        producto nou = listaProductos.get(i);
        if (nou.getcodigo() == x) {
            System.out.println(nou.productoinfo());
            System.out.println("Precio Inventario: " + nou.inven() );
            }
        }
             }
            case 5->
            {
               System.out.println("Ingrese el codigo del producto");
             int y =scanner.nextInt();
             for (int i = 0; i < listaProductos.size(); i++){
                 producto nou2 = listaProductos.get(i);
                 if (nou2.getcodigo()==y)
                 {
                     System.out.println(nou2.productoinfo());
                 }
             }
            }
            case 6->{
                System.out.println("Ingrese el codigo del producto");
                int l = scanner.nextInt();
                for (int i = 0; i < listaProductos.size(); i++){
                 producto nou3 = listaProductos.get(i);
                 if (nou3.getcodigo()==l)
                 {
                     System.out.println("Ingrese el nombre, precio y cantidad nuevos, el codigo es ineditable3¿");
                     nou3.setnombre(scanner.next());
                nou3.setprecio(scanner.nextInt());
                nou3.setcantidad(scanner.nextInt());
                 }
             }
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
                 producto nou3 = listaProductos.get(i);
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
                
           
   
                
   
