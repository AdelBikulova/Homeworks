package homeWork.HW23;

public class Main {

    /*
    Создать класс Calculator, способный выполнять два арифметических действия - сложение двух чисел,
    вычитание двух чисел а также сложение трех чисел и вычитание трех чисел.
    Калькулятор должен работать как для целых чисел, так и для чисел с запятой.
    (т.е. в классе надо создать соответствующие методы и затем вызывать их в методе main)
     */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sum2(7.5, 2.5);
        System.out.println("The result of adding two numbers: " + calculator.result);

        calculator.subtraction2(16.0, 3.8);
        System.out.println("The result of subtracting two numbers: " + calculator.result);

        System.out.println();

        calculator.sum3(93.0, 25.0, 14.2);
        System.out.println("The result of adding three numbers: " + calculator.result);

        calculator.subtraction3(94.0, 36.0, 6.6);
        System.out.println("The result of subtracting three numbers: " + calculator.result);
    }

}

