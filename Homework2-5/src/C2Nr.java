public class C2Nr {

    private double nr1;
    private double nr2;

    public C2Nr(double nr1, double nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }

    public double suma() {
        return nr1 + nr2;
    }

    public double getNr1(){return nr1;}
    public double getNr2(){return nr2;}

    @Override
    public String toString() {
        return nr1 + " + " + nr2 + " = " + suma();
    }
}
