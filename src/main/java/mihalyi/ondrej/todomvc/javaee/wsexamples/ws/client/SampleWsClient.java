package mihalyi.ondrej.todomvc.javaee.wsexamples.ws.client;

import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import mihalyi.ondrej.todomvc.javaee.cdiexercises.Logging;
import wsdl.AllTodosResult;
import wsdl.SampleWebService_Service;

@Named
@Logging
public class SampleWsClient {
 
 @WebServiceRef(wsdlLocation = "http://localhost:8080/todomvc-javaee/SampleWebService?WSDL")
 SampleWebService_Service service;
 
 public boolean areThereAnyTodos() {
  return 0 < service.getSampleWebServicePort().getAllTodosSize();
 }

 public String getFirstTodoTitle() {
  AllTodosResult allTodos = service.getSampleWebServicePort().getAllTodos(false);
  return allTodos.getTodos().isEmpty() ? "EMPTY" : allTodos.getTodos().get(0).getTitle();
 }

}
