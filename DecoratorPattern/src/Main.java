public class Main {

    public static void main(String[] args) {
        Pancake pancake = new PlainPancake();

        System.out.println(pancake.getDescription()+ "$ "+pancake.cost());

        Pancake pancakeWithBananas = new AddBanana(new PlainPancake());
        System.out.println(pancakeWithBananas.getDescription()+ "$ "+pancakeWithBananas.cost());

        Pancake pancakeClassic = new AddChocolate(new AddBanana(new PlainPancake()));
        System.out.println(pancakeClassic.getDescription()+ "$ "+pancakeClassic.cost());

        Pancake pancakePremium = new AddChocolate(new AddBanana(new AddFerreroRocher(new PlainPancake())));
        System.out.println(pancakePremium.getDescription()+ "$ "+pancakePremium.cost());
    }
}
