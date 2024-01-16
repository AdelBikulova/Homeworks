package homeWork.HW38;

import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static String compareStrings(List<String> strings) {

        Iterator<String> iterator = strings.iterator();
        String ourString = iterator.next();
        String shortestString = ourString;
        String longestString = ourString;

        while (iterator.hasNext()) {
            String nextString = iterator.next();

            if (nextString.equals(ourString)) {
                return ourString;
            }

            if (nextString.length() < shortestString.length()) {
                shortestString = nextString;
            }

            if (nextString.length() > longestString.length()) {
                longestString = nextString;
            }
        }
        return longestString;
    }
}