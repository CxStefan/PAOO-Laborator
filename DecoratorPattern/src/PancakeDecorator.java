public abstract class PancakeDecorator implements Pancake {

    protected Pancake pancake;

    public PancakeDecorator(Pancake decoratedPancake) {
        pancake = decoratedPancake;
    }

    @Override
    public String getDescription() {
        return pancake.getDescription();
    }

    @Override
    public double cost() {
        return pancake.cost();
    }
}
