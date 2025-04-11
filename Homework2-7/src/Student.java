import java.util.Random;

public class Student implements Observer {
    private String nume;
    private String status;

    public Student(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void update() {
        status = new Random().nextBoolean() ? "prezent" : "absent";
    }

    @Override
    public String toString() {
        return nume + " - " + status;
    }
}
