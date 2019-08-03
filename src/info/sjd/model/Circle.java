package info.sjd.model;

public class Circle extends AbstractShape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public int compareTo(Shape shape) {
        if (this.getArea() < shape.getArea()) {
            return -1;
        }
        if (this.getArea() > shape.getArea()) {
            return 1;
        }
        return 0;
    }
}
