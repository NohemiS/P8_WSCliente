
package WSComprar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ComprarWS", targetNamespace = "http://comprar.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ComprarWS {


    /**
     * 
     * @param precio
     * @param total
     * @param numeroProductos
     * @param idProducto
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Comprar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Comprar", targetNamespace = "http://comprar.me.org/", className = "WSComprar.Comprar")
    @ResponseWrapper(localName = "ComprarResponse", targetNamespace = "http://comprar.me.org/", className = "WSComprar.ComprarResponse")
    @Action(input = "http://comprar.me.org/ComprarWS/ComprarRequest", output = "http://comprar.me.org/ComprarWS/ComprarResponse")
    public boolean comprar(
        @WebParam(name = "id_producto", targetNamespace = "")
        int idProducto,
        @WebParam(name = "precio", targetNamespace = "")
        float precio,
        @WebParam(name = "numero_productos", targetNamespace = "")
        int numeroProductos,
        @WebParam(name = "total", targetNamespace = "")
        float total);

}
