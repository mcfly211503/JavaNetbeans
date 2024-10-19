
package g2;
public class monitor {
    private int idmon;
    private String marcamon;
    private double tamano;
    private int contmon;
    public monitor(int idmon, String marcamon, double tamano, int contmon)
    {
        this.idmon=idmon;
        this.marcamon=marcamon;
        this.tamano=tamano;
        this.contmon=contmon;
    }
    public int getidmon()
    {
        return idmon;
    }
    public String getmarcamon()
    {
        return marcamon;
    }
    public double gettamano()
            {
                return tamano;
            }
    public int getcontmon()
    {
        return contmon;
    }
    public void setidmon(int idmon)
    {
        this.idmon=idmon;
    }
     public void setmarcamon(String marcamon)
    {
        
        this.marcamon=marcamon;
    }
    public void settamano(double tamano)
    {
        this.tamano=tamano;
    }
    public void setcontmon(int contmon)
    {
        this.contmon=contmon;
    }
    public void infomon()
    {
        f.esc("Id del monitor: "+idmon);
        f.esc("Marca: "+marcamon);
        f.esc("Tamaño: "+tamano);
        f.esc("Cantidad disponible: "+contmon);
    }
}
