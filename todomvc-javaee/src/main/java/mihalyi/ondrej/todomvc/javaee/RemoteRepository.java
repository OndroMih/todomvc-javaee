/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ondro
 */
@Remote
interface RemoteRepository {

    List<TodoItem> getAllTodos();
    
}
