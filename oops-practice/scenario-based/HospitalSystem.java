import java.util.ArrayList;
import java.util.List;

interface IPayable {
    double calculateBill();
}
abstract class PatientC implements IPayable {
    private int patientId;
    private String name;
    private int age;
    protected Doctor doctor;

    public PatientC(int patientId, String name, int age, Doctor doctor) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public abstract void displayInfo(); // Polymorphism
}
class InPatientC extends PatientC {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatientC(int id, String name, int age, Doctor doctor,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age, doctor);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient | ID: " + getPatientId() +
                " | Name: " + getName() +
                " | Doctor: " + doctor.getName() +
                " | Bill: " + calculateBill());
    }
}
class OutPatientC extends PatientC {
    private double consultationFee;

    public OutPatientC(int id, String name, int age, Doctor doctor,
                      double consultationFee) {
        super(id, name, age, doctor);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient | ID: " + getPatientId() +
                " | Name: " + getName() +
                " | Doctor: " + doctor.getName() +
                " | Bill: " + calculateBill());
    }
}
class Doctor {
    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }
}

class Bill {
    public static void generateBill(PatientC patient) {
        System.out.println("Bill Amount: " + patient.calculateBill());
    }
}
class HospitalManagement {
    private List<PatientC> patients = new ArrayList<>();

    // CREATE
    public void addPatient(PatientC p) {
        patients.add(p);
    }

    // READ
    public void viewAllPatients() {
        for (PatientC p : patients) {
            p.displayInfo(); // Polymorphism
        }
    }

    // UPDATE (Example: change doctor)
    public void updateDoctor(int patientId, Doctor newDoctor) {
        for (PatientC p : patients) {
            if (p.getPatientId() == patientId) {
                p.doctor = newDoctor;
                return;
            }
        }
    }

    // DELETE
    public void removePatient(int patientId) {
        patients.removeIf(p -> p.getPatientId() == patientId);
    }
}
public class HospitalSystem {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor(2, "Dr. Mehta", "Orthopedics");

        PatientC p1 = new InPatientC(101, "Ramesh", 45, d1, 5, 3000);
        PatientC p2 = new OutPatientC(102, "Suresh", 30, d2, 800);

        HospitalManagement hm = new HospitalManagement();

        hm.addPatient(p1);
        hm.addPatient(p2);

        hm.viewAllPatients();

        Bill.generateBill(p1);
        Bill.generateBill(p2);

        hm.removePatient(101);
        System.out.println("After Deletion:");
        hm.viewAllPatients();
    }
}

