package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class DBRepository implements Repository {
    @Inject
    private TodoDBAccess todoDbAccess;
    
    @Inject
    private Processor processor;
    
    @Override
    public List<TodoItem> getAllTodos() {
        List<TodoItem> allTodosWithContent = todoDbAccess.getAllTodos();
        todoDbAccess.getAllTodos();
        filter(allTodosWithContent);
        return allTodosWithContent;
    }

    @Override
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
