package co.edu.uniandes.csw.mueblesdelosalpes.resources;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Clase que habilita JAX-RS en el proyecto.
 */
@ApplicationPath("/api")
public class RestApplication extends Application {
    // No requiere implementar métodos, con la anotación es suficiente
}
