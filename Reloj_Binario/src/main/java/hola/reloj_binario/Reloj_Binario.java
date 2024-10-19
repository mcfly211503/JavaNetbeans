package hola.reloj_binario;
import java.time.LocalTime;
import java.util.Scanner;
public class Reloj_Binario {
    public static void main(String[] args) {
       LocalTime tiempoActual = LocalTime.now();
       Scanner sc= new Scanner(System.in);
        
        
System.out.println("Bienvenido al programa, son las "+ tiempoActual.getHour()%12+":"+tiempoActual.getMinute()+":"+tiempoActual.getSecond());
System.out.println("Ingrese separado de enter la cantidad de horas, minutos y segundos que desea sumar");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

int h = tiempoActual.getHour();
        int m = tiempoActual.getMinute();
        int s = tiempoActual.getSecond();

 for (int i=1; i<=86400; i++)
{ 
int hora=(h+a)%12, minuto=(m+b)%60, segundo=(s+c)%60;

//vamos a controlar los incrementos de hora y minuto
if (segundo==59)
{
	m++;
}
if ((minuto==59)&&(segundo==59)) //doble condicion porque nuestra variable minuto va a ser 59 durande los 59 segundos del minuto 59, por eso incrementamos hasta el ultimo de esos segundos, o sea hora:59:59
{
	h++;
}
funciones.clear();
System.out.println("Reloj Decimal ");
if (hora==0)
{
System.out.print("12");	
}
else{
	System.out.print(hora);
}

System.out.print( ":"); 
if (minuto<10)
{
System.out.print("0" +minuto);	
}
else
{
System.out.print(minuto);
}
System.out.print(":");
if (segundo<10)
{
System.out.print("0" +segundo);	
}
else
{
System.out.println(segundo);
}
System.out.println("\n \n");



System.out.println("Reloj Binario: ");
funciones.binario(hora);
System.out.print(":");
funciones.binario(minuto);
System.out.print(":");
funciones.binario(segundo);
System.out.println("\n \n");



System.out.println("Reloj Decimal");



funciones.hexa(hora);
System.out.print(":");
funciones.hexa(minuto);
System.out.print(":");
funciones.hexa(segundo);
System.out.println("\n \n");

 try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
	s++;

}
        
        
        
        
        
    }
}
