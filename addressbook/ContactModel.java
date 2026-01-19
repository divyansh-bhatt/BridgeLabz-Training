package addressbook;

class ContactModel {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public ContactModel(String firstName, String lastName, String address,
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
    public void setAddress(String address){
        this.address=address;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setZip(String zip){
        this.zip=zip;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public String toString() {
        return "Name: "+firstName+" "+lastName + ", Address: "+address +", "+city+
                ", "+state+" - "+zip+
                ", Phone: "+phoneNumber+
                ", Email: "+email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }
    public String getCity() {
        return city;
    }
    public String getAddress() {
        return address;
    }
}