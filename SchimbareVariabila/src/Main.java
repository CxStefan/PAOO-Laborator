import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        int b=5;
        change(b);
        System.out.println(b); //afiseaza 5 deoarece int este un tip de data primitiva

        AtomicInteger a = new AtomicInteger(10);
        System.out.println(a); // afiseaza 10

        Test.changeVariable(a);
        System.out.println(a); // afiseaza 30 (a schimbat valoarea variabilei)
    }
    public static int change(int b)
    {
        b=3;
        return b;
    }
}