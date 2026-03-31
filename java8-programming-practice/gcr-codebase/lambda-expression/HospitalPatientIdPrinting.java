import java.util.List;

public class HospitalPatientIdPrinting {
    public static void main(String[] args) {
        List<Integer>patientIds= List.of(1,2,3,4);
        patientIds.forEach(System.out::println);

    }
}
