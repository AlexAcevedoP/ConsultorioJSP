/**
 * Clase ControladoraPersistencia
 * 
 * Centraliza el acceso a los controladores JPA de las entidades del sistema.
 * Facilita las operaciones de persistencia (CRUD) y organiza la interacción 
 * con la base de datos separando la lógica de datos de la lógica de negocio.
 */

package persistencia;

public class ControladoraPersistencia {
    
    OdontologoJpaController odontoJPA = new OdontologoJpaController();
    TurnoJpaController turnJPA = new TurnoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    HorarioJpaController horaJPA = new HorarioJpaController();
    PersonaJpaController persJPA = new PersonaJpaController();
    PacienteJpaController pacJPA = new PacienteJpaController();
    SecretarioJpaController secreJPA = new SecretarioJpaController();
    ResponsableJpaController respJPA = new ResponsableJpaController();

    
}
