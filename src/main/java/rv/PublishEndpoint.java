package rv;

import rv.implementation.TriangleImpl;

import javax.xml.ws.Endpoint;

public class PublishEndpoint {

    public static void main(String args[]){
        Endpoint.publish("http://localhost:9001/rv/",new TriangleImpl());
    }
}
