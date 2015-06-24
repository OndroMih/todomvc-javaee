package mihalyi.ondrej.todomvc.javaee.cdiexercises;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

@Named("headerData")
@RequestScoped
public class HeaderModel {
 @Inject
 private Instance<StringProvider> providerFactory;

 public String getGreeting() {
  String result = "";
  for (StringProvider provider : providerFactory) {
   result += provider.getString() + ", ";
  }
  return result;
 }
 
}
