public class Professor extends Person{

    String subject;

    Professor(String name, int age, Address address,String subject) {
        super(name,age,address);
        this.subject = subject;
    }

    public String getSubject() {return subject;}

    public String getName() {return name;}
}
