package homeWork.HW39;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;


class NewKeyTest {


    @Test
    public void testMapOnlyA() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");

        assertEquals(null, map.get("ab"));
        assertEquals("Hi", map.get("a"));
        assertEquals(null, map.get("b"));
    }

    @Test
    public void testMapOnlyB() {
        Map<String, String> map = new HashMap<>();
        map.put("b", "There");

        assertEquals(null, map.get("ab"));
        assertEquals(null, map.get("a"));
        assertEquals("There", map.get("b"));
    }
}