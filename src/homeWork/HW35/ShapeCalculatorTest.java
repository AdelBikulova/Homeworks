package homeWork.HW35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    ShapeCalculator shapeCalculator;

    @BeforeEach
    public void setUp() {
        shapeCalculator = new ShapeCalculator();
    }

    @Test
    public void findPerimeterForCircle_test() {
        double actual = shapeCalculator.findPerimeterForCircle(10.0);
        assertEquals(62.800000000000004, actual);
    }

    @Test
    public void findAreaForCircle_test() {
        double actual = shapeCalculator.findAreaForCircle(10.0);
        assertEquals(314.0, actual);
    }

    @Test
    public void findPerimeterForRectangle_test() {
        double actual = shapeCalculator.findPerimeterForRectangle(10.0, 15.0);
        assertEquals(50.0, actual);
    }

    @Test
    public void findAreaForRectangle_test() {
        double actual = shapeCalculator.findAreaForRectangle(10.0, 15.0);
        assertEquals(150.0, actual);
    }

    @Test
    public void findOneCircle_test() {
        int actual = shapeCalculator.findOneCircle();
        assertEquals(1, actual);
    }

    @Test
    public void findOneRectangle_test() {
        int actual = shapeCalculator.findOneRectangle();
        assertEquals(1, actual);
    }
}
