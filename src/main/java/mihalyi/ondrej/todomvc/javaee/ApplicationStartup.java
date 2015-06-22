package mihalyi.ondrej.todomvc.javaee;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.inject.Inject;

@Singleton
public class ApplicationStartup {
 
 @Inject
 DBRepository todoDAO;
 
 @PostConstruct
 public void fillDatabase() {
  if (todoDAO.getAllTodos(false).isEmpty()) {
  for (int i = 0; i < 1000; i++) {
   TodoItem item = new TodoItem();
   item.setCompleted(i % 2 == 0 ? true : false);
   item.setCreated(new Date());
   item.setCreator("autouser");
   item.setTitle("item" + i);
   item.setPriority((i % 10) +1);
   
   todoDAO.store(item);
  }
  }
 }
}
