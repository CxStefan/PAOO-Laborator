import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoffeeLover cl = new CoffeeLover(List.of(new SimpleCoffeeMachine(), new ComplexCoffeeMachine()));
        cl.makeCoffee();
    }
}
