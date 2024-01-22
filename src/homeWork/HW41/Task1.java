package homeWork.HW41;

public class Task1 {

    /*

    Поймать исключение (с выводом на экран его типа), которое возникает при выполнении следующего кода int a = 40/0

    Поймать исключение (с выводом на экран его типа), которое возникает при выполнении следующего кода
    String s =null;
    String m = s.toLowerCase()

    Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
    int[] m = new int[2]
    m[8]=5

     */
    public static void main(String[] args) {

        int n1 = 40;
        int n2 = 0;

        try {
            int a = n1 / n2;
            System.out.println(a);

            String s = null;
            String m = s.toLowerCase();

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero!" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException " + e.getMessage());
        }

        int[] m = new int[2];
        for (int i = 0; i < m.length; i++) {
            try {
                m[8] = 5;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
                System.out.println("The second array is finished and no elements left.");
            }
        }
    }
}