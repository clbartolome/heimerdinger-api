package com.redhat.heimerdinger;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import com.redhat.heimerdinger.entities.Server;

import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Path("/servers")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class ServerResource {

    @GET
    @Operation(summary = "Returns all the servers")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = Server.class, type = SchemaType.ARRAY)))
    @APIResponse(responseCode = "204", description = "No Servers")
    public Response getServers() {

        List<Server> servers = Server.listAll();
        if (servers.isEmpty()) {
          return Response.noContent().build();
        }
        return Response.ok(servers).build();
    }

    @GET
    @Path("{hostName}")
    @Operation(summary = "Get Server by hostName")
    @APIResponse(responseCode = "201", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = Server.class, type = SchemaType.OBJECT)))
    @APIResponse(responseCode = "404", description = "Server not Found")
    @Transactional
    public Response getServer(@PathParam("hostName") String hostName) {

      Server server = Server.findByHostName(hostName);
      if (server == null) {
        return Response.status(Status.NOT_FOUND).build();
      } else {
        return Response.ok(server).build();
      }      
    }

    @POST
    @Operation(summary = "Create or Update Server")
    @APIResponse(responseCode = "201", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = Server.class, type = SchemaType.OBJECT)))
    @Transactional
    public Response createOrUpdateServer(@Valid Server server) {

      Server existingServer = Server.findByHostName(server.getHostName());
      if (existingServer == null) {
        server.persist();
      } else {
        Server.getEntityManager().merge(server);
      }      
      return Response.created(URI.create("/servers/" + server.getHostName())).build();
    }
}