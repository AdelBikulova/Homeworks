package homeWork.HW22;

public class Autosalon {

    String salon;

    public Autosalon(String salon) {
        this.salon = salon;
    }

    public void findCar(String carToFind) {
        int index = salon.indexOf(carToFind);

        if (index != -1) {
            System.out.println("This car is available.");
        } else {
            System.out.print("This car is not available, please choose from: " + salon);
        }
    }
}