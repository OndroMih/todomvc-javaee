package mihalyi.ondrej.todomvc.javaee.cdiexercises;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class WelcomeDecorator implements StringProvider {

 @Inject
 @Delegate
 StringProvider delegate;
 
 @Override
 public String getString() {
  return "Welcome " + delegate.getString() + "!";
 }

}
