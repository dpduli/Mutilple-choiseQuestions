package com.multiple.questions.filter;

import javax.ws.rs.ext.Provider;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

@Provider
public class CORSResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext request, ContainerResponseContext response) {
		response.getHeaders().add("Access-Control-Allow-Origin", "http://localhost:8080");
		response.getHeaders().add("Access-Control-Allow-Headers",
				"origin, content-type, accept, authorization, X-User, X-ApplicationId");
		response.getHeaders().add("Access-Control-Allow-Credentials", "true");
		response.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		response.getHeaders().add("Access-Control-Max-Age", "");
	}
}
