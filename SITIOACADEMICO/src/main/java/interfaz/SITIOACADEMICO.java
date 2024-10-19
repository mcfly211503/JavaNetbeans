
package interfaz;
import java.util.Scanner;
import registros.paraprofe;
public class SITIOACADEMICO {

    public static void main(String[] args) {
        int opcion=0;
        Scanner x = new Scanner(System.in);
        paraprofe a = new paraprofe();
        while (opcion!=6)
        {
            System.out.println("Bienvenido al sitio de estudiantes, seleccione una opcion");
        f.esc(" 1. crear un estudiante \n 2. Editar un estudiante \n 4. Ver detalles estudiante por curso \n 5. Ver promedio de calificaciones \n 6. Salir");
        opcion=x.nextInt();
        switch (opcion)
        {
            case 1->
            {
               a.crear(); 
            }
            case 2->
            {
                a.editar();
            }
            case 4->
            {
                a.informacion();
            }
            case 5->
            {
                a.promedio();
            }
                    
        }
        }
        
        
    }
}
