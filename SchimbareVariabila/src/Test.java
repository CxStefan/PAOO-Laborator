import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    static void changeVariable(AtomicInteger a){
        a.set(30);
    }
}
