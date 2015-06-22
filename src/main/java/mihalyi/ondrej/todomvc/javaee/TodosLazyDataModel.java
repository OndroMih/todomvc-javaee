/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

/**
 *
 * @author ondro
 */
public class TodosLazyDataModel extends LazyDataModel<TodoItem>{

 @Inject
 DBRepository db;
 
 @Override
 public List<TodoItem> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
  List<TodoItem> allTodos = db.getAllTodos(first, pageSize);
  setRowCount(db.getAllTodosSize());
  return allTodos;
 }
 
 @Override
    public TodoItem getRowData(String rowKey) {
     return db.getTodo(Long.valueOf(rowKey));
    }
 
    @Override
    public Object getRowKey(TodoItem item) {
        return String.valueOf(item.getId());
    }
 
}
