package homeWork.HW25;

public class PassengerCar extends Transport {

        int seatCapacity;

    public PassengerCar(String model, String manufacturer, int year, String color,
        int currentFuel, int maxFuel, String owner, int seatCapacity) {
            super(model, manufacturer, year, color, maxFuel, currentFuel, owner);
            this.seatCapacity = seatCapacity;
        }

        public void carryPassengers() {
            System.out.println("The taxi carries passengers to their requested destinations.");
        }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "seatCapacity=" + seatCapacity +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", currentFuel=" + currentFuel +
                ", maxFuel=" + maxFuel +
                ", owner='" + owner + '\'' +
                '}';
    }

    public void seatCapacity() {
        System.out.println("There are five seats in the taxi");

    }
}