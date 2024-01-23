package homeWork.HW43_Task2;

import java.io.*;
import java.util.List;

public class Main {
/*
Написать метод, принимающий имя файла и лист Person.
Метод сохраняет в этот файл обьекты класса Person из листа ( класс Person имеет 2 поля name и age- см код занятия).
 */

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Mary", 18),
                new Person("Karl", 36),
                new Person("Anetta", 25));

        try {
            writeToList("people.txt", persons);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToList(String fileName, List<Person> persons) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Person person : persons) {
                writer.write(person.getName() + ", " + person.getAge());
                writer.newLine();
            }
        }
    }
}
