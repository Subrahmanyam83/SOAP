package unit;

import org.junit.Test;
import rv.service.Shape;
import rv.utils.Property;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class UnitTests {

    @Test
    public void testOne() throws MalformedURLException {
        String endpointUrl = String.format("%s%s",Property.getInstance().getProperty("endpoint.address"),"?wsdl");

        URL url = new URL(endpointUrl);
        QName qName = new QName("http://implementation.rv/", "TriangleImplService");
        Service service= Service.create(url,qName);

        Shape shape = service.getPort(Shape.class);
        System.out.println(shape.area(12.45,34.56));
    }
}
