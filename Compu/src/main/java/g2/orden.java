
package g2;
import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class orden {
    List <monitor> moo = new ArrayList<>();
    List <teclado> tee = new ArrayList<>();
    List <raton> raa = new ArrayList<>();
    List <computadora> comp = new ArrayList<>();
        Scanner s = new Scanner (System.in);
    public void crearmonitor()
    {
        int a;
        String b;
        double c;
        int d;
        f.esc("Ingrese el id de este monitor");
        a=s.nextInt();
        f.esc("Ingrese la marca del monitor");
        b=s.next();
        f.esc("Ingrese el tamaño en pulgadas del monitor");
        c=s.nextDouble();
        f.esc("Ingrese la cantidad del monitor");
        d=s.nextInt();
        monitor m = new monitor(a, b, c, d);
        moo.add(m);
        
    }
    public void crearteclado()
    {
        String a; String b; int c; int d;
        f.esc("Ingrese el tipo de entrada");
        a=s.next();
        f.esc("Ingrese la marca");
        b=s.next();
        f.esc("Ingrese el id del teclado");
        c=s.nextInt();
        f.esc("Ingrese la cantidad disponibles");
        d=s.nextInt();
        teclado t = new teclado (a, b, c, d);
        tee.add(t);
        
    }
    public void crearraton()
    {
        String a; String b; int c; int d;
        f.esc("Ingrese el tipo de entrada");
        a=s.next();
        f.esc("Ingrese la marca");
        b=s.next();
        f.esc("Ingrese el id del raton");
        c=s.nextInt();
        f.esc("Ingrese la cantidad disponibles");
        d=s.nextInt();
        raton r = new raton (a, b, c, d);
        raa.add(r);
    }
    public void crearcompu()
    {
        int x1=0, x2=0, x3=0;
        monitor cc = new monitor (1, "", 1.5, 3);
        raton dd= new raton ("", "", 1, 15);
        teclado ee= new teclado ("", "", 1, 15);
        f.esc("Ingrese el nombre de la computadora a crear");
        String a=s.next();
        f.esc("Ingrese el id de esta computadora");
        int b=s.nextInt();
          computadora co= new computadora(a, b, cc, dd, ee);
          
          
        f.esc("Ingrese el id del monitor de la computadora");
        int c=s.nextInt();
        
        for (int i=0; i<moo.size();i++)
        {
            if (moo.get(i).getidmon()==c)
            {
                 if (moo.get(i).getcontmon()==0)
                {
                    f.esc("Ya no existen unidades disponibles");
                    return;
                }
                co.setmon(moo.get(i));
                x1++;
            }
        }
        if (x1==0)
        {
            f.esc("Id invalido, intentelo otra vez");
            return;
        }
        f.esc("Ingrese el id del raton");
        int d=s.nextInt();
        for (int j=0; j<raa.size();j++)
        {
            if (raa.get(j).getidrat()==d)
            { if (raa.get(j).getcontrat()==0)
                {
                    f.esc("Ya no existen unidades disponibles");
                    return;
                }
                co.setraton(raa.get(j));
               
                x2++;
            }
        }
        if (x2==0)
        {
            f.esc("Id invalido, intentelo otra vez");
            return;
        }
        
        f.esc("Ingrese el id del teclado");
        int e=s.nextInt();
        for (int k=0; k<tee.size();k++)
        {
            if (e==tee.get(k).getidtec())
            {
                 if (tee.get(k).getconttec()==0)
                {
                    f.esc("Ya no existen unidades disponibles");
                    return;
                }
                co.settecl(tee.get(k));
                x3++;
            }
        }
        if (x3==0)
        {
            f.esc("Id invalido, intentelo otra vez");
            return;
        }
        
        if ((x1>0)&&(x2>0)&&(x3>0))
        {
            comp.add(co);
        }
    }
    public void buscarmonitor()
    { int y1=0;
       f.esc("Ingrese el id del monitor de la computadora");
        int c=s.nextInt();
        
        for (int i=0; i<moo.size();i++)
        {
            if (moo.get(i).getidmon()==c)
            {
                moo.get(i).infomon();
                y1++;
            }
        }
        if (y1==0)
        {
            f.esc("Id invalido, intentelo otra vez");
        }
    }
    public void buscarraton()
    {
        int y2=0;
        f.esc("Ingrese el id del raton");
        int d=s.nextInt();
        for (int j=0; j<raa.size();j++)
        {
            if (raa.get(j).getidrat()==d)
            {
                raa.get(j).inforat();
                y2++;
            }
        }
        if (y2==0)
        {
            f.esc("Id invalido, intentelo otra vez");
        }
        
    }
    public void buscarteclado()
    {
        int y3=0;
        f.esc("Ingrese el id del teclado");
        int e=s.nextInt();
        for (int k=0; k<tee.size();k++)
        {
            if (e==tee.get(k).getidtec())
            {
               tee.get(k).infotec();
                y3++;
            }
        }
        if (y3==0)
        {
            f.esc("Id invalido, intentelo otra vez");
        }
    }
  public void buscarcompu()
  {
     int y4=0;
        f.esc("Ingrese el id de la computadora");
        int e=s.nextInt();
        for (int k=0; k<comp.size();k++)
        {
            if (e==comp.get(k).getid())
            {
               comp.get(k).infocom();
                y4++;
            }
        }
        if (y4==0)
        {
            f.esc("Id invalido, intentelo otra vez");
        } 
  }
  
  public void vendercompu()
  {
      int y4=0;
        f.esc("Ingrese el id de la computadora");
        int e=s.nextInt();
        for (int k=0; k<comp.size();k++)
        {
            if (e==comp.get(k).getid())
            {
                if ((comp.get(k).getrato().getcontrat()==0)||(comp.get(k).gettecl().getconttec()==0)||(0==comp.get(k).getmoni().getcontmon()))
                {
                    f.esc("Alguno de los componentes esat agotado en bodega");
                }
               else
                {
                    f.esc("Ingrese la cantidad a vender");
                    int p=s.nextInt();
                    if ((comp.get(k).gettecl().getconttec()>p)&&(comp.get(k).getrato().getcontrat()>p)&&(comp.get(k).getmoni().getcontmon()>p))
                    {
                       comp.get(k).gettecl().setconttec(comp.get(k).gettecl().getconttec()-p);
               comp.get(k).getrato().setcontrat(comp.get(k).getrato().getcontrat()-p);
               comp.get(k).getmoni().setcontmon(comp.get(k).getmoni().getcontmon()-p);
               f.esc("Venta exitosa");
                
                    }
                    else
                    {
                        f.esc("No podemos vender mas componentes de los disponibles");
                    }
                    
                }
                y4++; 
            }
        }
        if (y4==0)
        {
            f.esc("Id invalido, intentelo otra vez");
        } 
        
  }
  public void vendeteclado()
  {
    int y3=0;
        f.esc("Ingrese el id del teclado a vender");
        int e=s.nextInt();
        for (int k=0; k<tee.size();k++)
        {
            if (e==tee.get(k).getidtec())
            {
                if (tee.get(k).getconttec()==0)
                {
                    f.esc("Ya no existen unidades disponibles");
                }
               else
                {
                    f.esc("Ingrese la cantidad a vender");
               int l=s.nextInt();
               if (l>tee.get(k).getconttec())
               {
                   f.esc("No podemos vender mas unidades de las disponibles");
               }
              else
               {
                   tee.get(k).setconttec(tee.get(k).getconttec()-l);
                   f.esc("Venta exitosa");
               }
                 
                
            }
                y3++;
                }
        }
        if (y3==0)
        {
            f.esc("Id invalido, intentelo otra vez");
        }
  }
  public void venderaton()
  {
    int y3=0;
        f.esc("Ingrese el id del raton a vender");
        int e=s.nextInt();
        for (int k=0; k<raa.size();k++)
        {
            if (e==raa.get(k).getidrat())
            {
                if (raa.get(k).getcontrat()==0)
                {
                    f.esc("Ya no existen unidades disponibles");
                }
               else
                {
                    f.esc("Ingrese la cantidad a vender");
               int l=s.nextInt();
               if (l>raa.get(k).getcontrat())
               {
                   f.esc("No podemos vender mas unidades de las disponibles");
               }
              else
               {
                   raa.get(k).setcontrat(raa.get(k).getcontrat()-l);
                   f.esc("Venta exitosa");
               }
                 
                
            }
                y3++;
                }
        }
        if (y3==0)
        {
            f.esc("Id invalido, intentelo otra vez");
        }
  }
  public void vendermonitor()
 {
    int y3=0;
        f.esc("Ingrese el id del raton a vender");
        int e=s.nextInt();
        for (int k=0; k<moo.size();k++)
        {
            if (e==moo.get(k).getidmon())
            {
                if (moo.get(k).getcontmon()==0)
                {
                    f.esc("Ya no existen unidades disponibles");
                }
               else
                {
                    f.esc("Ingrese la cantidad a vender");
               int l=s.nextInt();
               if (l>moo.get(k).getcontmon())
               {
                   f.esc("No podemos vender mas unidades de las disponibles");
               }
              else
               {
                   moo.get(k).setcontmon(moo.get(k).getcontmon()-l);
                   f.esc("Venta exitosa");
               }
                 
                
            }
                y3++;
                }
        }
        if (y3==0)
        {
            f.esc("Id invalido, intentelo otra vez");
        }
  }
    
}
