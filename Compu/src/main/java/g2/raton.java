
package g2;

public class raton extends Entrada {
    private int idrat;
    private int contrat;
    public raton (String tipoen, String marca, int idrat, int contrat)
    {
        super(tipoen, marca);
        this.idrat=idrat;
        this.contrat=contrat;
    }
    public int getidrat()
    {
        return idrat;
    }
    public int getcontrat()
    {
        return contrat;
    }
    public void setcontrat(int contrat)
    {
        this.contrat=contrat;
    }
    public void setidrat(int idrat)
    {
        this.idrat=idrat;
    }
    public void inforat()
    {   info();
        f.esc("Id: "+idrat);
        f.esc("Cantidad disponible: "+contrat);
    }
    
}