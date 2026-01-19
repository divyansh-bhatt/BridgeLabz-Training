public class Office {
    String name;
    String address;
    public Office(String name, String address){
        this.name=name;
        this.address=address;
    }
    public String show(){
        return "Office name: "+name+
                "Address: "+address;
    }
}
