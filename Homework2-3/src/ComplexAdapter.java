public class ComplexAdapter {

    public static ComplexNumber fromDouble(Double d){
        return new ComplexNumber(d,0);
    }

    public static Double fromComplex(ComplexNumber c){
        return c.getModulus();
    }

}
