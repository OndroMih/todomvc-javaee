package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
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
    
}
