package homeWork.HW46;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

  /*  Есть тот же класс Person с полями String name, int age.

   -  Написать метод,принимающий список Person и возвращающий суммарный возраст тех, кто старше 18 лет
   -  Написать метод,принимающий список Person и возвращающий имена тех, кто старше 18 лет в виде такой строки:
            "At the moment John and Ann and Bill are of legal age "
            ( имена и текст могут быть любыми, по вашему выбору, структура предложения должна сохраняться)

    */

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Ann", 32),
                new Person("James", 20),
                new Person("Mark", 15),
                new Person("Sofie", 45),
                new Person("Kate", 16));

        int age = AgeOfPersons(persons);
        System.out.println("People over the age of 18 are cumulatively " + age + " years old");

        System.out.println();

        String adults = OnlyAdults(persons);
        System.out.println(adults);
    }

    public static int AgeOfPersons(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getAge() > 18)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String OnlyAdults(List<Person> persons) {
        return "At the moment " +
                persons.stream()
                        .filter(person -> person.getAge() > 18)
                        .map(Person::getName)
                        .collect(Collectors.joining(" and ", "", " are of legal age"));

    }
}
