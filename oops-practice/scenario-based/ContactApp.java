import java.util.ArrayList;
import java.util.List;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}
class ContactOrganizer {
    private List<Contact> contacts = new ArrayList<>();

    // Add Contact
    public void addContact(String name, String phoneNumber)
            throws InvalidPhoneNumberException {

        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException(
                    "Phone number must be exactly 10 digits");
        }

        // Check duplicate phone number
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Duplicate contact not allowed!");
                return;
            }
        }

        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added successfully.");
    }

    // Delete Contact
    public void deleteContact(String phoneNumber) {
        contacts.removeIf(c -> c.getPhoneNumber().equals(phoneNumber));
        System.out.println("Contact deleted (if existed).");
    }

    // Search Contact
    public void searchContact(String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Contact Found: " + c);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Display All Contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
public class ContactApp {
    public static void main(String[] args) {

        ContactOrganizer organizer = new ContactOrganizer();
        try {
            organizer.addContact("Rohan", "9876543210");
            organizer.addContact("Divyansh", "9123456789");
            // Invalid phone number
            organizer.addContact("Aman", "12345");
            // Duplicate phone number
            organizer.addContact("Rohit", "9876543210");

        } catch (InvalidPhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        organizer.searchContact("9876543210");
        organizer.deleteContact("9123456789");
        System.out.println("\nAll Contacts:");
        organizer.displayContacts();

    }
}
