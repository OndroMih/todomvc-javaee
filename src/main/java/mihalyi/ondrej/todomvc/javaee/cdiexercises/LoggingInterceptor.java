package mihalyi.ondrej.todomvc.javaee.cdiexercises;

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Logging
@Interceptor
public class LoggingInterceptor {
 
 @Inject
 private Logger logger;
 
 @AroundInvoke
 public Object invoke(InvocationContext context) throws Exception {
  logger.info("Volana metoda " + context.getMethod().getDeclaringClass().getSimpleName() + "." + context.getMethod().getName() + ", parameters: " + context.getMethod().getParameters());
  return context.proceed();
 }
}
