interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
abstract class VehicleAbs implements GPS {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    private String location = "Unknown";

    public VehicleAbs(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName);
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}
class CarC extends VehicleAbs {
    public CarC(String id, String driver) {
        super(id, driver, 15);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
class BikeC extends VehicleAbs {
    public BikeC(String id, String driver) {
        super(id, driver, 8);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
class Auto extends VehicleAbs {
    public Auto(String id, String driver) {
        super(id, driver, 10);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}


public class RideApp {
    public static void main(String[] args) {

        VehicleAbs v1 = new CarC("C101", "Rahul");
        VehicleAbs v2 = new BikeC("B202", "Ankit");
        VehicleAbs v3 = new Auto("A303", "Suresh");

        calculateRide(v1, 10);
        calculateRide(v2, 10);
        calculateRide(v3, 10);
    }

    public static void calculateRide(VehicleAbs vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Fare: ₹" + vehicle.calculateFare(distance));
        System.out.println();
    }
}
