
package interfaz.impedancia;
import java.util.Scanner;
import calculos.Funciones;
public class Impedancia {
    public static void main(String[] args) {
        Scanner y = new Scanner (System.in);
        Funciones Funciones = new Funciones();
        f.es("Bienvenido al programa, le presemtamos las opciones:");
        int a=1;
        while(a!=5)
        {
            f.es(" 1. Reducir Un Circuito en paralelo \n 2.Recudir un circuito en serie \n 3. Calcular impedancias Conociendo Frecuencia \n 4.Calcular Impedancias sin Frecuencia \n 5.Salir");
            a=y.nextInt();
            switch (a)
           {
                        case 1->
                        {  double c=0, r=0, i=0;
                                
                            f.es("Para reducir este circuito solo sera posible ingresar objetos del mismo tipo en cada malla");
                            f.es("Ingrese el numero de mallas de este circuito");
                            int b=y.nextInt();   
                            for (int k=1; k<=b; k++)
                            {
                              f.es("Malla #" +k +" ingrese el tipo de objeto: \n r->resistencia \n c->capacitor \n i->inductor");
                              String tipo=y.next();
                              if ("r".equals(tipo))
                              {
                                  f.es("Ingrese la cantidad de objetos en esta malla");
                              int n=y.nextInt();
                              f.es("ahora, separados de enter, los valores");
                              
                              for (int j=1; j<=n; j++)
                              {
                                  double val;
                                  val=y.nextDouble();
                                
                                  r+=val;
                              }
                              Funciones.adparalelo(tipo, r);
                              f.es("Objeto resultante con valor de "+r);
                              r=0;
                              }
                              else if("i".equals(tipo))
                              {
                                  f.es("Ingrese la cantidad de objetos en esta malla");
                              int n=y.nextInt();
                              f.es("ahora, separados de enter, los valores");
                              for (int j=1; j<=n; j++)
                              {
                                  double val=y.nextDouble();
                                
                                  i+=val;
                              }
                              Funciones.adparalelo(tipo,i);
                              f.es("Objeto resultante con valor de "+i);
                              i=0;
                              }
                                else if("c".equals(tipo))
                              {
                                  f.es("Ingrese la cantidad de objetos en esta malla");
                              int n=y.nextInt();
                              f.es("ahora, separados de enter, los valores");
                              for (int j=1; j<=n; j++)
                              {
                                  double val=y.nextDouble();
                                
                                  c+=1/val;
                              }
                              Funciones.adparalelo(tipo, 1/c);
                              f.es("Objeto resultante con valor de "+1/c);
                              c=0;
                              }
                            }
                            f.es("La resistencia equivalente es: "+Funciones.resparalelo());
                            f.es("El capacitor equivalente es: "+Funciones.caparalelo());
                            f.es("El inductor equivalente es: "+Funciones.indparalelo());
                        }
                        case 2->
                        {  double c=0, r=0, i=0;
                                
                            f.es("Ingrese el numero de objetos de este circuito");
                            int b=y.nextInt();   
                            for (int k=1; k<=b; k++)
                            {
                              f.es("Objeto #" +k +" ingrese el tipo: \n r->resistencia \n c->capacitor \n i->inductor");
                              String tipo=y.next();
                              if ("r".equals(tipo))
                              {
                                  f.es("ingrese el valor del objeto");
                                  r=y.nextDouble();
                           
                              Funciones.adsserie(tipo, r);
                              r=0;
                              }
                              else if("i".equals(tipo))
                              {
                                 f.es("ingrese el valor del objeto");
                                  i=y.nextDouble();
                           
                              Funciones.adsserie(tipo, i);
                              i=0;
                              }
                                else if("c".equals(tipo))
                              {
                                  f.es("ingrese el valor del objeto");
                                  c=y.nextDouble();
                           
                              Funciones.adsserie(tipo, c);
                              c=0;
                              }
                            }
                            f.es("La resistencia equivalente es: "+Funciones.resserie());
                            f.es("El capacitor equivalente es: "+Funciones.capserie());
                            f.es("El inductor equivalente es: "+Funciones.indserie());
                        }
                        case 3->
                        {
                         f.es("Ingrese el valor de la resistencia equivalente en el circuito(Ohms)");
                         double r=y.nextDouble();
                         f.es("Ingrese el valor de la capacitancia total del circuito (Faradios)");
                         double c=y.nextDouble();
                         f.es("Ingrese el valor de la inductancia total del circuito (Henries)");
                         double l=y.nextDouble();
                         f.es("ingrese la frecuencia del circuito(Hertz Hz)");
                         double f=y.nextDouble();
                         double omega=2*f*Math.PI;
                         double xc=1/(omega*c);
                         double xl=omega*l;
                         double realpart=r;
                         double imaginaripart=xl-xc;
                         double as=Math.pow(realpart, 2)+Math.pow(imaginaripart, 2);
                         double magnitud=Math.sqrt(as);
                         double cociente=(imaginaripart/realpart);
                         double angulo=Math.toDegrees(Math.atan(cociente));
                         System.out.println("Xl="+xl);
                         System.out.println("Xc="+xc);
                         System.out.println("Frecuencia Angular="+omega);
                         System.out.println("Angulo="+angulo);
                         System.out.println("La impedancia es: "+realpart+" + "+imaginaripart+"J");
                         System.out.println("La magnitud de la impedancia es: "+magnitud);
                         
                        }
                        case 4->
                        {
                         f.es("Ingrese el valor de la resistencia equivalente en el circuito(Ohms)");
                         double r=y.nextDouble();
                         f.es("Ingrese el valor de la reactancia capacitiva total del circuito en ohms, Xc");
                         double xc=y.nextDouble();
                         f.es("Ingrese el valor de la reactancia inductiva total del circuit que esta dada en ohms, Xl");
                         double xl=y.nextDouble();
                         double realpart=r;
                         double imaginaripart=xl-xc;
                         double as=Math.pow(realpart, 2)+Math.pow(imaginaripart, 2);
                         double magnitud=Math.sqrt(as);
                         double cociente=(imaginaripart/realpart);
                         double angulo=Math.toDegrees(Math.atan(cociente));
                         System.out.println("Xl="+xl);
                         System.out.println("Xc="+xc);
                         System.out.println("Angulo="+angulo);
                         System.out.println("La impedancia es: "+realpart+" + "+imaginaripart+"J");
                         System.out.println("La magnitud de la impedancia es: "+magnitud);
                         
                        }
                        
           }
        }
        
        
        
        
        
    }
}
