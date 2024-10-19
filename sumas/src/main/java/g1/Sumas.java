
package g1;
import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Sumas {
    public static void main(String[] args) {
        int p=0;
        Scanner x= new Scanner (System.in);
        System.out.println("Ingrese la cantidad de elementos a sumar");
        int a =x.nextInt();
        for (int i=1; i<=a; i++)
        {
            System.out.println("Elemento #"+i);
            int b=x.nextInt();
            if (b%2==0)
            {
                p+=b;
            }
        }
      
        System.out.println("La suma es: "+p);
    }
}
