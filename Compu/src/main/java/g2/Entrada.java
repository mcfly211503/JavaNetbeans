
package g2;

public class Entrada {
    private String tipo;
    private String marca;
    public Entrada(String tipoen, String marca)
    {
        this.tipo=tipoen;
        this.marca=marca;
    }
    public String gettipo()
    {
        return tipo;
    }
    public String getmarca()
    {
        return marca;
    }
    public void settipo(String tipo)
    {
        this.tipo=tipo;
    }
    public void setmarca(String marca)
    {
        this.marca=marca;
    }
    public void info()
    {
        f.esc("Tipo: "+tipo);
        f.esc("Marca: "+marca);
    }
}

