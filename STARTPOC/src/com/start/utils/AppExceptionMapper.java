package com.start.utils;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.core.Response.Status;

@Provider
public class AppExceptionMapper implements ExceptionMapper<AppException>{
	
	@Override
	public Response toResponse(AppException ex) {
		
		return Response.status(Status.NOT_FOUND).entity(ex.getMessage())
				.type(MediaType.APPLICATION_JSON).build();
	}
}
