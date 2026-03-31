import java.util.*;


class Flight {
    int flightId;
    String source;
    String destination;
    double price;

    Flight(int flightId, String source, String destination, double price) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    void display() {
        System.out.println(flightId + " | " + source + " -> " +
                destination + " | ₹" + price);
    }
}


class Booking {
    int bookingId;
    Flight flight;
    String passengerName;

    Booking(int bookingId, Flight flight, String passengerName) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    void displayBooking() {
        System.out.println("Booking ID: " + bookingId +
                " | Passenger: " + passengerName +
                " | Flight: " + flight.source + " -> " + flight.destination);
    }
}

class FlightBookingSystem {

    // Array to store flights
    private Flight[] flights;

    // List to store bookings
    private List<Booking> bookings = new ArrayList<>();

    private int bookingCounter = 1;

    FlightBookingSystem() {
        flights = new Flight[] {
                new Flight(101, "Delhi", "Mumbai", 4500),
                new Flight(102, "Delhi", "Bangalore", 5500),
                new Flight(103, "Mumbai", "Chennai", 4000),
                new Flight(104, "Kolkata", "Delhi", 5000)
        };
    }

    public void searchFlights(String src, String dest) {
        boolean found = false;
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(src) &&
                    f.destination.equalsIgnoreCase(dest)) {
                f.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found.");
        }
    }

    public void bookFlight(int flightId, String passengerName) {
        for (Flight f : flights) {
            if (f.flightId == flightId) {
                Booking booking = new Booking(bookingCounter++, f, passengerName);
                bookings.add(booking);
                System.out.println("Flight booked successfully!");
                return;
            }
        }
        System.out.println("Invalid Flight ID");
    }

    public void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }
        for (Booking b : bookings) {
            b.displayBooking();
        }
    }

    public void cancelBooking(int bookingId) {
        bookings.removeIf(b -> b.bookingId == bookingId);
        System.out.println("Booking cancelled if ID existed.");
    }
}

public class FlightBookingApp {
    public static void main(String[] args) {

        FlightBookingSystem system = new FlightBookingSystem();
//
        system.searchFlights("delhi","mumbai");
        system.bookFlight(101,"Rahul");
        system.bookFlight(102,"Anita");
        system.viewBookings();
        system.cancelBooking(1);
        system.viewBookings();
    }
}
