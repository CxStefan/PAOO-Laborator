public class AddChocolate extends PancakeDecorator{
    private double cost=3d;

    public AddChocolate(Pancake decoratedPancake) {super(decoratedPancake);}

    @Override
    public double cost() {
        return pancake.cost()+cost;
    }

    @Override
    public String getDescription() {
        return pancake.getDescription()+" ,Chocolate";
    }
}
