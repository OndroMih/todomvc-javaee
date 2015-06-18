/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mihalyi.ondrej.todomvc.javaee;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;

/**
 *
 * @author ondro
 */
@RequestScoped
@Named("app")
public class Application implements Serializable {

    @Inject
    private RepositoryFacade repoFacade;
    
    @Inject
    private DBRepository repository;
    
    private String title = "Dopln...";
    
    @Valid
    private List<TodoItem> todos;
    
    @PostConstruct
    public void init() {
        todos = repository.getAllTodos(true);
    }
    
    public List<TodoItem> getTodos() {
        return todos;
    }
    
    public void createNew() {
        TodoItem item = new TodoItem();
        item.setTitle(title);
        repoFacade.store(item);
        todos.add(item);
    }
    
    public void save(TodoItem todo) {
        repository.store(todo);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String notesDescription(TodoItem todo) {
        String result = "";
        for (TodoNote note : todo.getNotes()) {
            result += note.getDescription() + ", ";
        }
        return result;
    }
    
}
