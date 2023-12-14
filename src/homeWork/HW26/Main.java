package homeWork.HW26;

public class Main {

    /*
    Геометрические фигуры. Используя свойства наследования написать программу
    для подсчета площади 3-х видов фигур - круга, прямоугольника и квадрата.
    Создать классы circle, rectangle, square - содержащие соответствующие методы.
    В методе main создать массив из нескольких фигур и вывести на печать плащади
    каждой фигуры и название ее таком виде:

    Circle has area of 100.0
    Rectangle has area of 400.0
    Square has area of 340.0

     */

    public static void main(String[] args) {

        FigureArea[] figure = new FigureArea[3];

        Circle circle = new Circle(3.14 * 4.5 * 4.5, 4.5);
        circle.display();

        System.out.println();

        Rectangle rectangle = new Rectangle(5.0 * 8.0, 5.0, 8.0);
        rectangle.printArea();

        Square square = new Square(9.0 * 9.0, 9.0);
        square.printArea();

        System.out.println();

        figure[0] = new Circle(3.14 * 8.0 * 8.0, 8.0);
        figure[1] = new Rectangle(12.0 * 9.5, 12.0, 9.5);
        figure[2] = new Square(5.0 * 5.0, 5.0);

        for (FigureArea figureArea : figure) {
            figureArea.printArea();

        }
    }
}