package homeWork.HW35;

public class ShapeCalculator {
public double findPerimeterForCircle(double radius) {
        return 2 * 3.14 * radius;
        }

public double findAreaForCircle(double radius) {
        return 3.14 * radius * radius;
        }

public double findPerimeterForRectangle(double length, double width) {
        return 2 * (length + width);
        }

public double findAreaForRectangle(double length, double width) {
        return length * width;
        }

public int findOneCircle() {
        return 1;
        }

public int findOneRectangle() {
        return 1;
    }
}