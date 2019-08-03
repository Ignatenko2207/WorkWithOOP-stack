package info.sjd.model;

import java.util.logging.Logger;

public class Treangle extends AbstractShape {

    private static Logger logger = Logger.getLogger(Treangle.class.getName());
    private double base;

    private double heigth;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public Treangle(double base, double heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    public Treangle() {
    }

    @Override
    public double getArea() {
        return (base * heigth)/2;
    }

    public void getInfo() {
        logger.info("Triangle with base:" + base + " , heigth:" + heigth);
    }

    @Override
    public int compareTo(Shape shape) {
        return 0;
    }
}
