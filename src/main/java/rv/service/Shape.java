package rv.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Shape
{
    @WebMethod double area(double x, double y);
    @WebMethod double perimeter(double x, double y);
}
