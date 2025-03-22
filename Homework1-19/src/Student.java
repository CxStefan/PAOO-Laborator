

public class Student {

    private String name;
    private int age;
    private double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name+" - " + grade;
    }
}
