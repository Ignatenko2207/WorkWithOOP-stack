package info.sjd;

import info.sjd.model.Circle;
import info.sjd.model.Shape;
import info.sjd.model.Square;
import info.sjd.model.Treangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionRunnerTest {

    @Test
    void getMinShape() {
        Shape square = new Square(10);
        Shape circle = new Circle(10);
        Shape treangle = new Treangle(115, 90);
        List<Shape> shapes = new ArrayList<>();
        Shape minShape = CollectionRunner.getMinShape(shapes);
        assertNull(minShape);

        shapes.add(square);
        shapes.add(circle);
        shapes.add(treangle);

        minShape = CollectionRunner.getMinShape(shapes);

        assertNotNull(minShape);
        assertEquals("Square", minShape.getClass().getSimpleName());
    }

    @Test
    void getMaxShape() {
        Shape square = new Square(10);
        Shape circle = new Circle(10);
        Shape treangle = new Treangle(115, 90);
        List<Shape> shapes = new ArrayList<>();
        Shape maxShape = CollectionRunner.getMinShape(shapes);
        assertNull(maxShape);

        shapes.add(square);
        shapes.add(circle);
        shapes.add(treangle);

        maxShape = CollectionRunner.getMaxShape(shapes);

        assertNotNull(maxShape);
        assertEquals("Treangle", maxShape.getClass().getSimpleName());
    }
}