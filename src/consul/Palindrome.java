package consul;

public class Palindrome {

    /* Написать метод, проверяющий является ли данная  строка палиндромом
    1234321 -палиндром
    hello - не палиндром
    arozaypalanalapyazora - палиндром

    boolean isPalindrome( String palindrome )
    */

    public static void main(String[] args) {

        String str1 = "zakaz";
        String str2 = "doklad";

        System.out.println("The word 'zakaz' is palindrome = " + isPalindrome(str1));
        System.out.println("The word 'doklad' is palindrome = " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String palindrome) {

        int length = palindrome.length();

        for (int i = 0; i < length / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}

