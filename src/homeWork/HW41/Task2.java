package homeWork.HW41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    /*
    Написать метод, который принимает список имен и их анаграмм и имя, по которому он возвращает список
    всех его анаграмм, включая само имя. При решении использовать мапу.
    Пример: [john, mary, ,jonh, bill, njoh, amry], john -> [john,jonh,njoh] (все буквы в словах маленькие)
     */

    private static Map<String, Integer> findName(String str) {
        Map<String, Integer> nameN= new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String s= String.valueOf(str.charAt(i));
            nameN.put(s, nameN.getOrDefault(s, 0) + 1);
        }
        return nameN;
    }

    public static List<String> anagramsOfNames(List<String> strings, String name) {
        name = name.toLowerCase();

        Map<String, Integer> names = findName(name);

        List<String> anagrams = new ArrayList<>();
        for (String str : strings) {
            str = str.toLowerCase();
            if (findName(str).equals(names)) {
                anagrams.add(str);
            }
        }
        return anagrams;
    }

    public static void main(String[] args) {
        List<String> namesList = List.of("john", "mary", "jonh", "bill", "njoh", "amry", "ryma", "lilb", "blil");

        String name = "mary";
        List<String> anagrams = anagramsOfNames(namesList, name);

        System.out.println("Result for " + name + ": " + anagrams);
    }
}