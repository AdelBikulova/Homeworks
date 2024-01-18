package homeWork.HW40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameInMapTest {

    private NameInMap name;

    @BeforeEach
    public void setUp() {
        name = new NameInMap();
    }

    @Test
    void testFindThreeJohn() {
        List<String> namesList = Arrays.asList("John", "Kate", "Mike", "Kate", "John", "Bill", "John", "Ann");
        assertEquals(3, NameInMap.findNameOccurrence(namesList, "John"));
    }

    @Test
    void testFindTwoKaties() {
        List<String> namesList = Arrays.asList("John", "Kate", "Mike", "Kate", "John", "Bill", "John", "Ann");
        assertEquals(2, NameInMap.findNameOccurrence(namesList, "Kate"));
    }

    @Test
    void testFindNameOccurrenceAnn() {
        List<String> namesList = Arrays.asList("John", "Kate", "Mike", "Kate", "John", "Bill", "John", "Ann");
        assertEquals(1, NameInMap.findNameOccurrence(namesList, "Ann"));

    }
}