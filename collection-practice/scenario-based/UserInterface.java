import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;

class InvalidBookingDetailsException extends Exception{
    public InvalidBookingDetailsException(String message){
        super(message);
    }
}

class HotelBooking{

    private static final List<String> HOTEL_NAMES = List.of("ITC MAURYA", "WESTIN", "TAJ HOTEL", "RADISSON BLUE");
    private static final List<String> ROOM_TYPE = List.of("Standard", "Deluxe", "Suite");

    public static void validateUserDetails(String name, int age, String email, String creditCard) throws InvalidBookingDetailsException {
        if(age < 18 || age > 100) {
            throw new InvalidBookingDetailsException("Invalid age");
        }

        if(!email.endsWith("@gmail.com")){
            throw new InvalidBookingDetailsException("Invalid email");
        }
        if(creditCard.length() != 16 || !creditCard.chars().allMatch(Character::isDigit)) {
            throw new InvalidBookingDetailsException("Invalid credit card details");
        }

    }
    public static void validateBookingDetails(String hotelName, String roomType, LocalDate checkInDate, LocalDate
            checkOutDate) throws InvalidBookingDetailsException {

        if(!HOTEL_NAMES.contains(hotelName)){
            throw new InvalidBookingDetailsException("Invalid hotel name");
        }

        if(!ROOM_TYPE.contains(roomType)){
            throw new InvalidBookingDetailsException("Invalid room type");
        }

        if (!checkInDate.isAfter(LocalDate.now())) {
            throw new InvalidBookingDetailsException("Invalid check-in date");
        }

        if (!checkOutDate.isAfter(checkInDate)) {
            throw new InvalidBookingDetailsException("Invalid check-out date");
        }
    }

    public static double calculateBookingCost(String roomType, int numNights, boolean breakfastIncluded){
        double totalCost = 0;

        if(roomType.equals("Standard")){
            totalCost += numNights * 1000;
        } else if (roomType.equals("Suite")) {
            totalCost += numNights * 3000;
        } else if (roomType.equals("Deluxe")) {
            totalCost += numNights * 2000;
        }

        if(breakfastIncluded){
            totalCost += numNights * 100;
        }
        return totalCost;
    }
}
public class UserInterface {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.print("Enter your email: ");
            String email = sc.next();

            System.out.print("Enter credit card details: ");
            String creditCard = sc.next();

            HotelBooking.validateUserDetails(name, age, email, creditCard);

            System.out.print("Enter hotel name: ");
            String hotelName = sc.next();

            System.out.print("Select room type: ");
            String roomType = sc.next();

            System.out.print("Enter check-in date(\"yyyy-MM-dd\"): ");
            String checkInDate = sc.next();

            System.out.print("Enter check-out date(\"yyyy-MM-dd\"): ");
            String checkOutDate = sc.next();

            long days = 0;
            try{
                LocalDate checkIn = LocalDate.parse(checkInDate, formatter);
                LocalDate checkOut = LocalDate.parse(checkOutDate, formatter);
                days = ChronoUnit.DAYS.between(checkIn, checkOut);
            }catch (Exception e){
                System.out.println("Invalid Date format");
            }
            int numOfNights = (int) days;
            LocalDate checkIn = LocalDate.parse(checkInDate, formatter);
            LocalDate checkOut = LocalDate.parse(checkOutDate, formatter);
            HotelBooking.validateBookingDetails(hotelName, roomType, checkIn, checkOut);

            double totalCost = HotelBooking.calculateBookingCost(roomType,numOfNights,false);
            System.out.println(totalCost);
        }catch (InvalidBookingDetailsException e){
            System.out.println(e.getMessage());
        }
    }
}