import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Mihai",20,9.20);
        Student student2 = new Student("Andrei",22,8.87);
        Student student3 = new Student("Stefan",21,9.45);
        Student student4 = new Student("Mircea",20,8.02);
        Student student5 = new Student("Marius",21,7.58);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        System.out.println(students);
    }
}
