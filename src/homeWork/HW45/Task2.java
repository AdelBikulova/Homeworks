package homeWork.HW45;

import java.util.List;

public class Task2 {

    /*

    Есть класс Address с полями String street и int houseNumber и класс Person с полями String name, int age, Address address.
    Используя Stream API написать метод, принимающий лист Person и печатающий адреса тех, кто старше 17 лет

     */

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Ann", 32, new Address("Street1", 31)),
                new Person("James", 20, new Address("Street2", 214)),
                new Person("Mark", 15, new Address("Street3", 52)),
                new Person("Sofie", 45, new Address("Street4", 68)),
                new Person("Kate", 16, new Address("Street5", 757))
        );

        newAddressList(persons);
    }

    public static void newAddressList(List<Person> persons) {
        persons.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person::getAddress)
                .forEach(address -> System.out.println("Address: " + address.getStreet() + " " + address.getHouseNumber()));

    }
}
