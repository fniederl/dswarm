package de.avgl.dmp.controller.resources;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Provider;
import com.google.inject.servlet.RequestScoped;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import de.avgl.dmp.controller.DMPControllerException;
import de.avgl.dmp.controller.status.DMPStatus;
import de.avgl.dmp.persistence.model.job.Function;
import de.avgl.dmp.persistence.service.job.FunctionService;

@RequestScoped
@Api(value = "/functions", description = "Operations about functions.")
@Path("functions")
public class FunctionsResource extends ExtendedBasicDMPResource<FunctionService, Function> {

	@Inject
	public FunctionsResource(final Provider<FunctionService> functionServiceProviderArg, final ObjectMapper objectMapper, final DMPStatus dmpStatus) {

		super(Function.class, functionServiceProviderArg, objectMapper, dmpStatus);
	}

	@ApiOperation(value = "get the function that matches the given id", notes = "Returns the Function object that matches the given id.")
	@Override
	public Response getObject(@ApiParam(value = "function identifier", required = true) final Long id) throws DMPControllerException {

		return super.getObject(id);
	}

	@ApiOperation(value = "create a new function", notes = "Returns a new Function object.", response = Function.class)
	@Override
	public Response createObject(@ApiParam(value = "function (as JSON)", required = true) final String jsonObjectString)
			throws DMPControllerException {

		return super.createObject(jsonObjectString);
	}

	@ApiOperation(value = "get all functions ", notes = "Returns a list of Function objects.")
	@Override
	public Response getObjects() throws DMPControllerException {

		return super.getObjects();
	}

	@Override
	protected Function prepareObjectForUpdate(final Function objectFromJSON, final Function object) {

		super.prepareObjectForUpdate(objectFromJSON, object);
		
		object.setFunctionDescription(objectFromJSON.getFunctionDescription());
		object.setParameters(objectFromJSON.getParameters());

		return object;
	}
}