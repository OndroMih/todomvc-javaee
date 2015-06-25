package mihalyi.ondrej.todomvc.javaee.wsexamples.ws;

public interface SampleWS {

 AllTodosResult getAllTodos(boolean fetchDetails);

 int getAllTodosSize();

}
