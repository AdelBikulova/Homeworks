package homeWork.HW30;

import java.util.Scanner;

public class Main {

    /*
    Написать программу, которая при вводе с клавиатуры дня недели отвечает на вопрос
    является ли этот день выходным. (true/false) Использовать Enum !
   */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        String userInput = scanner.next().toUpperCase();

        boolean BusinessDay = false;
        boolean Weekend = false;

        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.name().toUpperCase().equals(userInput)) {
                BusinessDay = true;
                Weekend = day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
                break;
            }
        }
        if (BusinessDay) {
            System.out.println("It's a weekend? " + Weekend);
        } else {
            System.out.println("Enter the correct day of the week");
        }
    }
}

