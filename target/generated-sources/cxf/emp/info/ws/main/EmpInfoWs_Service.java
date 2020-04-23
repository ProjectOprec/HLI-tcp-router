package emp.info.ws.main;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-730040-redhat-00001
 * 2020-03-17T12:49:25.911+07:00
 * Generated source version: 3.2.7.fuse-730040-redhat-00001
 *
 */
@WebServiceClient(name = "EmpInfoWs",
                  wsdlLocation = "classpath:wsdl/EmpInfoWs.wsdl",
                  targetNamespace = "http://main.ws.info.emp/")
public class EmpInfoWs_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://main.ws.info.emp/", "EmpInfoWs");
    public final static QName EmpInfoWsPort = new QName("http://main.ws.info.emp/", "EmpInfoWsPort");
    static {
        URL url = EmpInfoWs_Service.class.getClassLoader().getResource("wsdl/EmpInfoWs.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(EmpInfoWs_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/EmpInfoWs.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EmpInfoWs_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmpInfoWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpInfoWs_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EmpInfoWs_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EmpInfoWs_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EmpInfoWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EmpInfoWs
     */
    @WebEndpoint(name = "EmpInfoWsPort")
    public EmpInfoWs getEmpInfoWsPort() {
        return super.getPort(EmpInfoWsPort, EmpInfoWs.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpInfoWs
     */
    @WebEndpoint(name = "EmpInfoWsPort")
    public EmpInfoWs getEmpInfoWsPort(WebServiceFeature... features) {
        return super.getPort(EmpInfoWsPort, EmpInfoWs.class, features);
    }

}