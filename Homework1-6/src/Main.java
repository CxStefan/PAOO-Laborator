import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Address address1 = new Address("Aleea Crizantemelor","Craiova","Romania");
        Professor professor = new Professor("Mihail",42,address1,"PAOO");
        Student student1 = new Student("Stefan",20,address1,1);
        Student student2 = new Student("Mihai",22,address1,2);
        Student student3 = new Student("Andrei",21,address1,3);

        Course course = new Course("PAOO",professor);

        course.addStudentToCourse(student1);
        course.addStudentToCourse(student2);
        course.addStudentToCourse(student3);

        System.out.println(course);
    }
}
