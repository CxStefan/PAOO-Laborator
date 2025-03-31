public class Main {
    public static void main(String[] args) {
        OnlyOneNumber number1 = OnlyOneNumber.getInstance();
        OnlyOneNumber number2 = OnlyOneNumber.getInstance();

        number1.display();
        number2.display();
    }
}
