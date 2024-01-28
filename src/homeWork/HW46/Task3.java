package homeWork.HW46;

import java.util.Arrays;

public class Task3 {

    /*
    Написать метод, принимающий в качестве параметров две строки. Первая строка состоит из слов, разделенных пробелом.
    Метод возвращает количество слов первой строки, начинающихся со второй строки

    Пример : Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
    Если вторая строка а, то ответ 4
    Если вторая строка ааа, ответ 2
    Если вторая строка aaaa, ответ 1

     */
    public static void main(String[] args) {
        String str1 = "aaaaaaa cccc ab bbbbb a ff aaa";
        String str2 = "aaaa";
        int counter = howManyWords(str1, str2);
        System.out.println(counter);
    }

    public static int howManyWords(String str1, String str2) {
        return (int) Arrays.stream(str1.split(" "))
                .filter(word -> word.contains(str2))
                .count();
    }
}

