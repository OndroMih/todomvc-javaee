package mihalyi.ondrej.todomvc.javaee;

import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {
 
 @Produces
 @Dependent
 public Logger createLogger(InjectionPoint point) {
  return Logger.getLogger(point.getMember().getDeclaringClass().getName());
 }
}
