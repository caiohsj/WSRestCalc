/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author caioc
 */
@Path("recurso")
public class RecursoCalc {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RecursoCalc
     */
    public RecursoCalc() {
    }

    /**
     * Retrieves representation of an instance of recurso.RecursoCalc
     * @return o resultado da soma do tipo double
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("soma/{n1}/{n2}")
    public double soma(@PathParam(value = "n1") double n1, @PathParam(value = "n2") double n2) {
        //TODO return proper representation object
        return n1+n2;
    }
    
    /**
     * Retrieves representation of an instance of recurso.RecursoCalc
     * @return o resultado da subtração do tipo double
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("subtracao/{n1}/{n2}")
    public double subtracao(@PathParam(value = "n1") double n1, @PathParam(value = "n2") double n2) {
        //TODO return proper representation object
        return n1-n2;
    }
    
    /**
     * Retrieves representation of an instance of recurso.RecursoCalc
     * @return o resultado da divisão do tipo double
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("divisao/{n1}/{n2}")
    public double divisao(@PathParam(value = "n1") double n1, @PathParam(value = "n2") double n2) {
        //TODO return proper representation object
        return n1/n2;
    }
    
    /**
     * Retrieves representation of an instance of recurso.RecursoCalc
     * @return o resultado da multiplicação do tipo double
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("multiplicacao/{n1}/{n2}")
    public double multiplicacao(@PathParam(value = "n1") double n1, @PathParam(value = "n2") double n2) {
        //TODO return proper representation object
        return n1*n2;
    }
}
