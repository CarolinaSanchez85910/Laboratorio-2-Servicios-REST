package co.edu.uniandes.csw.mueblesdelosalpes.resources;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Vendedor;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioVendedoresMockLocal;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/vendedores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VendedorResource {

    @Inject
    private IServicioVendedoresMockLocal servicioVendedores;

    @GET
    public List<Vendedor> getVendedores() {
        return servicioVendedores.getVendedores();
    }

    @POST
    public Response crearVendedor(Vendedor vendedor) {
        try {
            servicioVendedores.agregarVendedor(vendedor);
            return Response.status(Response.Status.CREATED).entity(vendedor).build();
        } catch (OperacionInvalidaException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response eliminarVendedor(@PathParam("id") long id) {
        try {
            servicioVendedores.eliminarVendedor(id);
            return Response.noContent().build();
        } catch (OperacionInvalidaException e) {
            return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
        }
    }
}
