package com.sudip.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class Calculation {
	@Path("add/{a}/{b}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String add(@PathParam("a") int a, @PathParam("b") int b) {
		return Integer.toString(a + b);
	}

}
