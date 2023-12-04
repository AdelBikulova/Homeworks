package homeWork;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }
    public double perimeterOfRectangle() {
        return (length + width)*2;
        }

    public double areaOfRectangle() {
        return length*width;
        }

    }



