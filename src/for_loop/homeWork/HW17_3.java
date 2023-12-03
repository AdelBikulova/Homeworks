package for_loop.homeWork;

public class HW17_3 {

                        // Task 3
    /*
    Написать свой собственный метод substring, работающий аналогично методу в Джаве.
    Метод принимает строку, индексы начала и конца и возвращает подстроку.
    String mySubstring( String string, int begin, int end).
    */

    public static void main(String[] args) {

    String string = "Happy New Year";
    int begin = 6;
    int end = 14;
    String mySubstring = mySubstring(string, begin, end);
    System.out.println("Result: " + mySubstring);
}

    public static String mySubstring(String string, int begin, int end) {
        if (begin < 0 || end > string.length() || begin > end) {
            return null;
        }
        return string.substring(begin, end);

    }
}