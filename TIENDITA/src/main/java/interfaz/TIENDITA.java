
package interfaz;
import java.util.Scanner;
import inventario.Inventario;
import inventario.Producto;
public class TIENDITA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Inventario in = new Inventario();
           fun.esc("Bienvenido al programa \n Le daremos opciones para poder empezar con el manejo de la tienda");
           int y=0;
        while (y==0){
               fun.esc(" 0. Solicitar lista inventario \n 1. Crear Producto \n 2.Editar producto \n 3. Hacer venta \n 4.Solicitar info del procutto \n 5. Salir");
               int x=s.nextInt();
               if ((x>=0)&&(x<=5))
               {
                   switch (x)
                       { case 0->
                       {
                           in.lista();
                       }
                           case 1 -> {
                              
                              in.crear();
                 }
                           case 2->
                           {
                              in.editar();
                           }
                           case 3->
                           {
                              in.vender();
                           }
                           case 4->
                           {
                               in.info();
                           }
                           case 5->
                           {
                               y=1;
                           }
                       }
               }
               else
               {
                   fun.esc("Numero fuera de rango, intente otra vez");
               }
                 
        }
    }
}
