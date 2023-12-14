package homeWork.HW26;

class Square extends FigureArea {

    double side;

    public Square(double area, double side) {
        super(area);
        this.side = side;
    }

    @Override
    public void printArea() {
        System.out.println("Square has area of " + area);

    }
}


