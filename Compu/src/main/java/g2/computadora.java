
package g2;
public class computadora {
    private monitor moni;
    private raton rato;
    private teclado tecl;
    private String nombre;
    private int id;
    public computadora(String nombre, int id, monitor moni, raton rato, teclado tecl)
    {
        this.nombre=nombre;
        this.id=id;
        this.moni=moni;
        this.rato=rato;
        this.tecl=tecl;
    }
    public void setnombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public void setmon(monitor moni)
    {
        this.moni=moni;
    }
    public void setraton(raton rato)
    {
        this.rato=rato;
    }
    public void settecl(teclado tecl)
    {
        this.tecl=tecl;
    }
    public String getnombre()
    {
        return nombre;
    }
    public int getid()
    {
        return id;
    }
    public teclado gettecl()
    {
        return tecl;
    }
    public monitor getmoni()
    {
        return moni;
    }
    public raton getrato()
    {
        return rato;
    }
    public void infocom()
    {
        f.esc("Nombre: "+nombre);
        f.esc("If: "+id);
        f.esc("Monitor: "+getmoni().getidmon());
        f.esc("Teclado: "+gettecl().getidtec());
        f.esc("Raton: "+getrato().getidrat());
    }
            
}
