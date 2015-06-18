package mihalyi.ondrej.todomvc.javaee;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import org.eclipse.persistence.annotations.CloneCopyPolicy;

/**
 *
 * @author ondro
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "allTodoItems", query = "select t from TodoItem t"),
    @NamedQuery(name = "allTodoItemsWith", query = "select t from TodoItem t left join fetch t.notes")
})
@Table(name = "TODO_ITEM")
public class TodoItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    @OneToMany(mappedBy = "item")
    private List<TodoNote> notes;
    
    private String title;
    private boolean completed;
    
    @Transient
    private int notesCount;

    public void setNotesCount(int notesCount) {
        this.notesCount = notesCount;
    }
    
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

    public List<TodoNote> getNotes() {
        return notes;
    }

    public void setNotes(List<TodoNote> notes) {
        this.notes = notes;
    }


}
