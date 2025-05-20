/**
 * Clase ControladoraPersistencia
 * 
 * Centraliza el acceso a los controladores JPA de las entidades del sistema.
 * Facilita las operaciones de persistencia (CRUD) y organiza la interacción 
 * con la base de datos separando la lógica de datos de la lógica de negocio.
 */

package persistencia;

import java.util.ArrayList;
import java.util.List;
import logica.Usuario;

public class ControladoraPersistencia {
    
    OdontologoJpaController odontoJPA = new OdontologoJpaController();
    TurnoJpaController turnJPA = new TurnoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    HorarioJpaController horaJPA = new HorarioJpaController();
    PersonaJpaController persJPA = new PersonaJpaController();
    PacienteJpaController pacJPA = new PacienteJpaController();
    SecretarioJpaController secreJPA = new SecretarioJpaController();
    ResponsableJpaController respJPA = new ResponsableJpaController();
    
    public ControladoraPersistencia(){
        
    }    
    
    
    public void crearUsuario(Usuario usu){
        usuJPA.create(usu);
    }

    public List<Usuario> getUsuarios() {
        
        //traer todos los valores de la instancia
        return usuJPA.findUsuarioEntities();
    }

    
}
