public class AddBanana extends PancakeDecorator{
    private double cost = 2d;

    public AddBanana(Pancake decoratedPancake) {
        super(decoratedPancake);
    }

    @Override
    public double cost() {
        return cost+pancake.cost();
    }

    @Override
    public String getDescription() {
        return pancake.getDescription()+" ,Banana";
    }
}
