package rv.implementation;

import rv.service.Shape;

import javax.jws.WebService;

@WebService(endpointInterface = "rv.service.Shape")
public class RectangleImpl implements Shape
{
    @Override
    public double area(double length, double height) {
        return length*height;
    }

    @Override
    public double perimeter(double length,double height) {
        return 2*(length+height);
    }
}
