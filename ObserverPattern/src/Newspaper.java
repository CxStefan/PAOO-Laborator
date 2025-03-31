public class Newspaper implements Observer{

    String breakingNews;

    @Override
    public void update(String breakingNews){
        this.breakingNews = breakingNews;
        display();
    }

    private void display(){
        System.out.println("Newspaper: breaking news : " + breakingNews);
    }
}
