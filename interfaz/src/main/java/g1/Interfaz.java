
package g1;
import g2.completo;
import g2.Empleado;
import g2.Funciones;
import g2.medio;
import java.util.Scanner;
public class Interfaz {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Funciones w = new Funciones();
        int op=0;
        while(op!=5)
        {
            f.esc("Bienvenido, nuestras opciones son \n 1. Crear medio tiempo \n 2. Crear tiempo completo \n --------------------- \n 3. Ver medio tiempo \n 4. Ver tiempo completo \n \n 5. salir");
   op=s.nextInt();
   switch(op)
   {
       case 1->
       {
           w.crearmedio();
       }
       case 2->
       {
           w.crearcompleto();
       }
       case 3->
       {
           w.buscarmedio();
       }
       case 4->
       {
           w.buscarcompleto();
       }
   }
        }
    }
}
