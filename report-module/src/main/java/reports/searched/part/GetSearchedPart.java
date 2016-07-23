package reports.searched.part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reports.searched.part.model.PartForReportModule;

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

    private static final Logger LOGGER = LoggerFactory.getLogger(GetSearchedPart.class);

    @EJB
    StorePart store;

    @POST
    @Path("/part")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response readPartFromJson (@NotNull PartForReportModule part){
        LOGGER.info("part.toString() = {}", part.toString());

        if(part.getToken().equals("autoparts")){
            Long id = store.save(part);
            LOGGER.info("id = {}", id);
        } else {
            LOGGER.error("Someone else than autoparts app tried to send POST");
        }


        return Response.noContent().build();
    }



}
