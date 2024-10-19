
package g2;
public class medio extends Empleado {
    private double horas;
    private double salarioo;
    public medio (String nombre, int edad, int horas, int salarioo)
    {
        super(nombre, edad, 0);
        this.horas=horas;
        this.salarioo=salarioo;
    }
    public void sethoras(double horas)
    {
        this.horas=horas;
    }
    public void setsalario(double salario)
    {
        this.salarioo=salario;
    }
    public double gethoras()
    {
        return horas;
    }
    public double getsalariox()
   {
       return salarioo;
   }
   public void calcularsalario()
   {
       double a=horas*101.18;
      
       f.esc("Su salario es de: "+a);
       setsalario(a);
   }
   public void infomed()
    {
        f.esc("NOmbre: "+getnombre());
        f.esc("Edad: "+getedad());
        f.esc("Salario: "+getsalariox());
        f.esc("Horas al mes: "+horas);
    }
}
