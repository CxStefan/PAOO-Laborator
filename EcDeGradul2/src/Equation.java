
public class Equation {

    int a;
    int b;
    int c;
    double x1;
    double x2;
    Equation(int a, int b, int c) {
        if(a==0)
        {
            throw new ArithmeticException("a cannot be zero");
        }
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void solve() throws NegativeDeltaException{
        double delta = b*b - 4*a*c;
        if(delta<0) {
            throw new NegativeDeltaException("Negative delta");
        }
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);
    }

    @Override
    public String toString() {
        return "x1= "+x1+"; x2= "+x2;
    }

}
