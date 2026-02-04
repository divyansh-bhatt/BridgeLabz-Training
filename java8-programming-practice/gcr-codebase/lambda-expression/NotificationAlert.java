import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;
    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}
public class NotificationAlert {
    public static void main(String[] args) {
        List<Alert> alerts = List.of(
                new Alert("CRITICAL", "Heart rate abnormal"),
                new Alert("INFO", "Appointment reminder"),
                new Alert("WARNING", "High blood pressure")
        );
        Predicate<Alert> criticalOnly =
                alert -> alert.type.equals("CRITICAL");
        alerts.stream()
                .filter(criticalOnly)
                .forEach(System.out::println);

    }
}
