package mihalyi.ondrej.todomvc.javaee;

import java.io.Serializable;
import javax.faces.view.ViewScoped;

@ViewScoped
public class TodoEditContext implements Serializable {
 private boolean creatingTodo = false;

 public boolean isCreatingTodo() {
  return creatingTodo;
 }

 public void setCreatingTodo(boolean creatingTodo) {
  this.creatingTodo = creatingTodo;
 }
 
 
}
