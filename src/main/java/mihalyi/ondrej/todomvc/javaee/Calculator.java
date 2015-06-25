package mihalyi.ondrej.todomvc.javaee;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Calculator implements Serializable {
    private double result = 0;
    private Double stack;

    public String getData() {
        return DataUtil.convertDoubleToString(result);
    }

    public void setData(String data) {
    }
    
    public void number(int num) {
        result *= 10;
        result += num;
    }

    public void plus() {
        if (stack == null) {
            stack = result;
        } else {
            stack += result;
        }
        result = 0;
    }

    public void multiply() {
        if (stack == null) {
            stack = result;
        } else {
            stack *= result;
        }
        result = 0;
    }

    public void divide() {
        if (stack == null) {
            stack = result;
        } else {
            stack /= result;
        }
        result = 0;
    }
    
    public void result() {
        
    }

 public void computeResult() {
  this.result = 39;
 }

}
