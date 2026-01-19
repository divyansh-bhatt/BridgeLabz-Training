
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Use Case 7
Ability to ensure there is
no Duplicate Entry of the same
Person in a particular Address
 */
public class AddressBookService {

    private AddressBookDAO dao = new AddressBookDAO();

    public void createAddressBook(String name) {
        dao.addAddressBook(name);
    }

    public boolean addContact(String bookName, ContactModel contact) {
        AddressBook book = dao.getAddressBook(bookName);
//        duplicate validation
        if (book.getContacts().contains(contact)) {
            return false;
        }
        dao.addContact(bookName, contact);
        return true;
    }

    public void deleteContact(String bookName, ContactModel contact) {
        dao.deleteContact(bookName, contact);
    }

//    sorting by name
    public List<ContactModel> sortByName(String bookName) {
        return dao.getAddressBook(bookName)
                .getContacts()
                .stream()
                .sorted(Comparator.comparing(ContactModel::getFirstName))
                .collect(Collectors.toList());
    }
}

