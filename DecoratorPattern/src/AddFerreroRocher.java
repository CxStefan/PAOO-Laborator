public class AddFerreroRocher extends PancakeDecorator{
    private double cost = 4d;

    public AddFerreroRocher(Pancake decoratedPancake) {super(decoratedPancake);}

    @Override
    public double cost() {
        return cost+pancake.cost();
    }

    @Override
    public String getDescription() {
        return pancake.getDescription()+" ,Ferrero Rocher";
    }
}
