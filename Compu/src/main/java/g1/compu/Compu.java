
package g1.compu;
import g2.computadora;
import g2.monitor;
import g2.orden;
import g2.raton;
import g2.teclado;
import java.util.Scanner;
public class Compu {

    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        orden r = new orden();
        int x=0;
        while (x!=13)
        {
            f.esc("A continuacion le detallamos las opciones del menu, seleccone la que desea");
        f.esc(" 1. Crear un raton \n 2. Crear un teclado \n 3. Crear un monitor \n 4. Crear una computadora \n -------------------- \n 5. Buscar un raton");
        f.esc(" 6. Buscar un teclado \n 7. Buscar un monitor \n 8. Buscar una computadora \n --------------------");
        f.esc(" 9. Vender un raton \n 10. Vender un teclado \n 11. Vender un monitor \n 12. Vender una computadora \n -------------------- \n 13. Salir");
        x=q.nextInt();
        
        switch (x)
        {
            case 1->
            {
                r.crearraton();
            }
            case 2->
            {
                r.crearteclado();
            }
            case 3->
            {
                r.crearmonitor();
            }
            case 4->
            {
                r.crearcompu();
            }
            case 5->
            {
                r.buscarraton();
            }
            case 6->
            {
                r.buscarteclado();
            }
            case 7->
            {
                r.buscarmonitor();
            }
            case 8->
            {
                r.buscarcompu();
            }
            case 9->
            {
                r.venderaton();
            }
            case 10->
            {
                r.vendeteclado();
            }
            case 11->
            {
                r.vendermonitor();
            }
            case 12->
            {
                r.vendercompu();
            }
        }
        
        }
    }
}
