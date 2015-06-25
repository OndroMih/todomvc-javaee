
package wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allTodosResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allTodosResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="todos" type="{http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/}todoItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allTodosResult", propOrder = {
    "todos"
})
public class AllTodosResult {

    protected List<TodoItem> todos;

    /**
     * Gets the value of the todos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the todos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTodos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TodoItem }
     * 
     * 
     */
    public List<TodoItem> getTodos() {
        if (todos == null) {
            todos = new ArrayList<TodoItem>();
        }
        return this.todos;
    }

}
