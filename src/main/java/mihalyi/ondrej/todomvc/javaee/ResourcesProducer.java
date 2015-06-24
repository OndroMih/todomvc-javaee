/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ondro
 */
public class ResourcesProducer {
 
 @Produces
 @PersistenceContext(name = "todos")
 EntityManager em;
 
 @Produces
 @Dependent
 @Alternative
 public DBRepository createRepo() {
  return new DBRepository();
 }
}
