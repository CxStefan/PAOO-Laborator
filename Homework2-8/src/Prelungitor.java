

import java.util.ArrayList;
import java.util.List;

class Prelungitor implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private boolean isPowerOn = false;

    public void bagInPriza() {
        isPowerOn = true;
        notifyObservers();
    }

    public void scoateDinPriza() {
        isPowerOn = false;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(isPowerOn);
        }
    }
}