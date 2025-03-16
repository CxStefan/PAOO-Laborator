public abstract class Person {

    public String name;
    public int age;
    public Address address;

    public Person() {}

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Address getAddress() {return address;}

    public void setAddress(Address address) {this.address = address;}
}
