package homeWork.HW45;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    /*
    Написать метод, принимающий лист имен, в котором некоторые имена повторяются и
    печатающий имена из листа без печати повторений. При решении использовать Stream API
     */
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Ann", "James", "Kate", "Mark", "Ann", "Sofie", "Kate", "James", "Ann");
        stringList.stream().distinct().forEach(System.out::println);
    }
}