package io.xstefank;

import javax.ws.rs.Path;

@Path("/root")
public class RootResource {
    
    @Path("/pojo")
    public POJOLRAParticipant pojolraParticipant() {
        return new POJOLRAParticipant();
    }
    
}
