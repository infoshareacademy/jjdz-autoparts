package reports.searched.part;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("/searched")
public class GetSearchedPart   {

    @EJB
    StorePart store;

    @POST
    @Path("/part")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response readPartFromJson (@NotNull PartForReportModule part){

//        Long id = store.save(part);
        System.out.println("part.toString() = " + part.toString());

        return Response.noContent().build();
    }



}
