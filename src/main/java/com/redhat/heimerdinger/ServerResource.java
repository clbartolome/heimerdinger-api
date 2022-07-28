package com.redhat.heimerdinger;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

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
    @APIResponse(responseCode = "204", description = "No Orders")
    public Response getServers() {

        List<Server> servers = Server.listAll();
        if (servers.isEmpty()) {
          return Response.noContent().build();
        }
        return Response.ok(servers).build();
    }
}