package homeWork.HW42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    /*Написать метод, принимающий текстовый файл, состоящий из нескольких строчек разной длины и возвращающий
     самую длинную строчку.
    Пример
    файл:
    aaa
    bbbbbbbbbb
    cc
    вернет метод: bbbbbbbbbb
    */

    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");

        try {
            String longestLine = findLongestLine(file);
            System.out.println("The longest line: " + longestLine);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String findLongestLine(File file) throws IOException {
        List<String> line = Lines(file);
        String maxSizeElement = "";

        for (int i = 0; i < line.size(); i++) {
            if (line.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = line.get(i);
            }
        }
        return maxSizeElement;
    }

    public static List<String> Lines(File fileName) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}

