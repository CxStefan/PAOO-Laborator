public class C3Nr {

    private double nr1, nr2, nr3;

    public C3Nr(double nr1, double nr2, double nr3) {
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.nr3 = nr3;
    }

    public double suma() {
        return nr1+nr2+nr3;
    }

    @Override
    public String toString() {
        return nr1 + " + " + nr2 + " + " + nr3 + " = " + suma();
    }
}
