

public class Tourist  extends Person{
    float money;

    public Tourist(float money,String name,int age,Address address){
        super(name,age,address);
        this.money=money;
    }

    @Override
    public String toString()
    {
        return "[ Name: " + super.getName() + ", Age: "+super.getAge()+", Money: "+money+"\nAddress: "+super.getAddress();
    }
}
