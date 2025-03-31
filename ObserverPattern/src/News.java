import java.util.ArrayList;

public class News implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    String breakingNews;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(breakingNews);
        }
    }

    public void setBreakingNews(String news){
        this.breakingNews = news;
        notifyObservers();
    }
}
