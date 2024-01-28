package homeWork.HW46;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
    /*
    Пусть есть класс Person с полями имя и возраст. Написать метод, принимающий список Person и возвращающий мапу,
    где возраст является ключом, а лист людей этого возраста - значением.
    */

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Ann", 32),
                new Person("James", 20),
                new Person("Mark", 15),
                new Person("Sofie", 45),
                new Person("Kate", 16));

        System.out.println(ListOfPerson(persons));
    }

    public static Map<Integer, Set<String>> ListOfPerson(List<Person> persons) {
        return persons.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toSet())));

    }
}

