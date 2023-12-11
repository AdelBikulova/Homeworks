package homeWork.HW23;

public class Calculator {

    double result;

    public Calculator() {
        this(0.0);
    }

    public Calculator(double number) {
        this.result = number;
    }

    public Calculator sum2(double num1, double num2) {
        this.result = num1 + num2;
        return this;
    }

    public Calculator subtraction2(double num1, double num2) {
        this.result = num1 - num2;
        return this;
    }

    public Calculator sum3(double num1, double num2, double num3) {
        this.result = num1 + num2 + num3;
        return this;
    }

    public Calculator subtraction3(double num1, double num2, double num3) {
        this.result = num1 - num2 - num3;
        return this;

    }
}