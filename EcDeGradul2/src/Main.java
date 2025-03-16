

public class Main {

    public static void main(String[] args) {

        //a*x^2+b*x+c=0
        Equation solver = new Equation (1,-5,6);
        //Equation solver2 = new Equation (2,1,2);//Will show negative delta error
        try{
            solver.solve();
        }catch(NegativeDeltaException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(solver);
    }
}