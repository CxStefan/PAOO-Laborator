public class Main {
    public static void main(String[] args) {
        Curs curs = new Curs();

        Student s1 = new Student("Andrei");
        Student s2 = new Student("Maria");
        Student s3 = new Student("Ioana");

        curs.registerObserver(s1);
        curs.registerObserver(s2);
        curs.registerObserver(s3);

        curs.prezenta();
    }
}
