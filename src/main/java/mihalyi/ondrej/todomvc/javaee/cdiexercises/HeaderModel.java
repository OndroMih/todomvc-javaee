package mihalyi.ondrej.todomvc.javaee.cdiexercises;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("headerData")
@RequestScoped
public class HeaderModel {
 @Inject
 private StringProvider provider;

 public String getGreeting() {
  return provider.getString();
 }
 
}
