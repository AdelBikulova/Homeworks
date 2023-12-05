package homeWork.HW19;

import homeWork.HW18.Rectangle;

public class Homework_19 {

                                // Task 1
    /*
    Создать класс Temperature (температура), содержащий метод для перевода градусов
     по фаренгейту в градусы цельсия ( celsius = 5*(farenheit - 32)/9).
     В классе Main создать несколько обьектов класса Temperature
     (значение температуры по фаренгейту должно задаваться через конструктор)
    и вывести результат перевода на экран
     */

     public static void main(String[] args) {

         Temperature temperature1 = new Temperature (0.0,100);
         System.out.println("Temperature in Celsius: " + temperature1.TemperatureToCelsius());

         System.out.println();

         Temperature temperature2 = new Temperature (0.0,60);
         System.out.println("Temperature in Celsius: " + temperature2.TemperatureToCelsius());

         System.out.println();

         Temperature temperature3 = new Temperature (0.0,230);
         System.out.println("Temperature in Celsius: " + temperature3.TemperatureToCelsius());
     }
}
