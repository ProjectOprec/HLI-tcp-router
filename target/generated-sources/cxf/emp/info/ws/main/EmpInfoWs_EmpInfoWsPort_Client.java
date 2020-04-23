
package emp.info.ws.main;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-730040-redhat-00001
 * 2020-03-17T12:49:25.846+07:00
 * Generated source version: 3.2.7.fuse-730040-redhat-00001
 *
 */
public final class EmpInfoWs_EmpInfoWsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://main.ws.info.emp/", "EmpInfoWs");

    private EmpInfoWs_EmpInfoWsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EmpInfoWs_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        EmpInfoWs_Service ss = new EmpInfoWs_Service(wsdlURL, SERVICE_NAME);
        EmpInfoWs port = ss.getEmpInfoWsPort();

        {
        System.out.println("Invoking getEmployeeInfo...");
        emp.info.ws.main.EmpInfoRequest _getEmployeeInfo_request = null;
        emp.info.ws.main.EmpInfoResult _getEmployeeInfo__return = port.getEmployeeInfo(_getEmployeeInfo_request);
        System.out.println("getEmployeeInfo.result=" + _getEmployeeInfo__return);


        }

        System.exit(0);
    }

}