package mihalyi.ondrej.todomvc.javaee.wsexamples.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("commands/{command}")
public class CommandResource {
 @GET
 public String getCommand(@PathParam("command") String command, @QueryParam("message") @DefaultValue("Ahoj, ako sa mas?") String message) {
  switch (command) {
   case "ping":
    return message;
  }
  return "";
 }
}
