
package wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AllItems_QNAME = new QName("http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", "allItems");
    private final static QName _GetAllTodosSize_QNAME = new QName("http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", "getAllTodosSize");
    private final static QName _GetAllTodosResponse_QNAME = new QName("http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", "getAllTodosResponse");
    private final static QName _GetAllTodos_QNAME = new QName("http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", "getAllTodos");
    private final static QName _GetAllTodosSizeResponse_QNAME = new QName("http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", "getAllTodosSizeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllTodosResponse }
     * 
     */
    public GetAllTodosResponse createGetAllTodosResponse() {
        return new GetAllTodosResponse();
    }

    /**
     * Create an instance of {@link AllTodosResult }
     * 
     */
    public AllTodosResult createAllTodosResult() {
        return new AllTodosResult();
    }

    /**
     * Create an instance of {@link GetAllTodosSize }
     * 
     */
    public GetAllTodosSize createGetAllTodosSize() {
        return new GetAllTodosSize();
    }

    /**
     * Create an instance of {@link GetAllTodosSizeResponse }
     * 
     */
    public GetAllTodosSizeResponse createGetAllTodosSizeResponse() {
        return new GetAllTodosSizeResponse();
    }

    /**
     * Create an instance of {@link GetAllTodos }
     * 
     */
    public GetAllTodos createGetAllTodos() {
        return new GetAllTodos();
    }

    /**
     * Create an instance of {@link TodoItem }
     * 
     */
    public TodoItem createTodoItem() {
        return new TodoItem();
    }

    /**
     * Create an instance of {@link TodoNote }
     * 
     */
    public TodoNote createTodoNote() {
        return new TodoNote();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllTodosResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", name = "allItems")
    public JAXBElement<AllTodosResult> createAllItems(AllTodosResult value) {
        return new JAXBElement<AllTodosResult>(_AllItems_QNAME, AllTodosResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTodosSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", name = "getAllTodosSize")
    public JAXBElement<GetAllTodosSize> createGetAllTodosSize(GetAllTodosSize value) {
        return new JAXBElement<GetAllTodosSize>(_GetAllTodosSize_QNAME, GetAllTodosSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", name = "getAllTodosResponse")
    public JAXBElement<GetAllTodosResponse> createGetAllTodosResponse(GetAllTodosResponse value) {
        return new JAXBElement<GetAllTodosResponse>(_GetAllTodosResponse_QNAME, GetAllTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", name = "getAllTodos")
    public JAXBElement<GetAllTodos> createGetAllTodos(GetAllTodos value) {
        return new JAXBElement<GetAllTodos>(_GetAllTodos_QNAME, GetAllTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTodosSizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", name = "getAllTodosSizeResponse")
    public JAXBElement<GetAllTodosSizeResponse> createGetAllTodosSizeResponse(GetAllTodosSizeResponse value) {
        return new JAXBElement<GetAllTodosSizeResponse>(_GetAllTodosSizeResponse_QNAME, GetAllTodosSizeResponse.class, null, value);
    }

}
