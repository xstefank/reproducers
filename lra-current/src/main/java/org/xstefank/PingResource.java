package org.xstefank;

import org.eclipse.microprofile.lra.annotation.LRA;
import org.eclipse.microprofile.lra.client.LRAClient;
import org.junit.Assert;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.temporal.ChronoUnit;

@Path("ping")
public class PingResource {
    
    @GET
    public Response ping() {
        return Response.ok("Application running successfully").build();
    }

    @Inject
    private LRAClient lraClient;
    
    @LRA(LRA.Type.REQUIRES_NEW)
    public Response get(@HeaderParam(LRAClient.LRA_HTTP_HEADER) String lraIdURL) throws MalformedURLException {
        URL lraId = new URL(lraIdURL);
        
        Assert.assertEquals(lraId, lraClient.getCurrent());
        
        URL newLRAId = lraClient.startLRA(null, "newTopLevelLRA", 0L, ChronoUnit.SECONDS);
        Assert.assertNotEquals(newLRAId, lraClient.getCurrent());
        Assert.assertEquals(lraId, lraClient.getCurrent());

        URL secondLRA = lraClient.startLRA(null, "secondTopLevelLRA", 0L, ChronoUnit.SECONDS);
        Assert.assertNotEquals(secondLRA, lraClient.getCurrent());
        Assert.assertEquals(lraId, lraClient.getCurrent());
        
        ...
    }
}
