package rv;

import rv.implementation.TriangleImpl;
import rv.utils.Property;
import javax.xml.ws.Endpoint;

public class PublishEndpoint {

    public static void main(String args[]){
        String endpointUrl = Property.getInstance().getProperty("endpoint.address");
        Endpoint.publish(endpointUrl,new TriangleImpl());
        System.out.println("Server Running on 9003 port.......");
    }
}
