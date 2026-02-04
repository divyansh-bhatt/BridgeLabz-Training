import java.util.List;
public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employeeNames = List.of("divyansh", "amit", "neha");
        employeeNames.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
