package si.fri.prpo.sistemi.api.v1.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@ApplicationScoped
@Path("uporabniki")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PogostiNakupiVir {

    private Logger log = Logger.getLogger(PogostiNakupiVir.class.getName());

    @GET
    public Response pridobiPogosteArtikle() {
        // Implement here
        return Response.ok().build();
    }
}
