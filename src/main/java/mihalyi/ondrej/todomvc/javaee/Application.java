/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 *
 * @author ondro
 */
@ViewScoped
@Named("app")
public class Application implements Serializable {

 @Inject
 transient
 Logger logger;
 
 @Inject
 private RepositoryFacade repoFacade;
 
 @Inject
 private DBRepository repository;

 @Inject
 private TodoEditContext todoEditContext;
 
 @Inject
 TodosLazyDataModel lazyTodos;

 @Inject
 DefaultDataFiller start;
        
 @Size(min = 1)
 private String title = "";

 @Valid
 private List<TodoItem> todos;

 @PostConstruct
 public void init() {
  logger.info("Init: Robim init...");
  start.fillDatabase();
  todos = repository.getAllTodos(false);
 }

 public List<TodoItem> getTodos() {
  return todos;
 }
 
 public int getTodosCount() {
  return 0;
 }
 
 public TodosLazyDataModel getTodosLazy() {
  return lazyTodos;
 }

 public void createNew() {
  todoEditContext.setCreatingTodo(true);
 }

 public void cancel() {
  todoEditContext.setCreatingTodo(false);
 }

 public void saveNew() {
  TodoItem item = new TodoItem();
  item.setTitle(title);
  repoFacade.store(item);
  todos.add(item);
  todoEditContext.setCreatingTodo(false);
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String notesDescription(TodoItem todo) {
  String result = "";
  for (TodoNote note : todo.getNotes()) {
   result += note.getDescription() + ", ";
  }
  return result;
 }

 public Date getNow() {
  return new Date();
 }

 public TodoEditContext getTodoEditContext() {
  return todoEditContext;
 }

 public boolean isCreatingTodo() {
  return todoEditContext.isCreatingTodo();
 }

 public void setCreatingTodo(boolean creatingTodo) {
  todoEditContext.setCreatingTodo(creatingTodo);
 }
 
 public String getCompletedText(TodoItem item) {
  return item.isCompleted() ? "Completed" : "Active";
 }
 
 public boolean filterByName(Object value, Object filter, Locale locale) {
   return value.equals(filter);
 }

}
