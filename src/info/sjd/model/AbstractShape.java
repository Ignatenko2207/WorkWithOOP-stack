package info.sjd.model;

public abstract class AbstractShape implements Shape{

    private String className = "Abstract shape";

    @Override
    public String toString() {
        return className;
    }
}
