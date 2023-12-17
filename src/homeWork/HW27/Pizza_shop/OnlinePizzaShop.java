package homeWork.HW27.Pizza_shop;

import java.util.Scanner;

public class OnlinePizzaShop {

/*
Создать магазин/фабрику по продаже и производству пиццы. Программа должна уметь готовить следующие в
виды пиццы:
Гавайи, Маргарита, Салями
Каждый вид пиццы должны уметь: готовиться (накладывать ингредиенты), печься и упаковываться.
В каждом случае должно быть понятно о какой пицце идет речь.
В Классе OnlinePizzaShop (main) не должен создаваться новый объект "пицца", а из него должен
поступать заказ на изготовление требуемого вида (объекта) пиццы в класс PizzaChoice, который и должен
выбрать нужную пиццу для изготовления

Выбор пиццы осуществляется клиентом с клавиатуры в классе OnlinePizzaShop, при этом нужно обеспечить
проверку правильности выбора клиента и возможность заказать еще пиццу/пиццы

1. Классы:

Pizza - родительский класс
1, PizzaMargarita 2, PizzaHawaii 3 - дочерние классы

В этих классах должно быть минимум 3 метода, отражающие процесс приготовления пиццы:
готовиться (накладывать ингредиенты), печься и упаковываться

В этих классах должны быть минимум три метода, отражающие процесс приготовления пиццы:

prepare()
bake()
pack()
orderPizza()

В класс PizzaChoice должен передаваться в соответствующий метод выбор клиента и
в зависимости от выбора через switch возвращаться новый объект соответствующей пиццы

Pizza createPizza(String Type)

Последовательность действий при заказе:


1. Введите название пиццы (1,2,3)

 Далее выводится на экран:
 Preparing pizza with mozzarella cheese
 Baking Pizza Margarita
 Packing Pizza Margarita

Do you want to order another pizza?

 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Choose a pizza:");
            System.out.println("1. Salami");
            System.out.println("2. Margarita");
            System.out.println("3. Hawaii");

            int pizzaChoice = scanner.nextInt();
            Pizza pizza = PizzaChoice.choosePizza(pizzaChoice);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.pack();

                System.out.println();

                System.out.println("Thank you for your order!");
                break;
            } else {
                System.out.println("Wrong choice. Please choose again.");
            }
        }
    }
}

