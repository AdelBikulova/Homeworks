package homeWork.HW47;

    /*

    1. Получить и вывести на экран:
    -текущую дату
    -текущий год, месяц и день
    2. Создать дату , например день рождения и вывести на экран
    3. Создать две даты и проверить на равенство
    4. Получить и вывести на экран текущее время
    5. текущее время + 3 часа
    6. Создать дату на неделю позже сегодняшней
    7. Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

    */

import java.time.LocalDate;
import java.time.LocalTime;


public class Date_Time_API {


    public static void main(String[] args) {

        //  1. Получить и вывести на экран:  -текущую дату - текущий год, месяц и день
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println();

        //  2. Создать дату, например день рождения и вывести на экран
        LocalDate localDate = LocalDate.of (2000,12,31);
        System.out.println(localDate);

        System.out.println();

        //  3. Создать две даты и проверить на равенство
        LocalDate date1 = LocalDate.of(2020, 5, 18);
        LocalDate date2 = LocalDate.of(2023, 9, 13);

        if (date1.equals(date2)) {
            System.out.println("Date1 and Date2 are equal");
        }
        else {
            System.out.println("Date1 and Date2 are not equal");
        }

        System.out.println();

        // 3a. Сравнение текущей даты с "прошлой" датой
        LocalDate checkDate1 = LocalDate.of(2020,5,13);
        System.out.println(checkDate1.isBefore(LocalDate.now()));

        System.out.println();

        // 4. Получить и вывести на экран текущее время
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println();

        // 5. текущее время + 3 часа
        LocalTime ourLocalTime = LocalTime.now();
        LocalTime newTime = ourLocalTime.plusHours(3);
        System.out.println("Local time "  + ourLocalTime + " - " + " New Time: " + newTime);

        System.out.println();

        //  6. Создать дату на неделю позже сегодняшней
        LocalDate now1 = LocalDate.now();
        LocalDate newDay = now1.plusWeeks(1);
        System.out.println("New date: " + newDay);

        System.out.println();

        // 7. Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("tomorrow is after today: " + tomorrow.isAfter(LocalDate.now()));
        System.out.println("yesterday is before today: " + yesterday.isBefore(LocalDate.now()));

    }
}