/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author ondro
 */
public class TodoDBAccess {
    @PersistenceContext(name = "todos")
    EntityManager em;
    
    public List<TodoItem> getAllTodos() {
        TypedQuery<TodoItem> query = em.createNamedQuery("allTodoItems", TodoItem.class);
        return query.getResultList();
    }
    
    public List<TodoItem> getAllTodosWithContent() {
        TypedQuery<TodoItem> query = em.createNamedQuery("allTodoItemsWith", TodoItem.class);
        return query.getResultList();
    }
    
    public static class Result {
        TodoItem item;
        TodoNote content;

        public Result(TodoItem item, TodoNote content) {
            this.item = item;
            this.content = content;
        }
        
    }

    public void store(TodoItem item) {
        if (itemExistsInDB(item)) {
            em.merge(item);
        } else {
            em.persist(item);
        }
    }

    protected boolean itemExistsInDB(TodoItem item) {
        return item.getId() != null && (null != em.find(TodoItem.class, item.getId()));
    }
    
}
