import java.util.ArrayList;
import java.util.List;

class Contacts{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNumber;
    private String email;
    public Contacts(String firstName,String lastName,String address,String city,String state,int zip, String phoneNumber,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
}
public class AddressBookProblem {
    List<Contacts> listContacts=new ArrayList<>();
    public void add(Contacts contacts){
        listContacts.add(contacts);
    }
    public static void main(String[] args) {
        AddressBookProblem a=new AddressBookProblem();
        Contacts contact1= new Contacts();
        Contacts contact2= new Contacts();
        a.add(contact1);
        a.add(contact2);


    }
}
