
package hola.reloj_binario;

public class funciones {
    public static void binario(int n){

	if (n>1)
	{

	binario(n/2);

	}
	System.out.print(n%2);
}
    public static void hexa(int n){

	if (n>1)
	{

	hexa(n/16);

	}
	int cong=n%16;
	if (cong<10)
	{
	System.out.print(cong);	
	}
	else if (cong==10){
		System.out.print("A");
	}
	else if (cong==11){
		System.out.print("B");
	}
	else if (cong==12){
		System.out.print("C");
	}
	else if (cong==13){
		System.out.print("D");
	}
	else if (cong==14){
		System.out.print("E");
	}
	else if (cong==15){
		System.out.print("F");
	}
}
    public static void clear (){
       for (int i=1; i<=1000; i++)
       {
            System.out.println("\n");
       }
    }
}
