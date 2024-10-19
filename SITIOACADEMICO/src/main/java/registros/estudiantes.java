
package registros;

public class estudiantes {
    private String nombre;
    private String apellido;
    private int carnet;
    private int nota;
    
    public estudiantes (String nombre, String apellido, int carnet, int nota)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.carnet=carnet;
       
        this.nota=nota;
    }
    
    public String getnombre()
    {
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public int getcarnet(){
        return carnet;
    }
  
    public int getnota(){
        return nota;
    }
    public void setnombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setapellido(String apellido){
        this.apellido=apellido;
    }
    public void setcarnet(int carnet)
    {
        this.carnet=carnet;
    }
  
    public void setnota(int nota)
    {
        this.nota=nota;
    }
}
