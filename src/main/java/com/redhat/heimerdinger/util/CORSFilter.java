package com.redhat.heimerdinger.util;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
import org.jboss.logging.Logger;



@Provider
public class CORSFilter implements ContainerResponseFilter {

  private static final Logger LOGGER = Logger.getLogger(MicroServiceLifeCycle.class);

    public CORSFilter() {}

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        // LOGGER.info("Modifing response with CORSFIlter: " + responseContext.getHeaders());
        // MultivaluedMap<String, Object> headers = responseContext.getHeaders();
        // headers.putSingle("Access-Control-Allow-Origin", "*");
        // LOGGER.info("Modified to add the required header: " + responseContext.getHeaders());
        LOGGER.info("--> Current Headers: " + responseContext.getHeaders());
    }
}
