package mihalyi.ondrej.todomvc.javaee;

import javax.ejb.Stateless;

@Stateless
public class ValidatorBean {
    public boolean validate(Object o) {
        return true;
    }
}
