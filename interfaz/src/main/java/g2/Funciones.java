
package g2;
import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Funciones {
    Scanner y= new Scanner (System.in);
    List <completo> com = new ArrayList<>();
    List <medio> med = new ArrayList<>();
    public void crearcompleto()
    {
        f.esc("Ingrese el nombre del empleado");
        String a=y.next();
        f.esc("Ingrese la edad");
        int b=y.nextInt();
        f.esc("Ingrese el salario mensual");
        int c=y.nextInt();
        f.esc("Ingrese las horas trabajadas al mes");
        int d=y.nextInt();
         if ((d/30)<8)
         {
             f.esc("El usuario no cumple con el minimo de 8 horas, es medio tiempo");
         }
         else
         {
             completo p = new completo(a, b, c, d, 0.5);
             p.calcextra();
             com.add(p);
             
         }
         
    }
    public void crearmedio()
    {
        f.esc("Ingrese el nombre del empleado");
        String a=y.next();
        f.esc("Ingrese la edad");
        int b=y.nextInt();
        f.esc("Ingrese las horas trabajadas al mes");
        int d=y.nextInt();
         if ((d/30)>=8)
         {
             f.esc("El usuario cumple con el minimo de 8 horas, es tiempo completo");
         }
         else
         {
             medio q = new medio(a, b, d,0);
             q.calcularsalario();
             med.add(q);
             
         }
         
    }
    public void buscarcompleto()
    { int aa=0;
        f.esc("Ingrese el nombre del usuiario");
        String t=y.next();
        for (int i=0; i<com.size();i++)
        {
            if (t.equals(com.get(i).getnombre()))
            {
                f.esc("Usuario encontrado");
                com.get(i).infocom();
                aa++;
            }
        }
        if (aa==0)
        {
            f.esc("Usuario no encontrado");
        }
        
    }
    public void buscarmedio()
            
    { int aa=0;
        f.esc("Ingrese el nombre del usuiario");
        String t=y.next();
        for (int i=0; i<med.size();i++)
        {
            if (t.equals(med.get(i).getnombre()))
            {
                f.esc("Usuario encontrado");
                med.get(i).infomed();
                aa++;
            }
        }
        if (aa==0)
        {
            f.esc("Usuario no encontrado");
        }
        
    }
}
