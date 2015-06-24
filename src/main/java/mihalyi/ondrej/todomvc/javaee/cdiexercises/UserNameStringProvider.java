package mihalyi.ondrej.todomvc.javaee.cdiexercises;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;

@Stateless
public class UserNameStringProvider implements StringProvider {

 @Resource
 private EJBContext context;
 
 @Override
 public String getString() {
  return context.getCallerPrincipal() != null 
          ? context.getCallerPrincipal().getName() : "anonymous";
 }
 
}
