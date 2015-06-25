package mihalyi.ondrej.todomvc.javaee.wsexamples.ws;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import mihalyi.ondrej.todomvc.javaee.TodoItem;

@XmlRootElement(name =  "allItems")
public class AllTodosResult {
 private List<TodoItem> items;

 public AllTodosResult() {
 }

 public AllTodosResult(List<TodoItem> items) {
  this.items = items;
 }

 @XmlElement(name = "todos")
 public List<TodoItem> getItems() {
  return items;
 }

 public void setItems(List<TodoItem> items) {
  this.items = items;
 }
 
}
