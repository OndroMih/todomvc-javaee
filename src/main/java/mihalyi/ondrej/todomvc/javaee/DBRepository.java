package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.TypedQuery;

@Stateless
@Dependent
public class DBRepository {
    @Inject
    private TodoDAO todoDbAccess;
    
    @Inject
    private Processor processor;
    
    public List<TodoItem> getAllTodos(boolean fetchDetails) {
        List<TodoItem> allTodos;
        if  (fetchDetails) {
            allTodos = todoDbAccess.getAllTodosWithContent();
        } else {
            allTodos = todoDbAccess.getAllTodos();
        }
        todoDbAccess.getAllTodos();
        filter(allTodos);
        return allTodos;
    }
    
    public TodoItem getNoteCount(TodoItem i) {
        TodoItem item = todoDbAccess.store(i);
        item.setNotesCount(item.getNotes().size());
        return item;
    }

    public void store(TodoItem item) {
        if (valid(item)) {
            todoDbAccess.store(item);
            processor.process();
        }
        
    }

    private void filter(List<TodoItem> allTodosWithContent) {
    }

    private boolean valid(TodoItem item) {
        return true;
    }

 public List<TodoItem> getAllTodos(int first, int pageSize) {
  Logger.getLogger(this.getClass().getName()).warning("Running query for first=" + first + ", pageSize=" + pageSize);
  return todoDbAccess.getAllTodosQuery()
          .setFirstResult(first).setMaxResults(pageSize)
          .getResultList();
 }
 
 public int getAllTodosSize() {
  return todoDbAccess.getAllTodos().size();
 }

 public TodoItem getTodo(Long id) {
  return todoDbAccess.getTodo(id);
 }
    
}
