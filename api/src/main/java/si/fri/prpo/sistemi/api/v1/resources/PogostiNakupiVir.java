package si.fri.prpo.sistemi.api.v1.resources;

import si.fri.prpo.sistemi.dto.ArtikelDto;
import si.fri.prpo.sistemi.zrna.UpravljanjePriporocilnihSistemovZrno;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
@Path("pogostiArtikli")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PogostiNakupiVir {

    private Logger log = Logger.getLogger(PogostiNakupiVir.class.getName());

    @Inject
    private UpravljanjePriporocilnihSistemovZrno upravljanjePriporocilnihSistemovZrno;

    @GET
    public Response pridobiPogosteArtikle() {

        List<String> artikli = upravljanjePriporocilnihSistemovZrno.pridobiPogosteArtikle();
        return Response.ok(artikli).build();
    }

    @POST
    public Response vstaviArtikel(ArtikelDto artikelDto) {

        String artikel = upravljanjePriporocilnihSistemovZrno.vstaviArtikel(artikelDto);

        return Response.ok(artikel).build();
    }
}
