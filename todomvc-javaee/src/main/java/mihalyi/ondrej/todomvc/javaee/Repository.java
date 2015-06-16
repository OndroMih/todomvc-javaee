/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mihalyi.ondrej.todomvc.javaee;

import java.util.List;

/**
 *
 * @author ondro
 */
public interface Repository {
    public List<TodoItem> getAllTodos();
    public void store(TodoItem item);
}
