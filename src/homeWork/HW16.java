package homeWork;

public class HW16 {

       //              TASK 1
    /*
Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
Пример: Hello -> 10
 */

    public static void main(String[] args) {

        String str = "Example";
        int result = (!str.isEmpty()) ? str.concat(str).length() : -1;
        System.out.println("Double string length: " + result);

        System.out.println();

        //              TASK 2

    /*
Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе, но без первых букв и в верхнем регистре.
Пример: "Hello", "There" -> ELLOHERE
 */
        String str1 = "Nord".substring(1);
        String str2 = "Caroline".substring(1);
        String result1 = str1 + str2;
        System.out.println(result1.toUpperCase());

        System.out.println();


        //              TASK 3
    /*
Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
Примет: abcd -> bcda
 */
        String inputString = "Winter";
        String result2 = (!inputString.isEmpty()) ? inputString.substring(1)+ inputString.charAt(0) : inputString;
        System.out.println("New word: " + result2);
    }

}

