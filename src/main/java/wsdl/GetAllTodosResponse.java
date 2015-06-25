
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllTodosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllTodosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allTodos" type="{http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/}allTodosResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllTodosResponse", propOrder = {
    "allTodos"
})
public class GetAllTodosResponse {

    protected AllTodosResult allTodos;

    /**
     * Gets the value of the allTodos property.
     * 
     * @return
     *     possible object is
     *     {@link AllTodosResult }
     *     
     */
    public AllTodosResult getAllTodos() {
        return allTodos;
    }

    /**
     * Sets the value of the allTodos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllTodosResult }
     *     
     */
    public void setAllTodos(AllTodosResult value) {
        this.allTodos = value;
    }

}
