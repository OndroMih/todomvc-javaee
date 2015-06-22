package mihalyi.ondrej.todomvc.javaee;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("completed")
public class CompletedConverter implements Converter {

 @Override
 public Object getAsObject(FacesContext context, UIComponent component, String value) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public String getAsString(FacesContext context, UIComponent component, Object value) {
  return (Boolean)value ? "Completed" : "Active";
 }
 
}
