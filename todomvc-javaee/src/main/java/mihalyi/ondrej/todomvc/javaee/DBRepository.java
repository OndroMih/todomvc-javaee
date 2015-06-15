package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class DBRepository implements Repository {
    @PersistenceContext(name = "todos")
    EntityManager em;
    
    @Override
    public List<TodoItem> getAllTodos() {
        TypedQuery<TodoItem> query = em.createQuery("select t from TodoItem t", TodoItem.class);
        return query.getResultList();
    }
}
