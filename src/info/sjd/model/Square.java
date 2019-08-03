package info.sjd.model;

import java.io.Serializable;

public class Square extends AbstractShape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public int compareTo(Shape shape) {
        return 0;
    }
}
