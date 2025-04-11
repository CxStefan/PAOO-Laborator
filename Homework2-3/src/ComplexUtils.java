public class ComplexUtils {

    public static ComplexNumber suma(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImag() + b.getImag());
    }

    public static ComplexNumber suma(Double a, Double b){
        ComplexNumber c1 = ComplexAdapter.fromDouble(a);
        ComplexNumber c2 = ComplexAdapter.fromDouble(b);
        return suma(c1, c2);
    }

    public static ComplexNumber suma(ComplexNumber nr1,Double nr2){
        Double a = ComplexAdapter.fromComplex(nr1);
        Double sum = a+nr2;
        return ComplexAdapter.fromDouble(sum);
    }

    public static ComplexNumber suma(Double nr1,ComplexNumber nr2){
        return suma(nr2,nr1);
    }
}
