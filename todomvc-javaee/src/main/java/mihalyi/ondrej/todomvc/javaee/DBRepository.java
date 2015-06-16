package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Transactional(Transactional.TxType.REQUIRED)
public class DBRepository implements Repository {
    @PersistenceContext(name = "todos")
    EntityManager em;
    
    @Override
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
