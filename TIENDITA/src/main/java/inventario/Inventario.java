
package inventario;
import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import interfaz.fun;
public class Inventario {
    int y=0;
    Scanner sc = new Scanner(System.in);
    List<Producto> areg = new ArrayList<>();
    
    public void info() { 
        fun.esc("Ingrese el codigo del producto a buscar");
        int cod=sc.nextInt();
        int x=areg.size();
       for (int i=0; i<x; i++){
           if (areg.get(i).getcodigo() == cod)
           {  y++;
               fun.esc("Nombre: "+areg.get(i).getnombre());
        fun.esc("Precio: " + areg.get(i).getprecio());
        fun.esc("Cantidad: "+areg.get(i).getcantidad());
        fun.esc("Codigo: "+areg.get(i).getcodigo());
       
           }
            
       }
       if (y!=1); 
           {
               fun.esc("ingrese un numero de codigo valido, este no fue encontrado");
           }
    
    }
    public void lista()
    {
       int x=areg.size();
       if (x==0)
       {
           fun.esc("Aun no hay productos registrados");
       }
       else{
         for (int i=0; i<x; i++)
       {
           fun.esc("Producto #" +i);
           areg.get(i).info();
           fun.esc(" ");
       }  
       }
       
    }
    
    public void crear (){
        
    fun.esc("Vamos a crear el producto para su registro, ingrese el nombre");
    String n=sc.next();
    fun.esc("Ingrese el precio");
    int p=sc.nextInt();
    fun.esc("Ingrese la cantidad disponibles");
    int c=sc.nextInt();
    fun.esc("Ingrese el codigo del producto");
    int co=sc.nextInt();
    
    Producto pr = new Producto (n, c, p, co);
    areg.add(pr);
}
    public void editar()
    {
        fun.esc("Ingrese el codigo del producto a editar");
        int cod=sc.nextInt();
        int x=areg.size();
       for (int i=0; i<x; i++){
           if (areg.get(i).getcodigo() == cod)
           { y++;
               fun.esc("Producto encontrado, detalles: ");
           areg.get(i).info();
           fun.esc("Ingrese el nuevo nombre");
           String n2=sc.next();
           fun.esc("Ingrese el nuevo precio");
           int p2=sc.nextInt();
           fun.esc("Ingrese el nuevo codigo");
           int co2=sc.nextInt();
           fun.esc("ingrese la nueva cantidad");
           int c2=sc.nextInt();
           areg.get(i).setnombre(n2);
           if ((p2>0)&&(co2>0)&&(c2>0)){
               areg.get(i).setprecio(p2);
           areg.get(i).setcodigo(co2);
           areg.get(i).setcantidad(c2);
           }
           else
           {
               fun.esc("Los atributos de cantidades, precios y codigos deben ser positivos intente de nuevo");
           }
           
           } 
       }
       if (y!=1); 
           {
               fun.esc("ingrese un numero de codigo valido, este no fue encontrado");
           }
       
    }
    public void vender(){
          
        int x=areg.size();
        if (x==0)
        {
            fun.esc("No podemos hacer ventas, aun no se registran productos");
        }
        else
        {
            fun.esc("Ingrese el codigo del producto a vender");
        int cod=sc.nextInt();
            for (int i=0; i<x; i++){
           if (areg.get(i).getcodigo() == cod)
           { y++;
               fun.esc("Producto encontrado, detalles: ");
           areg.get(i).info();
           fun.esc("Ingrese la cantidad que venderá");
           int venta=sc.nextInt();
           if ((venta>0)&&(venta<areg.get(i).getcantidad())){
               
               areg.get(i).setcantidad(areg.get(i).getcantidad()-venta);
               fun.esc("Venta exitosa");
           }
           else
           {
               fun.esc("Los atributos de cantidades deben ser positivos y no \n podemos vender mas de las unidades disponibles intente de nuevo");
           }
           } 
           
       }
            if (y!=1)
           {
               fun.esc("ingrese un numero de codigo valido, este no fue encontrado");
           }
        }
       
    }
    
}

