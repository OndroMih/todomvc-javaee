
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

    private final static QName _GetAllTodosSize_QNAME = new QName("http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", "getAllTodosSize");
    private final static QName _GetAllTodosSizeResponse_QNAME = new QName("http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", "getAllTodosSizeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTodosSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", name = "getAllTodosSize")
    public JAXBElement<GetAllTodosSize> createGetAllTodosSize(GetAllTodosSize value) {
        return new JAXBElement<GetAllTodosSize>(_GetAllTodosSize_QNAME, GetAllTodosSize.class, null, value);
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
