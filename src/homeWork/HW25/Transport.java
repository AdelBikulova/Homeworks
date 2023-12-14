package homeWork.HW25;

public class Transport {
    String model;
    String manufacturer;
    int year;
    String color;
    int currentFuel = 0;
    int maxFuel;
    String owner;

        public Transport(String model, String manufacturer, int year, String colour,
                         int currentFuel, int maxFuel, String owner){


        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = colour;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public void move() {
        if (currentFuel == 0) {
            System.out.println("Not enough fuel, can't drive");
            return;
        }

        System.out.println("Trying...");
        System.out.println("Yeah, driving!");
    }

    public void stop() {
        System.out.println("Stopping...");
        System.out.println("Yeah!");
    }

    public void setCurrentFuel(int currentFuel) {
        if (currentFuel > maxFuel) {
            this.currentFuel = maxFuel;
            return;
        }
        this.currentFuel = currentFuel;
    }

    public String getOwner() {
        return "The owner is " + owner;
    }


    @Override
    public String toString() {
        return "Transport{" +
                "model= " + model +
                ", manufacturer=" + manufacturer +
                ", year=" + year +
                ", color= " + color +
                ", maxFuel=" + maxFuel +
                ", owner= " + owner +
                '}';
    }
}


