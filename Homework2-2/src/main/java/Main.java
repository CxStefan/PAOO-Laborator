public class Main {
    public static void main(String[] args) {
        WebHelper helper1 = WebHelper.getInstance();
        WebHelper helper2 = WebHelper.getInstance();

        helper1.loadURL();
        helper2.loadURL();

        System.out.println(helper1.toString());
        System.out.println(helper2.toString());
    }
}
