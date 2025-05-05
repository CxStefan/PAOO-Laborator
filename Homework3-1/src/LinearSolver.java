public class LinearSolver {
    private String status;
    private Double result;

    public LinearSolver solve(LinearEquation eq){
        double a = eq.getA();
        double b = eq.getB();

        if(a==0){
            return new LinearSolver("not possible",null);
        }
        else{
            Double result = -b/a;
            return new LinearSolver("one solution",result);
        }
    }

    public LinearSolver(String status,Double result){
        this.status = status;
        this.result = result;
    }

    public LinearSolver(){}

}
