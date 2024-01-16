package homeWork.HW38;

import java.util.List;

public class Main {

    /*Написать метод, принимающий не пустой лист строк и возвращающий строку, которая встречается раньше в листе
     - самую короткую или самую длинную. Все строки в листе разной длины.
     */
    public static void main(String[] args) {
        List<String> stringList = List.of("cat", "rabbit", "dolphin", "horse", "bear", "elephant");

        String result = ListIterator.compareStrings(stringList);

        System.out.println("The longest word is: " + result);

    }
}