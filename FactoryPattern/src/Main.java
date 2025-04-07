public class Main {

    public static void main(String[] args) {
        BeverageFactory factory = new BeverageFactory();

        Beverage beverage1 = factory.getBeverage("Water");

        beverage1.drink();

        Beverage beverage2 = factory.getBeverage("Juice");
        beverage2.drink();

        Beverage beverage3 = factory.getBeverage("Soda");
        beverage3.drink();
    }
}
