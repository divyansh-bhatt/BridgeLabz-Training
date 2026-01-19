import java.util.ArrayList;
import java.util.List;
class Contact{

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address,
                         String city, String state, String zip,
                         String phoneNumber, String email) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    public String getFirstName(){
        return firstName;
    }

    public void updateContact(String address, String city, String state,
                              String zip, String phoneNumber, String email) {
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
}


public class AddressBookProblem {
    List<Contact> listContacts=new ArrayList<>();
    public void add(Contact contacts){
        listContacts.add(contacts);
    }
    public void editContact(String name){
        for(Contact c:listContacts){
            if(c.getFirstName()==name){

            }
        }
    }
    public static void main(String[] args) {
        AddressBookProblem a=new AddressBookProblem();
        Contact contact1= new Contact("Divyansh","Bhatt","road1","Mathura","UP","281406", "7303433575","bhatt11divyansh@gmail.com");
        Contact contact2= new Contact("Aryan","Verma","road2","Agra","UP","288406", "7007733575","verma.aryan@gmail.com");
        a.add(contact1);
        a.add(contact2);


    }
}
