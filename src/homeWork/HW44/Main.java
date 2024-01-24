package homeWork.HW44;

import java.util.function.*;

public class Main {

/*
Переписать лямбда выражения из класса Main пакета our_interfaces
(см.код) с использованием стандартных функциональных интерфейсов
 */

    public static void main(String[] args) {

        BiFunction<Integer, Integer, String> concatable = (a, b) -> Integer.toString(a) + b;
        System.out.println(concatable.apply(1, 3));


        Predicate<String> checkable = s -> s.length() == 3;
        System.out.println(checkable.test("abc"));
        System.out.println(checkable.test("abcd"));


        Predicate<String> checkable1 = s -> s.length() % 2 == 0;
        System.out.println(checkable1.test("abc"));
        System.out.println(checkable1.test("abcd"));


        Function<String, String> transformable = String::toUpperCase;
        System.out.println(transformable.apply("abcDe"));


        Function<String, String> transformable1 = s -> s.length() == 4 ? "****" : s;
        System.out.println(transformable1.apply("ab"));
        System.out.println(transformable1.apply("abcd"));


        Consumer<String> printable = s -> System.out.println("!" + s + "!");
        printable.accept("Hello");


        Supplier<String> producable = () -> "Hello World";
        System.out.println(producable.get());

    }
}

