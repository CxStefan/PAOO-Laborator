public class Student extends Person {

    private int id;

    public Student(String name, int age, Address address, int id){
        super(name, age, address);
        this.id = id;
    }

    public String getName(){return name;}

}
