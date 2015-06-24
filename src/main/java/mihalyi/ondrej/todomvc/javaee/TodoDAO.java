/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author ondro
 */
@Dependent
public class TodoDAO {
    @PersistenceContext(name = "todos")
    EntityManager em;
    
    public List<TodoItem> getAllTodos() {
        return getAllTodosQuery().getResultList();
    }
    
    public TypedQuery<TodoItem> getAllTodosQuery() {
        return em.createNamedQuery("allTodoItems", TodoItem.class);
    }
    
    public List<TodoItem> getAllTodosWithContent() {
        TypedQuery<TodoItem> query = em.createNamedQuery("allTodoItemsWith", TodoItem.class);
        return query.getResultList();
    }

 public TodoItem getTodo(Long id) {
  return em.find(TodoItem.class, id);
 }
    
    public static class Result {
        TodoItem item;
        TodoNote content;

        public Result(TodoItem item, TodoNote content) {
            this.item = item;
            this.content = content;
        }
        
    }

    public TodoItem store(TodoItem item) {
        if (itemExistsInDB(item)) {
            return em.merge(item);
        } else {
            item.setId(getAllTodos().size() + 1L);        
            em.persist(item);
            return item;
        }
    }

    protected boolean itemExistsInDB(TodoItem item) {
        return item.getId() != null && (null != em.find(TodoItem.class, item.getId()));
    }
    
}
