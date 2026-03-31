import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient implements MedicalRecord {

    private int patientId;
    private String name;
    private int age;

    // sensitive data (encapsulation)
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + medicalHistory);
    }
}
class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}
class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
public class HospitalApp {
    public static void main(String[] args) {

        Patient p1 = new InPatient(1, "Amit", 40, 5, 2000);
        Patient p2 = new OutPatient(2, "Riya", 25, 500);

        p1.addRecord("Diabetes");
        p2.addRecord("Flu");

        showBilling(p1);
        showBilling(p2);
    }

    public static void showBilling(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Bill: ₹" + patient.calculateBill());
        patient.viewRecords();
        System.out.println();
    }
}




