package homeWork;

import java.util.Arrays;

public class HW17_1 {

    // Task 1
    /*
     Написать метод, принимающий две строки и проверяющий является ли одна строка анграммой другой.
     Метод возвращает boolean
        abcd  - bcda acbd - анаграммы
        abcd -  acb  abkc - не анаграммы

        Вам могут пригодиться следующие методы:
        toCharArray
        Arrays.sort
    */

    public static void main(String[] args) {

        String str1 = "ocean";
        String str2 = "caeno";

        System.out.println("Result is " + Anagrams(str1, str2));
    }

    public static boolean Anagrams(String str1, String str2) {
        return str1 != null && str2 != null &&
                sortString(str1).equals(sortString(str2));
    }

    private static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);


    }

}