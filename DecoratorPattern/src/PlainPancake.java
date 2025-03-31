public class PlainPancake implements Pancake {
    private double cost = 5d;
    private String description = "Plain Pancake";


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return cost;
    }
}
