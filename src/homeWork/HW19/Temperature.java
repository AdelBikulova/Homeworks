package homeWork.HW19;

public class Temperature {

    double celsius;
    double fahrenheit;

    public Temperature(double celsius, double fahrenheit) {

        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }
    public double TemperatureToCelsius() {
        return (5*(fahrenheit - 32)/9);
    }

}
