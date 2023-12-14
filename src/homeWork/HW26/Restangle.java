package homeWork.HW26;

class Rectangle extends FigureArea {

    double length;
    double width;

    public Rectangle(double area, double length, double width) {
        super(area);
        this.length = length;
        this.width = width;
    }

    @Override
    public void printArea() {
        System.out.println("Rectangle has area of " + area);

    }
}
