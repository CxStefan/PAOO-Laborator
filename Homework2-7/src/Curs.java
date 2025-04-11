import java.util.ArrayList;
import java.util.List;

public class Curs implements Subject {
    private List<Observer> studenti;

    public Curs() {
        studenti = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        studenti.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        studenti.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer student : studenti) {
            student.update();
        }
    }

    public void prezenta() {
        System.out.println("=== Prezenta ===");
        notifyObservers(); 
        for (Observer o : studenti) {
            System.out.println(o);
        }
        System.out.println();
    }
}
