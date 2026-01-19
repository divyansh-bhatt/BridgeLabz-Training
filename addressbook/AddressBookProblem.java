package addressbook;

import java.util.ArrayList;
import java.util.List;



public class AddressBookProblem {
    static AddressBookRepository addressBookRepository=new AddressBookRepository();
    static AddressBookService addressBookService=new AddressBookService(addressBookRepository);
    public static void main(String[] args) {

        System.out.println("------------Display contacts after adding-------------");
        addressBookService.addContact(new ContactModel("Divyansh","Bhatt","road1","Mathura","UP","281406", "7303433575","bhatt11divyansh@gmail.com"));
        addressBookService.addContact(new ContactModel("Aryan","Verma","road2","Agra","UP","288406", "7007733575","verma.aryan@gmail.com"));

        addressBookService.display();
        System.out.println("------------------------------------------------------");

        System.out.println("------------Display contacts after editing-------------");
        boolean edit =addressBookService.editContact("Divyansh", new ContactModel("Divyansh","","road3","Mumbai","Maharashtra","200111","7303433575","divyanshbhatt@gmail.com"));
        if(edit)System.out.println("Contact Updated");
        else System.out.println("Contact not found");
        addressBookService.display();
        System.out.println("------------------------------------------------------");
        System.out.println("------------Display contacts after deleting-------------");
        addressBookService.deleteContact("divyansh");
        addressBookService.display();




    }
}
