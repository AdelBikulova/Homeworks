package homeWork.HW42;

import java.io.*;

public class Task1 {

    /*Пусть есть текстовый файл такого вида:
            1
            2
            3
            4
            5
    Нужно написать метод, принимающий файл и возвращающий сумму всех значений
*/

    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");

        try {
            int sum = findSum(file);
            System.out.println("Sum of numbers: " + sum);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int findSum(File file) throws IOException {
        int sum = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
        }

        return sum;
    }
}
