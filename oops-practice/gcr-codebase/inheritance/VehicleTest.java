class VehiclesP {
    int maxSpeed;
    String fuelType;

    VehiclesP(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends VehiclesP {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends VehiclesP {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends VehiclesP {
    boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        VehiclesP[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10),
                new Motorcycle(150, "Petrol", true)
        };

        for (VehiclesP v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
