
package g1.rectangulo;
import java.util.Scanner;
public class Rectangulo {
    public static void area(int ancho, int largo)
    {
        System.out.println("Area: "+ancho*largo +"u²");
    }

    public static void main(String[] args) {
        Scanner x= new Scanner (System.in);
        System.out.println("Ingrese largo y ancho del rectangulo separados de enter");
        int a=x.nextInt();
        int b=x.nextInt();
        area(a, b);
    }
}
