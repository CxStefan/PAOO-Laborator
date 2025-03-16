public class Student {

    String nume;
    double medie;
    int id;

    Student(String nume, double medie, int id) {
        this.nume = nume;
        this.medie = medie;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nume " +nume+ ";media = " + medie + "; id = " + id;
    }
}
