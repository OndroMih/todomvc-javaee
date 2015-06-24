package mihalyi.ondrej.todomvc.javaee.cdiexamples.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class XmlDecorator implements StringGenerator {

 @Inject
 @Delegate
 private StringGenerator delegate;
 
 @Override
 public String generate() {
  return "<string>" + delegate.generate() + "</string>";
 }
 
}
