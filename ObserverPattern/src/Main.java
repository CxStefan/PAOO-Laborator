public class Main {

    public static void main(String[] args) {
        News news = new News();

        Observer newspaper = new Newspaper();
        Observer siteWeb = new SiteWeb();

        news.registerObserver(newspaper);
        news.registerObserver(siteWeb);

        news.setBreakingNews("Un om a sarit de pe pod!");
    }
}
