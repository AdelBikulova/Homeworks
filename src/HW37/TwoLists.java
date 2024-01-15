package HW37;

import java.util.ArrayList;
import java.util.List;

public class TwoLists {

    public static List<String> compareTwoLists(List<Integer> list1, List<Integer> list2) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }

        return result;
    }
}

