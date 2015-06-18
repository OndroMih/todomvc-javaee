/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author ondro
 */
@Stateless
public class RepositoryFacade {
    @Inject
    ValidatorBean v;
    
    @Inject
    DBRepository repo;

    void store(TodoItem item) {
        if (v.validate(v)) {
            repo.store(item);
        }
    }
    
    
}
