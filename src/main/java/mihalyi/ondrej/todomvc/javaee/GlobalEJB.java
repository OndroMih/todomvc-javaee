package mihalyi.ondrej.todomvc.javaee;

import javax.ejb.Remote;

@Remote(RemoteGlobal.class)
public class GlobalEJB implements RemoteGlobal{

 @Override
 public String getInfo() {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

}
