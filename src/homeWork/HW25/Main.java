package homeWork.HW25;

import java.util.Arrays;

public class Main {

            /*  2 Условие

   Внести изменения в наш проект Transport( см. урок 21) таким образом,
   чтобы класс Truck стал дочерним классом.
   Кроме него, также создать еще один дочерний класс , например PassengerCar.
   Определить, какие переменные и методы в этом случае должны быть в родительском классе,
   а какие в дочерних.
    */

         /*    1. Условие

      Создать класс грузовик Truck, содержащий общие характеристики грузовиков:
      model, manufacturer,year (год выпуска),colour,maxWeight (грузоподьемность),
      maxFuel (  обьем топливного бака), имя владельца и имеющий следующее поведение:
      1.должен уметь загружаться (load)  и при этом сообщать, если превышена его грузоподьемность а также сообщать
       колько еще можно загрузить груза
      2.разгружаться и  при этом сообщать в случае если пытаются разгрузить больше чем имеющийся у него на борту груз
       или пытаются разгрузить отрицательный груз. Также должен сообщать вес остающегося на борту груза
      3. В случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
      4. Должен уметь ездить и останавливаться
      5. уметь заправляться топливом
      6. уметь сообщать имя владельца

   Создать несколько грузовиков, протестировать их работу , сложить в массив и вывести на экран

    */

    public static void main(String[] args) {

            Transport transport = new Transport("Q5", "Audi", 2020, "red", 30, 70, "James");
            System.out.println(transport);

            transport.move();
            transport.stop();
            transport.setCurrentFuel(30);
            transport.getOwner();

            System.out.println();

            Truck truck = new Truck("SuperTruck", "Volvo", 2018, "grey", 60, 5000, "Billy", 10000, 100);
            System.out.println(truck);


            truck.load(5000);
            truck.setCurrentFuel(60);
            truck.move();
            truck.stop();
            truck.unload(10000);
            truck.getOwner();


            System.out.println();


            PassengerCar passengerCar = new PassengerCar("Taxi", "Kia", 2016, "yellow", 20, 50, "John", 5);
            System.out.println(passengerCar);

            passengerCar.carryPassengers();
            passengerCar.move();
            passengerCar.stop();
            passengerCar.getOwner();
            passengerCar.seatCapacity();


        }
    }


