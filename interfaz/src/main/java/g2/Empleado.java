
package g2;
import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Empleado {
    String nombre;
    int edad;
    int salario;
    
    public Empleado (String nombre, int edad, int salario)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }
    public String getnombre()
    {
        return nombre;
    }
    public int getedad()
    {
        return edad;
    }
    public int getsalario()
    {
        return salario;
    }
    public void setnombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setedad(int edad)
    {
        this.edad=edad;
    }
    public void setsalario(int salario)
    {
        this.salario=salario;
    }
    
}
