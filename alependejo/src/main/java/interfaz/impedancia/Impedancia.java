
package interfaz.impedancia;
import java.util.Scanner;
import calculos.Funciones;
public class Impedancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Funciones funciones = new Funciones();
        System.out.println("****************************************");
        System.out.println("* ¡Bienvenido al Programa 1!              *");
        System.out.println("****************************************");
        int opcion = 1;

        while (opcion != 5) {
            System.out.println("\nOpciones disponibles:");
            System.out.println("1. Reducir un Circuito en paralelo");
            System.out.println("2. Reducir un circuito en serie");
            System.out.println("3. Calcular impedancias en Serie");
            System.out.println("4. Calcular impedancias en paralelo");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    double c = 0, r = 0, i = 0;
                                
                    System.out.println("****************************************");
                    System.out.println("* Para reducir este circuito solo sera   *");
                    System.out.println("* posible ingresar objetos del mismo    *");
                    System.out.println("* tipo en cada malla.                    *");
                    System.out.println("****************************************");
                    System.out.println("Ingrese el numero de mallas de este circuito");
                    int b = scanner.nextInt();   
                    for (int k = 1; k <= b; k++) {
                        System.out.println("Malla #" + k + " ingrese el tipo de objeto: \n r->resistencia \n c->capacitor \n i->inductor");
                        String tipo = scanner.next();
                        if ("r".equals(tipo)) {
                            System.out.println("Ingrese la cantidad de objetos en esta malla");
                            int n = scanner.nextInt();
                            System.out.println("Ahora, separados de enter, los valores");
                              
                            for (int j = 1; j <= n; j++) {
                                double val;
                                val = scanner.nextDouble();
                                r += val;
                            }
                            funciones.adparalelo(tipo, r);
                            System.out.println("Objeto resultante con valor de " + r);
                            r = 0;
                        } else if("i".equals(tipo)) {
                            System.out.println("Ingrese la cantidad de objetos en esta malla");
                            int n = scanner.nextInt();
                            System.out.println("Ahora, separados de enter, los valores");
                            for (int j = 1; j <= n; j++) {
                                double val = scanner.nextDouble();
                                i += val;
                            }
                            funciones.adparalelo(tipo, i);
                            System.out.println("Objeto resultante con valor de " + i);
                            i = 0;
                        } else if("c".equals(tipo)) {
                            System.out.println("Ingrese la cantidad de objetos en esta malla");
                            int n = scanner.nextInt();
                            System.out.println("Ahora, separados de enter, los valores");
                            for (int j = 1; j <= n; j++) {
                                double val = scanner.nextDouble();
                                c += 1 / val;
                            }
                            funciones.adparalelo(tipo, 1 / c);
                            System.out.println("Objeto resultante con valor de " + 1 / c);
                            c = 0;
                        }
                    }
                    System.out.println("La resistencia equivalente es: " + funciones.resparalelo());
                    System.out.println("El capacitor equivalente es: " + funciones.caparalelo());
                    System.out.println("El inductor equivalente es: " + funciones.indparalelo());
                    System.out.println("****************************************");
                }
                case 2 -> {
                    double c = 0, r = 0, i = 0;
                                
                    System.out.println("****************************************");
                    System.out.println("* Ingrese el numero de objetos de este   *");
                    System.out.println("* circuito.                             *");
                    System.out.println("****************************************");
                    int b = scanner.nextInt();   
                    for (int k = 1; k <= b; k++) {
                        System.out.println("Objeto #" + k + " ingrese el tipo: \n r->resistencia \n c->capacitor \n i->inductor");
                        String tipo = scanner.next();
                        if ("r".equals(tipo)) {
                            System.out.println("Ingrese el valor del objeto");
                            r = scanner.nextDouble();
                            funciones.adsserie(tipo, r);
                            r = 0;
                        } else if("i".equals(tipo)) {
                            System.out.println("Ingrese el valor del objeto");
                            i = scanner.nextDouble();
                            funciones.adsserie(tipo, i);
                            i = 0;
                        } else if("c".equals(tipo)) {
                            System.out.println("Ingrese el valor del objeto");
                            c = scanner.nextDouble();
                            funciones.adsserie(tipo, c);
                            c = 0;
                        }
                    }
                    System.out.println("La resistencia equivalente es: " + funciones.resserie());
                    System.out.println("El capacitor equivalente es: " + funciones.capserie());
                    System.out.println("El inductor equivalente es: " + funciones.indserie());
                    System.out.println("****************************************");
                }
                case 3 -> {
                    System.out.println("****************************************");
                    System.out.println("* Ingrese el valor de la resistencia     *");
                    System.out.println("* equivalente en el circuito (Ohms)      *");
                    System.out.println("****************************************");
                    double r = scanner.nextDouble();
                    System.out.println("****************************************");
                    System.out.println("* Ingrese el valor de la capacitancia    *");
                    System.out.println("* total del circuito (Faradios)           *");
                    System.out.println("****************************************");
                    double c = scanner.nextDouble();
                    System.out.println("****************************************");
                    System.out.println("* Ingrese el valor de la inductancia     *");
                    System.out.println("* total del circuito (Henries)           *");
                    System.out.println("****************************************");
                    double l = scanner.nextDouble();
                    System.out.println("****************************************");
                    System.out.println("* Ingrese la frecuencia del circuito     *");
                    System.out.println("* (Hertz Hz)                             *");
                    System.out.println("****************************************");
                    double f = scanner.nextDouble();
                    double omega = 2 * f * Math.PI;
                    double xc = 1 / (omega * c);
                    double xl = omega * l;
                    double realpart = r;
                    double imaginaripart = xl - xc;
                    double as = Math.pow(realpart, 2) + Math.pow(imaginaripart, 2);
                    double magnitud = Math.sqrt(as);
                    double cociente = (imaginaripart / realpart);
                    double angulo = Math.toDegrees(Math.atan(cociente));
                    System.out.println("****************************************");
                    System.out.println(" Xl = " + xl);
                    System.out.println(" Xc = " + xc);
                    System.out.println(" Frecuencia Angular = " + omega);
                    System.out.println(" Angulo = " + angulo);
                    System.out.println(" La impedancia es: " + realpart + " + " + imaginaripart + "J");
                    System.out.println(" La magnitud de la impedancia es: " + magnitud);
                    System.out.println(" V(t)=V0Sen( " + omega + "t +" + angulo + "°)");
                    System.out.println("****************************************");
                }
            }
        }
    }
}