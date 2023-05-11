package demo.svc;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.prometheus.client.Counter;

@Path("messages")
public class DemoResource {

    static private Counter sentGreetngs = 
        Counter.build("greetings_sent","The number of sent greetings").register();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String postMessage(DemoMessage message) {
        sentGreetngs.inc();
        return "{ \"greetings\": \"Hello " + message.getName() + "\" }";
    }

}
