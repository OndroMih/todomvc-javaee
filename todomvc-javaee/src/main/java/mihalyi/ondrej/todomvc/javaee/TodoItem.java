package mihalyi.ondrej.todomvc.javaee;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.eclipse.persistence.annotations.CloneCopyPolicy;

/**
 *
 * @author ondro
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "allTodoItems", query = "select t from TodoItem t"),
    @NamedQuery(name = "allTodoItemsWith", query = "select t from TodoItem t join fetch t.notes")
})
@Table(name = "TODO_ITEM")
public class TodoItem implements Serializable {

    @Id
    Long id;
    
    @OneToMany(mappedBy = "item")
    private List<TodoNote> notes;
    
    
    private String title;
    private boolean completed;

    public TodoItem() {
    }

    public TodoItem(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        addMessage();
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
        addMessage();
    }
    
    private void addMessage() {
        final String msg = title + " set to " + (completed ? "completed" : "incomplete");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
    }

}
