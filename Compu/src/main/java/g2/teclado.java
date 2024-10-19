
package g2;

public class teclado extends Entrada {
    private int idtec;
    private int conttec;
    public teclado (String tipoen, String marca, int idtec, int conttec)
    {
        super(tipoen, marca);
        this.idtec=idtec;
        this.conttec=conttec;
    }
    public int getidtec()
    {
        return idtec;
    }
    public int getconttec()
    {
        return conttec;
    }
    public void setconttec(int conttec)
    {
        this.conttec=conttec;
    }
    public void setidtec(int idtec)
    {
        this.idtec=idtec;
    }
     public void infotec()
    {   info();
        f.esc("Id: "+idtec);
        f.esc("Cantidad disponible: "+conttec);
    }
}
