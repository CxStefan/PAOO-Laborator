import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private Professor professor;
    private List<Student> students;


    public Course() {}

    public Course(String courseName, Professor professor) {
        this.courseName = courseName;
        this.professor = professor;
        this.students = new ArrayList<Student>();
    }

    public void addStudentToCourse(Student student){
        students.add(student);
    }

    public void removeStudentFromCourse(Student student){
        students.remove(student);
    }

    public void addTeacherToCourse(Professor professor){
        this.professor = professor;
    }

    public void removeTeacherFromCourse(Professor professor){
        this.professor = null;
    }

    public void changeTeacherAddress(Address newAddress){
        professor.setAddress(newAddress);
    }

    public void changeStudentAddress(Student student,Address newAddress){
        if(students.contains(student)){
            student.setAddress(newAddress);
        }
    }

    public Course createNewCourse(List<Student> students,String courseName, Professor professor) {
        Course newCourse = new Course(courseName, professor);
        for(Student s : students){
            newCourse.addStudentToCourse(s);
        }

        return newCourse;
    }

    @Override
    public String toString() {
        String output = "Course Name = "+courseName+"\n";
        for(Student s : students){
            String idk;
            idk = s.getName();
            output += idk + "; ";
        }
        output += "\nProfessor Name = "+professor.getName()+"\n";

        return output;
    }
}
