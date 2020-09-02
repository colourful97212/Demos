package aboutWebserviceSometing;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @Description
 * @Version
 * @Date 8/31/2020
 * @Author Gon
 */
public class TestWebserviceLocal
{
    public static void main(String[] args)
    {
        JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
        bean.setAddress("http://localhost:8080/ws/users.wsdl?wsdl");
        //bean.setServiceClass(WeatherWSSoap.class);
    }
}
