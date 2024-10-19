package g2;
public class completo extends Empleado{
    private int horas;
    private double sobre;
    public completo (String nombre, int edad, int salario, int horas, double sobre)
    {
        super(nombre, edad, salario);
        this.horas=horas;
        this.sobre=sobre;
 
    }
    public void sethoras(int horas)
    {
        this.horas=horas;
    }
    public int gethoras()
    {
        return horas;
    }
    public double getextra()
    {
        return sobre;
    }
    public void setextra(double extra)
    {
        this.sobre=extra;
    }
    public void calcextra()
    {
        double a=(getsalario()/(30/8))*1.5;
        if (horas/7>8)
        { int b=(horas/7)-8;
            f.esc( "Usted accumula estas horas extra: "+b);
            double c=a*b;
            f.esc("Salario extra de: "+c);
            setextra(c);
            
        }
    }
    public void infocom()
    {
        f.esc("NOmbre: "+getnombre());
        f.esc("Edad: "+getedad());
        f.esc("Salario: "+getsalario());
        f.esc("horas: "+horas);
        f.esc("exrta: "+sobre);
    }
    
}

