package com.redhat.heimerdinger.security;

import java.util.Collections;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/user")
public class AuthenticationREST {

	@Inject
	PBKDF2Encoder passwordEncoder;

	@ConfigProperty(name = "com.redhat.heimerdinger.quarkusjwt.jwt.duration") 
	public Long duration;

	@ConfigProperty(name = "mp.jwt.verify.issuer") 
	public String issuer;

	@ConfigProperty(name = "com.redhat.heimerdinger.admin.user")  
  public String admin;

	@ConfigProperty(name = "com.redhat.heimerdinger.admin.pass")  
  public String adminPassword;

	@PermitAll
	@POST @Path("/auth") @Produces(MediaType.APPLICATION_JSON)
	public Response login(AuthRequest authRequest) {
		if (admin.equals(authRequest.username) && adminPassword.equals(passwordEncoder.encode(authRequest.password))) {
			try {
				return Response.ok(new AuthResponse(TokenUtils.generateToken(admin, Collections.singleton(Role.ADMIN), duration, issuer))).build();
			} catch (Exception e) {
				return Response.status(Status.UNAUTHORIZED).build();
			}
		} else {
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}

}
