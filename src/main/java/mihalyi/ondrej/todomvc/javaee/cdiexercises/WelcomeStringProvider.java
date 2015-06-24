package mihalyi.ondrej.todomvc.javaee.cdiexercises;

public class WelcomeStringProvider extends StringProvider {

 @Override
 public String getString() {
  return "Welcome!";
 }

}
