package mihalyi.ondrej.todomvc.javaee.mocks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import mihalyi.ondrej.todomvc.javaee.Mocked;
import mihalyi.ondrej.todomvc.javaee.Repository;
import mihalyi.ondrej.todomvc.javaee.TodoItem;

/**
 *
 * @author ondro
 */
@SessionScoped
@Mocked
public abstract class MockRepository implements Repository, Serializable {

    List<TodoItem> todos;
    
    @PostConstruct
    public void construct() {
        todos = new ArrayList<>();
        todos.add(new TodoItem("Buy groceries"));
        todos.add(new TodoItem("Send New Year postcards"));
        todos.add(new TodoItem("Clean up the apparment"));
    }

    @Override
    public List<TodoItem> getAllTodos() {
        return todos;
    }

    public abstract void store(TodoItem item);

}
