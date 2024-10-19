
package registros;
import interfaz.f;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class paraprofe {
    Scanner s = new Scanner(System.in);
    List <estudiantes> mat = new ArrayList<>();
    List <estudiantes> pro = new ArrayList<>();
    List <estudiantes> log = new ArrayList<>();
    List <estudiantes> tec = new ArrayList<>();
    List <estudiantes> fis = new ArrayList<>();
    List <estudiantes> elec = new ArrayList<>();
    List <estudiantes> el = new ArrayList<>();
    int y=0, pp=0, px=0, py=0, pw=0, pr=0, pt=0, gg=0, gh=0;
    
    public void crear()
    {
        f.esc("A que curso desea asignar al estudiante? \n 1. Matematicas 2. Programacion 3. Logicas \n 4. Tecnicas 5. Fisica 6. Electricidad \n 7. Electronica");
        int decision=s.nextInt();
        switch(decision)
        {
            case 1->
            {
                f.esc("Vamos a agregar a un estudiante al aula, a continuacion ingrese estos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
        estudiantes x = new estudiantes (n, a, c, no);
        mat.add(x);
            }
            case 2->
            {
             f.esc("Vamos a agregar a un estudiante al aula, a continuacion ingrese estos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
        estudiantes x = new estudiantes (n, a, c, no);
        pro.add(x);   
            }
            case 3->
            {
                f.esc("Vamos a agregar a un estudiante al aula, a continuacion ingrese estos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
        estudiantes x = new estudiantes (n, a, c, no);
        log.add(x);
            }
            case 4->
            {
                f.esc("Vamos a agregar a un estudiante al aula, a continuacion ingrese estos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
        estudiantes x = new estudiantes (n, a, c, no);
        tec.add(x);
            }
            case 5->
            {
                f.esc("Vamos a agregar a un estudiante al aula, a continuacion ingrese estos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
        estudiantes x = new estudiantes (n, a, c, no);
        fis.add(x);
            }
            case 6->
            {
                f.esc("Vamos a agregar a un estudiante al aula, a continuacion ingrese estos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
        estudiantes x = new estudiantes (n, a, c, no);
        elec.add(x);
            }
            case 7->
            {
                
                f.esc("Vamos a agregar a un estudiante al aula, a continuacion ingrese estos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
        estudiantes x = new estudiantes (n, a, c, no);
        el.add(x);
            }
        }
        
    }
    public void informacion()
    {
       f.esc("Supervisaremos los detalles del estudiante y sus aprobados y reprobados \n 1. Matematicas 2. Programacion 3. Logicas \n 4. Tecnicas 5. Fisica 6. Electricidad \n 7. Electronica"); 
    int decision=s.nextInt();
    switch (decision)
    {
        case 1->
        {
            f.esc("Ingrese el carnet del estudiante");
            int car=s.nextInt();
            int m=mat.size();
            
            for (int i=0; i<m; i++)
            {
                if (mat.get(i).getcarnet()==car)
                {
                    y++;
                    f.esc("Estudiante encontrado:");
                    f.esc("Nombre: " +mat.get(i).getnombre()+mat.get(i).getapellido());
                    f.esc("Carnet: " +mat.get(i).getcarnet());
                    f.esc("Nota: " +mat.get(i).getnota());
                    if (mat.get(i).getnota()<61)
                    {
                        f.esc("Ha desaprobado");
                    }
                    else
                    {
                        f.esc("Ha aprobado");
                    }
                    
                }
            }
            if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
        }
        case 2->
        {
               f.esc("Ingrese el carnet del estudiante");
            int car=s.nextInt();
            int m=pro.size();
            
            for (int i=0; i<m; i++)
            {
                if (pro.get(i).getcarnet()==car)
                {
                    y++;
                    f.esc("Estudiante encontrado:");
                    f.esc("Nombre: " +pro.get(i).getnombre()+pro.get(i).getapellido());
                    f.esc("Carnet: " +pro.get(i).getcarnet());
                    f.esc("Nota: " +pro.get(i).getnota());
                    if (pro.get(i).getnota()<61)
                    {
                        f.esc("Ha desaprobado");
                    }
                    else
                    {
                        f.esc("Ha aprobado");
                    }
                    
                }
            }
            if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
        }
        case 3->
        {
               f.esc("Ingrese el carnet del estudiante");
            int car=s.nextInt();
            int m=log.size();
            
            for (int i=0; i<m; i++)
            {
                if (log.get(i).getcarnet()==car)
                {
                    y++;
                    f.esc("Estudiante encontrado:");
                    f.esc("Nombre: " +log.get(i).getnombre()+log.get(i).getapellido());
                    f.esc("Carnet: " +log.get(i).getcarnet());
                    f.esc("Nota: " +log.get(i).getnota());
                    if (log.get(i).getnota()<61)
                    {
                        f.esc("Ha desaprobado");
                    }
                    else
                    {
                        f.esc("Ha aprobado");
                    }
                    
                }
            }
            if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
        }
        case 4->
        {
               f.esc("Ingrese el carnet del estudiante");
            int car=s.nextInt();
            int m=tec.size();
            
            for (int i=0; i<m; i++)
            {
                if (tec.get(i).getcarnet()==car)
                {
                    y++;
                    f.esc("Estudiante encontrado:");
                    f.esc("Nombre: " +tec.get(i).getnombre()+tec.get(i).getapellido());
                    f.esc("Carnet: " +tec.get(i).getcarnet());
                    f.esc("Nota: " +tec.get(i).getnota());
                    if (tec.get(i).getnota()<61)
                    {
                        f.esc("Ha desaprobado");
                    }
                    else
                    {
                        f.esc("Ha aprobado");
                    }
                    
                }
            }
            if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
        }
        case 5->
        {
               f.esc("Ingrese el carnet del estudiante");
            int car=s.nextInt();
            int m=fis.size();
            
            for (int i=0; i<m; i++)
            {
                if (fis.get(i).getcarnet()==car)
                {
                    y++;
                    f.esc("Estudiante encontrado:");
                    f.esc("Nombre: " +fis.get(i).getnombre()+fis.get(i).getapellido());
                    f.esc("Carnet: " +fis.get(i).getcarnet());
                    f.esc("Nota: " +fis.get(i).getnota());
                    if (fis.get(i).getnota()<61)
                    {
                        f.esc("Ha desaprobado");
                    }
                    else
                    {
                        f.esc("Ha aprobado");
                    }
                    
                }
            }
            if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
        }
        case 6->
        {
               f.esc("Ingrese el carnet del estudiante");
            int car=s.nextInt();
            int m=elec.size();
            
            for (int i=0; i<m; i++)
            {
                if (elec.get(i).getcarnet()==car)
                {
                    y++;
                    f.esc("Estudiante encontrado:");
                    f.esc("Nombre: " +elec.get(i).getnombre()+elec.get(i).getapellido());
                    f.esc("Carnet: " +elec.get(i).getcarnet());
                    f.esc("Nota: " +elec.get(i).getnota());
                    if (elec.get(i).getnota()<61)
                    {
                        f.esc("Ha desaprobado");
                    }
                    else
                    {
                        f.esc("Ha aprobado");
                    }
                    
                }
            }
            if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
        }
        case 7->
        {
               f.esc("Ingrese el carnet del estudiante");
            int car=s.nextInt();
            int m=el.size();
            
            for (int i=0; i<m; i++)
            {
                if (el.get(i).getcarnet()==car)
                {
                    y++;
                    f.esc("Estudiante encontrado:");
                    f.esc("Nombre: " +el.get(i).getnombre()+el.get(i).getapellido());
                    f.esc("Carnet: " +el.get(i).getcarnet());
                    f.esc("Nota: " +el.get(i).getnota());
                    if (el.get(i).getnota()<61)
                    {
                        f.esc("Ha desaprobado");
                    }
                    else
                    {
                        f.esc("Ha aprobado");
                    }
                    
                }
            }
            if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
        }
    }
    }
    public void editar()
    {
         f.esc("En que curso desea editar al estudiante? \n 1. Matematicas 2. Programacion 3. Logicas \n 4. Tecnicas 5. Fisica 6. Electricidad \n 7. Electronica");
        int decision=s.nextInt();

        switch(decision)
        {
            case 1->
            {
                        f.esc("Ingrese el carnet");
        int p=s.nextInt();
       
                for (int i=0; i<mat.size(); i++)
                {
                    if (mat.get(i).getcarnet()==p)
                    {
                        y++;
                         f.esc("Vamos a editar a un estudiante del aula, a continuacion ingrese los nuevos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
                        mat.get(i).setnombre(n);
                        mat.get(i).setapellido(a);
                        mat.get(i).setcarnet(c);
                        mat.get(i).setnota(no);
                    }
                }
                if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
            }
            case 2->
            {
                    f.esc("Ingrese el carnet");
        int p=s.nextInt();
       
                for (int i=0; i<pro.size(); i++)
                {
                    if (pro.get(i).getcarnet()==p)
                    {
                        y++;
                         f.esc("Vamos a editar a un estudiante del aula, a continuacion ingrese los nuevos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
                        pro.get(i).setnombre(n);
                        pro.get(i).setapellido(a);
                        pro.get(i).setcarnet(c);
                        pro.get(i).setnota(no);
                    }
                }
                if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
            }
            case 3->
            {
                  f.esc("Ingrese el carnet");
        int p=s.nextInt();
       
                for (int i=0; i<log.size(); i++)
                {
                    if (log.get(i).getcarnet()==p)
                    {
                        y++;
                         f.esc("Vamos a editar a un estudiante del aula, a continuacion ingrese los nuevos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
                        log.get(i).setnombre(n);
                        log.get(i).setapellido(a);
                        log.get(i).setcarnet(c);
                        log.get(i).setnota(no);
                    }
                }
                if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }  
            }
            case 4->
            {
                  f.esc("Ingrese el carnet");
        int p=s.nextInt();
       
                for (int i=0; i<tec.size(); i++)
                {
                    if (tec.get(i).getcarnet()==p)
                    {
                        y++;
                         f.esc("Vamos a editar a un estudiante del aula, a continuacion ingrese los nuevos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
                        tec.get(i).setnombre(n);
                        tec.get(i).setapellido(a);
                        tec.get(i).setcarnet(c);
                        tec.get(i).setnota(no);
                    }
                }
                if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }  
            }
            case 5->
            {
                    f.esc("Ingrese el carnet");
        int p=s.nextInt();
       
                for (int i=0; i<fis.size(); i++)
                {
                    if (fis.get(i).getcarnet()==p)
                    {
                        y++;
                         f.esc("Vamos a editar a un estudiante del aula, a continuacion ingrese los nuevos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
                        fis.get(i).setnombre(n);
                        fis.get(i).setapellido(a);
                        fis.get(i).setcarnet(c);
                        fis.get(i).setnota(no);
                    }
                }
                if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }
            }
            case 6->
            {
                  f.esc("Ingrese el carnet");
        int p=s.nextInt();
       
                for (int i=0; i<elec.size(); i++)
                {
                    if (elec.get(i).getcarnet()==p)
                    {
                        y++;
                         f.esc("Vamos a editar a un estudiante del aula, a continuacion ingrese los nuevos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
                        elec.get(i).setnombre(n);
                        elec.get(i).setapellido(a);
                        elec.get(i).setcarnet(c);
                        elec.get(i).setnota(no);
                    }
                }
                if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }  
            }
            case 7->
            {
                  f.esc("Ingrese el carnet");
        int p=s.nextInt();
       
                for (int i=0; i<el.size(); i++)
                {
                    if (el.get(i).getcarnet()==p)
                    {
                        y++;
                         f.esc("Vamos a editar a un estudiante del aula, a continuacion ingrese los nuevos parametros \n Nombre: ");
        String n=s.next();
        f.esc("Ingrese apellido");
        String a=s.next();
        f.esc("Carnet");
        int c=s.nextInt();
        f.esc("nota");
        int no=s.nextInt();
                        el.get(i).setnombre(n);
                        el.get(i).setapellido(a);
                        el.get(i).setcarnet(c);
                        el.get(i).setnota(no);
                    }
                }
                if (y!=1)
                {
                    f.esc("Carnet no valido, intente de nuevo");
                }  
            }
        }
    }
    public void promedio()
    {
        f.esc("Ingrese el carnet del estudiante a calcular promedio");
        int caa=s.nextInt();
        for (int i=0; i<mat.size();i++)
        {
            if (caa==mat.get(i).getcarnet())
            {
                gh++;
                int c1=mat.get(i).getnota();
                gg+=c1;
             
            }
        }
        for (int i=0; i<pro.size();i++)
        {
            if (caa==pro.get(i).getcarnet())
            {
                gh++;
                int c2=pro.get(i).getnota();
                gg+=c2;
            }
        }
        for (int i=0; i<log.size();i++)
        {
            if (caa==log.get(i).getcarnet())
            {
                gh++;
                int c3=log.get(i).getnota();
                gg+=c3;
            }
        }
        for (int i=0; i<tec.size();i++)
        {
            if (caa==tec.get(i).getcarnet())
            {
                gh++;
                int c4=tec.get(i).getnota();
                gg+=c4;
            }
        }
        for (int i=0; i<fis.size();i++)
        {
            if (caa==fis.get(i).getcarnet())
            {
                gh++;
                int c5=fis.get(i).getnota();
                gg+=c5;
            }
        }
        for (int i=0; i<elec.size();i++)
        {
            if (caa==elec.get(i).getcarnet())
            {
                gh++;
                int c6=elec.get(i).getnota();
                gg+=c6;
            }
        }
        for (int i=0; i<el.size();i++)
        {
            if (caa==el.get(i).getcarnet())
            {
                gh++;
                int c7=el.get(i).getnota();
                gg+=c7;
            }
        }
        f.esc("encontramos: " +gh +" notas");
        f.esc("El promedio con las notas que si estan registradas es " +(gg/gh));
        
        
    }
    
}
