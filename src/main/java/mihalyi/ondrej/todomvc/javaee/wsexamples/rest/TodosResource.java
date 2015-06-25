package mihalyi.ondrej.todomvc.javaee.wsexamples.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mihalyi.ondrej.todomvc.javaee.DBRepository;

@Path("todos")
public class TodosResource {
 @Inject
 DBRepository repo;
 
 @GET
 @Produces(MediaType.TEXT_HTML)
 public String getAllTodos() {
  return "Number of todos: " + repo.getAllTodosSize();
 }
 
}
