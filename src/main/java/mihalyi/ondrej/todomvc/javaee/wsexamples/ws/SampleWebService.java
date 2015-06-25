package mihalyi.ondrej.todomvc.javaee.wsexamples.ws;

import java.util.List;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import mihalyi.ondrej.todomvc.javaee.DBRepository;
import mihalyi.ondrej.todomvc.javaee.TodoItem;
import mihalyi.ondrej.todomvc.javaee.cdiexercises.Logging;

@Logging
@WebService(serviceName = "SampleWebService")
public class SampleWebService {

 @Inject
 private DBRepository repository;

 @WebMethod
 public int getAllTodosSize() {
  return repository.getAllTodosSize();
 }
 
}
