import java.util.ArrayList;
import java.util.List;

interface IRentable {
    double calculateRent(int days);
}
abstract class VehicleC implements IRentable {
    protected int vehicleId;
    protected String brand;
    protected double ratePerDay;
    protected boolean isAvailable;

    public VehicleC(int vehicleId, String brand, double ratePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
        this.isAvailable = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public abstract void displayInfo();
}
class BikeType extends VehicleC {

    public BikeType(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return ratePerDay * days;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike | ID: " + vehicleId +
                " | Brand: " + brand +
                " | Rent/day: " + ratePerDay);
    }
}
class CarType extends VehicleC {

    public CarType(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (ratePerDay * days) + 500; // fixed service charge
    }

    @Override
    public void displayInfo() {
        System.out.println("Car | ID: " + vehicleId +
                " | Brand: " + brand +
                " | Rent/day: " + ratePerDay);
    }
}
class TruckType extends VehicleC {

    public TruckType(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (ratePerDay * days) + 1000; // heavy vehicle charge
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck | ID: " + vehicleId +
                " | Brand: " + brand +
                " | Rent/day: " + ratePerDay);
    }
}
class Customer {
    private int customerId;
    private String name;
    private VehicleC rentedVehicle;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public void rentVehicle(VehicleC v, int days) {
        if (v.isAvailable) {
            rentedVehicle = v;
            v.isAvailable = false;
            System.out.println(name + " rented " + v.brand +
                    " for " + days + " days. Rent: " + v.calculateRent(days));
        } else {
            System.out.println("Vehicle not available");
        }
    }

    public void returnVehicle() {
        if (rentedVehicle != null) {
            rentedVehicle.isAvailable = true;
            rentedVehicle = null;
            System.out.println("Vehicle returned successfully");
        }
    }
}
class VehicleRentalSystemC {
    private List<VehicleC> vehicles = new ArrayList<>();

    // CREATE
    public void addVehicle(VehicleC v) {
        vehicles.add(v);
    }

    // READ
    public void viewVehicles() {
        for (VehicleC v : vehicles) {
            v.displayInfo(); // Polymorphism
        }
    }

    // UPDATE (Change rate)
    public void updateRate(int vehicleId, double newRate) {
        for (VehicleC v : vehicles) {
            if (v.getVehicleId() == vehicleId) {
                v.ratePerDay = newRate;
                return;
            }
        }
    }

    // DELETE
    public void removeVehicle(int vehicleId) {
        vehicles.removeIf(v -> v.getVehicleId() == vehicleId);
    }
}
public class VehicleRentalApp {
    public static void main(String[] args) {

        VehicleRentalSystemC system = new VehicleRentalSystemC();

        VehicleC b1 = new BikeType(1, "Yamaha", 500);
        VehicleC c1 = new CarType(2, "Honda", 1500);
        VehicleC t1 = new TruckType(3, "Tata", 3000);

        system.addVehicle(b1);
        system.addVehicle(c1);
        system.addVehicle(t1);

        system.viewVehicles();

        Customer cust = new Customer(101, "Amit");
        cust.rentVehicle(c1, 3);
        cust.returnVehicle();

        system.removeVehicle(1);

        System.out.println("After deletion:");
        system.viewVehicles();
    }
}
