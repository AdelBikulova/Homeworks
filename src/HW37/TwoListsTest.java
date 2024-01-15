package HW37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoListsTest {

    @Test
    void compareTwoLists_testResult() {

        List<Integer> list1 = List.of(5, 2, 3, 4, 1, 15);
        List<Integer> list2 = List.of(5, 12, 3, 8, 9, 15);
        List<String> result = TwoLists.compareTwoLists(list1, list2);
        assertEquals(List.of("Yes", "No", "Yes", "No", "No", "Yes"), result);
    }

    @Test
    void CompareTwoLists_TestEmpty() {

        List<Integer> emptyList1 = new ArrayList<>();
        List<Integer> emptyList2 = new ArrayList<>();
        List<String> resultEmpty = TwoLists.compareTwoLists(emptyList1, emptyList2);
        assertEquals(Arrays.asList(), resultEmpty);
    }

    @Test
    void CompareTwoLists_TestLength() {

        List<Integer> list3 = List.of(21, 35, 43, 54, 79, 91);
        List<Integer> list4 = List.of(17, 35, 39, 54, 13, 99);
        List<String> result = TwoLists.compareTwoLists(list3, list4);
        assertEquals(Math.min(list3.size(), list4.size()), result.size());

    }

}

