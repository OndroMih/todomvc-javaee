/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;

/**
 *
 * @author ondro
 */
@RequestScoped
@Named("app")
public class Application {

    @Inject
    private Repository repository;
    
    @Valid
    private List<TodoItem> todos;
            
    public List<TodoItem> getTodos() {
        if (todos == null) {
            todos = repository.getAllTodos();
        }
        return todos;
    }
    
}
