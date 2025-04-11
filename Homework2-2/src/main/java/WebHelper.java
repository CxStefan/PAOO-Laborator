public class WebHelper {

    private static WebHelper instance;
    private String url ="www.google.com";

    public static WebHelper getInstance(){
        if(instance==null)
        {
            instance = new WebHelper();
        }
        return instance;
    }

    public void loadURL(){
        System.out.println("Loading URL: "+url);
    }
}
