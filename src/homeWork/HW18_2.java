package homeWork;

public class HW18_2 {

/*
Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
конструктор и методы для подсчета площади и периметра прямоугольника.
В классе Main создать несколько обьектов класса Rectangle и вывести на экран
площадь и периметр каждого
 */

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4.0,5.0);

        System.out.println("Perimeter of rectangle №1 = " + rectangle1.perimeterOfRectangle());
        System.out.println("Area of rectangle №1 = " + rectangle1.areaOfRectangle());

        System.out.println();

        Rectangle rectangle2 = new Rectangle(8.0,12.0);

        System.out.println("Perimeter of rectangle №2 = " + rectangle2.perimeterOfRectangle());
        System.out.println("Area of rectangle №2 = " + rectangle2.areaOfRectangle());

        System.out.println();

        Rectangle rectangle3 = new Rectangle(6.0,9.0);

        System.out.println("Perimeter of rectangle №3 = " + rectangle3.perimeterOfRectangle());
        System.out.println("Area of rectangle №3 = " + rectangle3.areaOfRectangle());

    }
}
