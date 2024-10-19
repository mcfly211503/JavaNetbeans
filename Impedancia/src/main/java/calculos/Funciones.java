package calculos;
import interfaz.impedancia.f;
import java.util.Scanner;
import java.util.ArrayList;
public class Funciones {
    ArrayList<Double> respar = new ArrayList<>();
    ArrayList<Double> reserie = new ArrayList<>();
    ArrayList<Double> capser = new ArrayList<>();
    ArrayList<Double> capar = new ArrayList<>();
      ArrayList<Double> indpar = new ArrayList<>();
      ArrayList<Double> indser = new ArrayList<>();

    public double resparalelo ()
    {
          double a=0;
        for (int i=0; i<respar.size(); i++)
        {

         a=a+(1/respar.get(i));   
        }
        double resp=1/a;
        return resp;
    }
    public double capserie()
    {
        double a=0;
        for (int i=0; i<capser.size(); i++)
        {

         a=a+(1/capser.get(i));   
        }
        double caps=1/a;
        return caps;
    }
    public double indparalelo()
    {
      double a=0;
        for (int i=0; i<indpar.size(); i++)
        {

         a=a+(1/indpar.get(i));   
        }
        double indp=1/a;
        return indp;
    }
    
    public double resserie()
    {
        double a=0;
        for (int i=0; i<reserie.size(); i++)
        {

         a=a+(reserie.get(i));   
        }
        
        return a;  
    }
    public double caparalelo()
    {
        double a=0;
        for (int i=0; i<capar.size(); i++)
        {

         a=a+(capar.get(i));   
        }
        
        return a;  
    }
    public double indserie()
    {
        double a=0;
        for (int i=0; i<indser.size(); i++)
        {

         a=a+(indser.get(i));   
        }
        
        return a;  
    }
    
    public void adsserie(String x, double y)
    {
        if ("r".equals(x))
        {
            reserie.add(y);
        }
        else if("c".equals(x))
        {
         capser.add(y);   
        }
        else if("i".equals(x))
        {
            indser.add(y);
        }
    }
    public void adparalelo(String x, double y)
    {
         if ("r".equals(x))
        {
            respar.add(y);
        }
        else if("c".equals(x))
        {
         capar.add(y);   
        }
        else if("i".equals(x))
        {
            indpar.add(y);
        }
    }
    }