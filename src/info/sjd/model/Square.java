package info.sjd.model;

import java.io.Serializable;

public class Square extends AbstractShape implements Shape, Serializable {

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
}
