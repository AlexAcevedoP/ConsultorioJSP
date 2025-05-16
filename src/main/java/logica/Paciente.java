
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
    
   // private int id_paciente;
    private boolean tiene_seguro;
    private String tipoSangre;
    @OneToOne
    private Responsable unResponsable; //relacion uno a uno
    @OneToMany(mappedBy = "pacien")
    private List<Turno> listaTurno; //relacion uno a muchos

    public Paciente() {
    }
//La clase persona hereda a las demás, y estos a estos hijos se le pasan los parametros por medio de super en en constructor

    public Paciente(boolean tiene_seguro, String tipoSangre, Responsable unResponsable, List<Turno> listaTurno, int id, String cedula, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, cedula, nombre, apellido, telefono, direccion, fecha_nacimiento);
        this.tiene_seguro = tiene_seguro;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurno = listaTurno;
    }

   
   
    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }
   

    /*public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public boolean isTiene_seguro() {
        return tiene_seguro;
    }

    public void setTiene_seguro(boolean tiene_seguro) {
        this.tiene_seguro = tiene_seguro;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    
    
    
}
