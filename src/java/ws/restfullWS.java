/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author wande
 */
@Path("restfullWS")
public class restfullWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of restfullWS
     */
    public restfullWS() {
    }

    /**
     * Retrieves representation of an instance of ws.restfullWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of restfullWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
    @GET
    @Path("/adicao/{a},{b},{opt}")
    public int add(@PathParam("a") int a,@PathParam("b") int b,@PathParam("opt") String opt)
    {
            if(opt.equals("+"))
                    return a+b;
            else
                    return 0;
    }
    
    @GET
    @Path("/subtracao/{a},{b},{opt}")
    public int sub(@PathParam("a") int a,@PathParam("b") int b,@PathParam("opt") String opt)
    {
        if (opt.equals("-"))
            return a-b;
        else
            return 0;
    }
}
