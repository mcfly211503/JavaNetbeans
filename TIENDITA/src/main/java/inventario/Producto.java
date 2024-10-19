
package inventario;
import interfaz.fun;
public class Producto {
    private String nombre;
    private int cantidad;
    private int precio;
    private int codigo;
    
    public Producto (String nombre, int cantidad, int precio, int codigo)
    {
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
        this.codigo=codigo;
    }
    public String getnombre()
    {
        return nombre;
    }
    public int getcantidad()
    {
        return cantidad;
    }
    public int getprecio()
    {
        return precio;
    }
    public int getcodigo(){
        return codigo;
    }
    
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setcantidad(int cantidad)
    {
        this.cantidad=cantidad;
    }
    public void setprecio(int precio)
    {
        this.precio=precio;
    }
    public void setcodigo(int codigo)
    {
        this.codigo=codigo;
    }
    public void info()
    {
        fun.esc("Nombre: "+nombre);
        fun.esc("Cantidad: "+cantidad);
        fun.esc("Precio: "+precio);
        fun.esc("Codigo: "+codigo);
    }
}
