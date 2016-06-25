package javatar.service;

import javatar.model.GlobalUser;
import javatar.web.GlobalUserService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Stateless
@Path("/users")
public class UserResource {

    @Inject
    GlobalUserService globalUserService;

    @Context
    UriInfo uriInfo;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public GlobalUser getGlobalUserElement(@PathParam("id") String id){
        return globalUserService.getUserById(Long.valueOf(id));
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<GlobalUser> getAllUsers(){
        return globalUserService.getUsers();
    }

    @GET
    @Path("/reports")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<GlobalUser> getReportUsers(){
        return globalUserService.getUsersReports();
    }





}
