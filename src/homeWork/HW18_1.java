package homeWork;

public class HW18_1 {

    /* Создать класс Student c полями (переменными) имя и возраст.
    Создать несколько обьектов этого класса. Вывести их на печать
    */

    public static void main(String[] args) {

        Student student1 = new Student("Alice", 25);

        System.out.println("Student's 1 name is: " + student1.name);
        System.out.println(student1.name + "'s age is " + student1.age);

        System.out.println();

        Student student2 = new Student("Leon", 29);

        System.out.println("Student's 2 name is: " + student2.name);
        System.out.println(student2.name + "'s age is " + student2.age);

        System.out.println();

        Student student3 = new Student("Mirabel", 35);

        System.out.println("Student's 3 name is: " + student3.name);
        System.out.println(student3.name + "'s age is " + student3.age);

        System.out.println();
    }
}

