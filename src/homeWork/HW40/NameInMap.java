package homeWork.HW40;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameInMap {
    /*
    Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
    Написать метод, который по имени вернет количество вхождений этого имени в список,
    т.е. метод принимает лист и имя и возвращает число, соответствующее количеству раз,
     которое это имя встречается в листе.
     int  findNameOccurrence( List<String> list, String name)

     */
    public static int findNameOccurrence(List<String> list, String name) {
        Map<String, Integer> nameN = new HashMap<>();

        for (String s : list) {
            if (nameN.containsKey(s)) {
                nameN.put(s, nameN.get(s) + 1);
                } else {
                nameN.put(s, 1);
            }
        }
        return nameN.get(name);
    }

    public static void main(String[] args) {
        List<String> namesList = List.of("John", "Kate", "Mike", "Kate", "John", "Bill", "John", "Ann");

        String Name1 = "John";
        String Name2 = "Kate";
        String Name3 = "Ann";

        System.out.println(Name1 + ": " + findNameOccurrence(namesList, Name1));
        System.out.println(Name2 + ": " + findNameOccurrence(namesList, Name2));
        System.out.println(Name3 + ": " + findNameOccurrence(namesList, Name3));
    }
}