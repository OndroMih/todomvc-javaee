package mihalyi.ondrej.todomvc.javaee.cdiexamples.parentChild;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class Parent {
 @Inject
 Child child;
 
 @PostConstruct
 public void init() {
  child.setParent(this);
 }
 
}
