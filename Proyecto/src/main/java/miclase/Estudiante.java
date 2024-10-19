package miclase;
import java.util.Scanner;
public class Estudiante {
    public String nombre;
    public int edad;
    public int carnet;
    public int nota;
    
    public static void calificar(int nota)
{
if (nota>=61)
{
    System.out.println("Usted ha aprobado");
}
else
{
    System.out.println("Usted ha reprobado");
}

}
    
    public static void getcal()
    {
        Scanner x = new Scanner (System.in);
        int a, b=0, c;
        System.out.println("Ingrese la cantidad de notaas para sacar el promedio, luego las notas separadas de enter");
        a=x.nextInt();
        for (int i=1; i<=a; i++)
        {
            c=x.nextInt();
            b=b+c;
        }
        System.out.println("Su promedio es de " +(b/a));
    }

}
