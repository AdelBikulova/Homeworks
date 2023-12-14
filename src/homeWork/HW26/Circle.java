package homeWork.HW26;

class Circle extends FigureArea {

    double radius;

    public Circle(double area, double radius) {
        super(area);
        this.radius = radius;
    }

    @Override
    public void printArea() {
        System.out.println("Circle has area of " + area);
    }

    public void display() {
        System.out.println();
        printArea();
        super.printArea();

    }
}
