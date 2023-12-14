package homeWork.HW25;

public class Truck extends Transport {


        int maxWeight;
        int currentWeight = 0;

        public Truck(String model, String manufacturer, int year, String color,
                     int currentFuel, int maxFuel, String owner, int maxWeight, int currentWeight) {
            super(model, manufacturer, year, color, maxFuel, currentFuel, owner);
            this.maxWeight = maxWeight;
            this.currentWeight = currentWeight;
        }

        public void load(int weight) {
            if (weight > getRemainingCapacity()) {
                System.out.println("This is too heavy for me! Can't continue");
                printRemainingCapacity();
                return;
            }

            currentWeight += weight;
            System.out.println("Loading " + weight + " kg......");
            System.out.println("Loaded " + weight + " kg.");
            printRemainingCapacity();
        }

        public void unload(int unloadingWeight) {
            if (unloadingWeight > currentWeight) {
                System.out.println("Not enough cargo!");
                printRemainingCargo();
                return;
            }

            if (unloadingWeight < 0) {
                System.out.println("Can't unload negative weight");
                return;
            }

            if (currentWeight == 0) {
                System.out.println("Please load the truck before driving!");
                return;
            }

       }

        private void printRemainingCapacity() {
            System.out.println("Remaining capacity " + getRemainingCapacity() + " kg");
        }

        private int getRemainingCapacity() {
            return maxWeight - currentWeight;
        }

        private void printRemainingCargo() {
            System.out.println("Remaining cargo weight is " + currentWeight + " kg");
        }

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                ", currentWeight=" + currentWeight +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", currentFuel=" + currentFuel +
                ", maxFuel=" + maxFuel +
                ", owner='" + owner + '\'' +
                '}';
    }
}