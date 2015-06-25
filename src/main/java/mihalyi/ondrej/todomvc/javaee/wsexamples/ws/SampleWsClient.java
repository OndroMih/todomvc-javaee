package mihalyi.ondrej.todomvc.javaee.wsexamples.ws;

import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import mihalyi.ondrej.todomvc.javaee.cdiexercises.Logging;

@Named
@Logging
public class SampleWsClient {
 
 @WebServiceRef(wsdlLocation = "http://localhost:8080/todomvc-javaee/SampleWebService?WSDL")
 wsdl.SampleWebService_Service service;
 
 public boolean areThereAnyTodos() {
  return 0 < service.getSampleWebServicePort().getAllTodosSize();
 }
}
