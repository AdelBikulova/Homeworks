package homeWork.HW36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {

    private OurList<Integer> ourList1;
    private OurList<Integer> ourList2;
    private OurList<Integer> ourList3;
    private OurList<Integer> ourList4;
    private OurList<Integer> ourList5;

    @BeforeEach
    void setUp() {
        ourList1 = new OurArrayList<>();
        ourList2 = new OurArrayList<>();
        ourList3 = new OurArrayList<>();
        ourList4 = new OurArrayList<>();
        ourList5 = new OurArrayList<>();

        ourList1.append(5);
        ourList1.append(8);
        ourList2.append(13);
        ourList3.append(15);
        ourList4.append(28);
        ourList5.append(30);
        ourList5.append(42);
        ourList5.append(53);
    }

    @Test
    void testAppend() {
        assertEquals(2, ourList1.size());
        assertEquals(1, ourList2.size());
        assertEquals(1, ourList3.size());
        assertEquals(1, ourList4.size());
        assertEquals(3, ourList5.size());
    }

    @Test
    void testGet() {
        assertEquals(15, ourList3.get(0));
        assertEquals(53, ourList5.get(2));
    }

    @Test
    void testSet() {
        ourList2.set(358, 0);
        ourList4.set(469, 0);
        assertEquals(358, ourList2.get(0));
        assertEquals(469, ourList4.get(0));
    }

    @Test
    void testRemoveById() {
        Integer removedElement = ourList5.removeById(1);
        assertEquals(42, removedElement);
    }
}