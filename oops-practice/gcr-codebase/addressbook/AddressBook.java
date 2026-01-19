
import java.util.ArrayList;
import java.util.List;

//Use Case 5
// Ability to add multiple person to Address Book
public class AddressBook {
    private String name;
    private List<ContactModel> contacts = new ArrayList<>();

    public AddressBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public List<ContactModel> getContacts() {
        return contacts;
    }
}

