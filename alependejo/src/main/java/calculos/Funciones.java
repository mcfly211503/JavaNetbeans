package calculos;
import interfaz.impedancia.f;
import java.util.Scanner;
import java.util.ArrayList;
public class Funciones {
    ArrayList<Double> respar1 = new ArrayList<>();
    ArrayList<Double> reserie1 = new ArrayList<>();
    ArrayList<Double> capser1 = new ArrayList<>();
    ArrayList<Double> capar1 = new ArrayList<>();
    ArrayList<Double> indpar1 = new ArrayList<>();
    ArrayList<Double> indser1 = new ArrayList<>();

    public double resparalelo() {
        double a = 0;
        for (double res : respar1) {
            a += 1 / res;
        }
        return 1 / a;
    }

    public double capserie() {
        double a = 0;
        for (double cap : capser1) {
            a += 1 / cap;
        }
        return 1 / a;
    }

    public double indparalelo() {
        double a = 0;
        for (double ind : indpar1) {
            a += 1 / ind;
        }
        return 1 / a;
    }

    public double resserie() {
        double a = 0;
        for (double res : reserie1) {
            a += res;
        }
        return a;
    }

    public double caparalelo() {
        double a = 0;
        for (double cap : capar1) {
            a += cap;
        }
        return a;
    }

    public double indserie() {
        double a = 0;
        for (double ind : indser1) {
            a += ind;
        }
        return a;
    }

    public void adsserie(String x, double y) {
        if ("r".equals(x)) {
            reserie1.add(y);
        } else if ("c".equals(x)) {
            capser1.add(y);
        } else if ("i".equals(x)) {
            indser1.add(y);
        }
    }

    public void adparalelo(String x, double y) {
        if ("r".equals(x)) {
            respar1.add(y);
        } else if ("c".equals(x)) {
            capar1.add(y);
        } else if ("i".equals(x)) {
            indpar1.add(y);
        }
    }
    }