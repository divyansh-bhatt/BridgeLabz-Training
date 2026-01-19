package addressbook;

import addressbook.AddressBookRepository;

public class AddressBookService {
    AddressBookRepository addressBookRepository ;

    ContactModel contactModel;
    public AddressBookService(AddressBookRepository addressBookRepository){
        this.addressBookRepository=addressBookRepository;
    }
    public String addContact(ContactModel c1){
        addressBookRepository.save(c1);
        return "Contact added";
    }
    public boolean editContact(String firstName, ContactModel updatedPerson) {

        ContactModel contactModel=addressBookRepository.findByName(firstName);
        if(contactModel!=null) {
            contactModel.setAddress(updatedPerson.getAddress());
            contactModel.setCity(updatedPerson.getCity());
            contactModel.setZip(updatedPerson.getZip());
            contactModel.setState(updatedPerson.getState());
            contactModel.setEmail(updatedPerson.getEmail());
            contactModel.setPhoneNumber(updatedPerson.getPhoneNumber());
            return true;
        }
        return false;

    }
    public void deleteContact(String firstName) {
        boolean deleted=addressBookRepository.deleteByName(firstName);
        if(deleted)System.out.println("User deleted");
        else System.out.println("User not present");
    }
    public void display(){

        for(ContactModel person: addressBookRepository.findAll()) {
            System.out.println(person.toString());
        }
    }
}
