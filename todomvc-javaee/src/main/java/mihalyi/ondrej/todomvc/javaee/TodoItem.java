package mihalyi.ondrej.todomvc.javaee;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 *
 * @author ondro
 */
@Entity
public class TodoItem implements Serializable {

    @Id
    Long id;
    
    @Size(min = 1, message = "Please enter title for TODO item")
    private String title;
    private boolean completed;

    public TodoItem() {
    }

    public TodoItem(String title) {
        this.title = title;
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
