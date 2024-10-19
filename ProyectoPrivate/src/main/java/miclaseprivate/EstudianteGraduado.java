
package miclaseprivate;
public class EstudianteGraduado extends Estudiante {
 private String tituloTesis;
    private int anoGraduacion;

    public EstudianteGraduado() {
 
        super();
    }


    public void setTituloTesis(String tituloTesis) {
        this.tituloTesis = tituloTesis;
    }


    public String getTituloTesis() {
        return tituloTesis;
    }

   
    public void setAnoGraduacion(int anoGraduacion) {
        this.anoGraduacion = anoGraduacion;
    }

  
    public int getAnoGraduacion() {
        return anoGraduacion;
    }
    
}
