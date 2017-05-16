package com.multiple.questions.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.glassfish.jersey.server.mvc.Viewable;
import org.springframework.stereotype.Component;

@Component
@Path("abc")
@XmlRootElement
public class WelcomeApi {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it!";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("rest")
	public Viewable getTest() {
		return new Viewable("/test", "Test");
	}
}
