package rv.implementation;

import rv.service.Shape;

import javax.jws.WebService;

@WebService(endpointInterface = "rv.service.Shape")
public class TriangleImpl implements Shape
{
    @Override
    public double area(double base, double height) {
        return 0.5*base*height;
    }

    @Override
    public double perimeter(double base,double height) {
        return base*height;
    }
}
