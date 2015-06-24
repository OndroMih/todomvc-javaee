package mihalyi.ondrej.todomvc.javaee.cdiexamples;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Singleton
@Startup
public class AppStartup {
 
 @Inject
 Event<StartUpEvent> startUpEvent;
 
 @PostConstruct
 public void init() {
  startUpEvent.fire(new StartUpEvent());
 }

}
