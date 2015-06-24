package mihalyi.ondrej.todomvc.javaee;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class QueryNameProducer {

     @Inject
     EntityManager em;
 
     @Produces
     @QueryName("allTodoItems")
     public TypedQuery<TodoItem> allTodoItems() {
      return em.createNamedQuery("allTodoItems", TodoItem.class);
     }
     
}
