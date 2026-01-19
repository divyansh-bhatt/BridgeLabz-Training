import java.util.ArrayList;
import java.util.List;

public class AddressBookRepository {
    List<ContactModel> listContacts=new ArrayList<>();
    public void save(ContactModel c){
        listContacts.add(c);
    }
    public ContactModel findByName(String name) {
        for (ContactModel person : listContacts) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }
    public boolean deleteByName(String name){
        ContactModel contactModel=findByName(name);
        if(contactModel!=null){
            listContacts.remove(contactModel);
            return true;
        }
        return false;
    }

    public List<ContactModel> findAll() {
        return listContacts;
    }
}

