public class Employee extends Office{
    public String name;
    public String id;
    public double salary;
    public Employee(String officeName, String officeAddress,String name, String id, double salary){
        super(officeName, officeAddress);
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String show(){
        return  "Office name:"+super.name+
                " Office address:"+address+
                " Employee name:"+name+
                " Employee id:"+id+
                " Employee salary:"+salary;
    }
    public static void main(String[] args) {
        Office office = new Employee(
                "Capg","Mumbai","Divyansh", "101", 29000.0
        );
        System.out.println(office.show());
    }
}
