package jax.rs.test;

import jax.rs.JsonObj;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Daniel on 2015-09-23.
 */

@Path("/api")
public class Restf {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObj echo() {
        JsonObj obj = new JsonObj();
        obj.setA("test");
        obj.setB("test");
        obj.getTheMap().put("a", "1");
        obj.getTheMap().put("b", "2");
        return obj;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String getProvider(JsonObj obj) {
        return obj.getC();
    }
}
