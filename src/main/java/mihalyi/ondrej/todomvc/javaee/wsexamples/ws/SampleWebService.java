package mihalyi.ondrej.todomvc.javaee.wsexamples.ws;

import java.util.List;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import mihalyi.ondrej.todomvc.javaee.DBRepository;
import mihalyi.ondrej.todomvc.javaee.TodoItem;
import mihalyi.ondrej.todomvc.javaee.cdiexercises.Logging;

@WebService(serviceName = "SampleWebService")
public class SampleWebService implements SampleWS {

 @Inject
 private DBRepository repository;

 @WebMethod
 @WebResult(name = "size")
 public int getAllTodosSize() {
  return repository.getAllTodosSize();
 }

 @WebMethod
 @WebResult(name = "allTodos")
 public AllTodosResult getAllTodos(boolean fetchDetails) {
  return new AllTodosResult(repository.getAllTodos(fetchDetails));
 }
 
}
