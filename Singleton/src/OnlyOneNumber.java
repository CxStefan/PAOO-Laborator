import java.util.Random;

public class OnlyOneNumber {

    private static OnlyOneNumber instance;
    private int value;
    private OnlyOneNumber(int x) {
        this.value = randomValue(x);
    }

    public static OnlyOneNumber getInstance() {
        if (instance == null) {
            instance = new OnlyOneNumber(100);
        }
        return instance;
    }

    public static int randomValue(int x){
        Random rand = new Random();
        return rand.nextInt(x);
    }

    public void display()
    {
        System.out.println(value);
    }


}
