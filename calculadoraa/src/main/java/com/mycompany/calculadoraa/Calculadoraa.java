
package com.mycompany.calculadoraa;
import java.util.Scanner;
public class Calculadoraa {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        calculos miCalculadora = new calculos();
        
       System.out.print("Ingrese la operación (sumar, restar, multiplicar, dividir): ");
        String operacion = scanner.nextLine();

        System.out.print("Ingrese el primer número: ");
        double numero1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el segundo número: ");
        double numero2 = Double.parseDouble(scanner.nextLine());
        
        double resultado = miCalculadora.calcular(operacion, numero1, numero2);
        System.out.println(resultado);
    }
}
