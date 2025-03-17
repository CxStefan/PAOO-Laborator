public class Employee extends Person {
    String company;
    public Employee(){}
    public Employee(String name,Address address) {
        super(name, address);
        this.company = name;
    }

    @Override
    public String toString() {
        return address.toString();
    }
}
