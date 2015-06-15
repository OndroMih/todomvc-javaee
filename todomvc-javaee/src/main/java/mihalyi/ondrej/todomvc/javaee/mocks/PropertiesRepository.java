/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee.mocks;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Alternative;
import mihalyi.ondrej.todomvc.javaee.Repository;
import mihalyi.ondrej.todomvc.javaee.TodoItem;

/**
 *
 * @author ondro
 */
@Alternative
public class PropertiesRepository implements Repository {

    @Override
    public List<TodoItem> getAllTodos() {
        return new ArrayList<>();
    }
    
}
