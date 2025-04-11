public class Main {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1.0,2.0);
        ComplexNumber c2 = new ComplexNumber(2.0,3.0);
        Double d1 = 3.14;
        Double d2 = 4.56;

        System.out.println(ComplexUtils.suma(c1,d1));
        System.out.println(ComplexUtils.suma(c2,c1));
        System.out.println(ComplexUtils.suma(d1,d2));
    }
}
