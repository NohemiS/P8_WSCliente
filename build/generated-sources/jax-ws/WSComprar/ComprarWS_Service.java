
package WSComprar;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ComprarWS", targetNamespace = "http://comprar.me.org/", wsdlLocation = "http://localhost:8080/ComprarWS/ComprarWS?wsdl")
public class ComprarWS_Service
    extends Service
{

    private final static URL COMPRARWS_WSDL_LOCATION;
    private final static WebServiceException COMPRARWS_EXCEPTION;
    private final static QName COMPRARWS_QNAME = new QName("http://comprar.me.org/", "ComprarWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ComprarWS/ComprarWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPRARWS_WSDL_LOCATION = url;
        COMPRARWS_EXCEPTION = e;
    }

    public ComprarWS_Service() {
        super(__getWsdlLocation(), COMPRARWS_QNAME);
    }

    public ComprarWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPRARWS_QNAME, features);
    }

    public ComprarWS_Service(URL wsdlLocation) {
        super(wsdlLocation, COMPRARWS_QNAME);
    }

    public ComprarWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPRARWS_QNAME, features);
    }

    public ComprarWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ComprarWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ComprarWS
     */
    @WebEndpoint(name = "ComprarWSPort")
    public ComprarWS getComprarWSPort() {
        return super.getPort(new QName("http://comprar.me.org/", "ComprarWSPort"), ComprarWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ComprarWS
     */
    @WebEndpoint(name = "ComprarWSPort")
    public ComprarWS getComprarWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://comprar.me.org/", "ComprarWSPort"), ComprarWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPRARWS_EXCEPTION!= null) {
            throw COMPRARWS_EXCEPTION;
        }
        return COMPRARWS_WSDL_LOCATION;
    }

}
