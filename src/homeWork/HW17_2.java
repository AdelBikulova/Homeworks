package homeWork;

public class HW17_2 {

// Task 2
    /*
    Написать метод, принимающий строку и целое число(индекс) и возвращающий строку без символа,
    находящегося по этому индексу.

    Пример:
    int index = 3
    String str = "Hello"

    public static String removeCharAtIndex( String str, int index) -> "Helo"

    */
    public static void main(String[] args) {

        String str = "Wetter";
        int index = 3;

        System.out.println( "Result is "+ removeCharAtIndex(str, index));
    }

    public static String removeCharAtIndex(String str, int index) {
        if (str == null || index < 0 || index >= str.length()) {
            return str;
        }
        return str.substring(0, index) + str.substring(index + 1);
    }
}


