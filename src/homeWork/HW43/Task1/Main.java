package homeWork.HW43.Task1;

public class Main {

    /*
      Создать следующие интерфейсы:
  Printable, содержащий метод void print(String s)
  Producable, содержащий метод String produce()
  Используя эти интерфейсы написать 2 лямбды, реализующие метод соответствующего интерфейса таким образом:

  строка распечатывается в виде !строка!
  возвращается строка "Hello World"
       */

    public static void main(String[] args) {
        Printable printable = s -> {
            System.out.println("!" + s + "!");
        };

        Producable producable = () -> "Hello World";
        System.out.println(producable.produce());
        printable.print("Hallo Java");
    }
}
