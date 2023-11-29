public class HW15_new {
    public class HW15 {

/*
Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма всех имеющихся там чисел 10 тридцати.
Метод возвращает false если нет и true если да.
т.е. для массива 10, 15, 10, 1, 25, 10 -> true
для массива 10, 15, 10, 1, 25, 45 -> false
Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m
 */

        public static void main(String[] args) {

            int[] array1 = {10, 15, 10, 1, 25, 10};
            int[] array2 = {10, 15, 10, 1, 25, 45};

            System.out.println("The sum of numbers 10 in array1 is " + Sum30check(array1));
            System.out.println("The sum of numbers 10 in array2 is " + Sum30check(array2));
        }

        public static boolean Sum30check(int[] array) {
            int sum = 0;

            for (int value : array) {
                if (value == 10) {
                    sum += value;
                }
            }

            return sum == 30;
        }

    }


}
