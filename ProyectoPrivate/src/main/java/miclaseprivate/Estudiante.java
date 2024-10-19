package miclaseprivate;
import java.util.Scanner;
public class Estudiante {
    private String nombre;
    private int edad;
    private int carnet;
    private int nota;
 

    
 public Estudiante() {
       
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    // Método para calificar al estudiante
    public void calificar() {
        if (nota > 61) {
            System.out.println("Usted ha aprobado");
        } else {
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
       private double promedio;
 public void calcularPromedio() {
        Scanner x = new Scanner(System.in);
        int a, b = 0, c;
        System.out.println("Ingrese la cantidad de notas para sacar el promedio, luego las notas separadas por enter");
        a = x.nextInt();
        for (int i = 1; i <= a; i++) {
            c = x.nextInt();
            b = b + c;
        }
        promedio = (double) b / a;
        System.out.println("El promedio es: " + promedio);
    }

    public void imprimirPromedio() {
        System.out.println("El promedio es: " + promedio);
    }

}
