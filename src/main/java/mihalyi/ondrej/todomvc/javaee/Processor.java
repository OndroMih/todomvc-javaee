/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihalyi.ondrej.todomvc.javaee;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;

/**
 *
 * @author ondro
 */
@Stateless
@Dependent
public class Processor {

    @Asynchronous
    public void process() {
    }
}
