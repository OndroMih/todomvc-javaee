/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mihalyi.ondrej.todomvc.javaee;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;

/**
 *
 * @author ondro
 */
@SessionScoped
@Named("app")
public class Application implements Serializable {

    @Inject
    transient
    private Repository repository;
    
    @Valid
    private List<TodoItem> todos;
            
    public List<TodoItem> getTodos() {
        if (todos == null) {
            todos = repository.getAllTodos();
        }
        return todos;
    }
    
    public TodoItem createNew() {
        TodoItem item = new TodoItem();
        repository.store(item);
        return item;
    }
    
    public void save(TodoItem todo) {
        repository.store(todo);
    }
    
}
