package HW37;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No,
    где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
    Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
    Протестировать.
     */


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(1);
        list1.add(15);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(12);
        list2.add(3);
        list2.add(8);
        list2.add(9);
        list2.add(15);

        List<String> result1 = TwoLists.compareTwoLists(list1, list2);

        System.out.println(result1);

        System.out.println();

        // Второй вариант через List.of

        List<Integer> list3 = List.of(21, 35, 43, 54, 79, 91);
        List<Integer> list4 = List.of(17, 35, 39, 54, 13, 99);

        List<String> result2 = TwoLists.compareTwoLists(list3, list4);

        System.out.println(result2);
    }
}

