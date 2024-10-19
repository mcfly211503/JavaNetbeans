package g1.contrasen;
import java.util.Scanner;

public class Contrasen{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String numero1, numero2;
    System.out.print("Ingrese la primera palabra ");
    numero1=sc.next();
    System.out.print("Ingresela de nuevo ");
    numero2=sc.next();
  
        if (numero1.equals(numero2))
        {
           System.out.print("Bienvenido al programa");
            
        }
        else
        {
            System.out.print("datos incorrectos");
        }
        
        }
    }
       
       
   
    
    