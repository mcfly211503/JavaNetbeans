
package com.mycompany.calculadoraa;
public class calculos {

    private double sumar(double a, double b) {
        return a + b;
    }

    private double restar(double a, double b) {
        return a - b;
    }

    private double multiplicar(double a, double b) {
        return a * b;
    }

    private double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }

    public double calcular(String operacion, double a, double b) {
        switch (operacion) {
            case "sumar" -> {
                return sumar(a, b);
            }
            case "restar" -> {
                return restar(a, b);
            }
            case "multiplicar" -> {
                return multiplicar(a, b);
            }
            case "dividir" -> {
                return dividir(a, b);
            }
            default -> System.out.println("Operación no válida");
        }
        return 0;
    }
}


