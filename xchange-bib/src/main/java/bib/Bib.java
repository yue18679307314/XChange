package bib;

import bib.dto.BibException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Map;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public interface Bib {
    @GET
    @Path("open/api/get_allticker")
    Map getAllTicker()
            throws IOException, BibException;

    @GET
    @Path("open/api/common/symbols")
    Map getSymbols()
            throws IOException, BibException;




}
