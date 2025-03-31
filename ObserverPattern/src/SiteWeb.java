public class SiteWeb implements Observer {

    String breakingNews;

    @Override
    public void update(String breakingNews){
        this.breakingNews = breakingNews;
        display();
    }

    private void display(){
        System.out.println("SiteWeb: breaking news : " + breakingNews);
    }

}
