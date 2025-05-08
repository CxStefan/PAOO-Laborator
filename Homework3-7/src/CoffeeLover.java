import java.util.List;

public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;

    public void setCoffeeMachines(List<CoffeeMachine> coffeeMachines){
        this.coffeeMachines = coffeeMachines;
    }

    public void makeCoffee(){
        if(coffeeMachines!=null){
            coffeeMachines.forEach(CoffeeMachine::start);
        }
        else{
            System.out.println("No coffee machines added! ");
        }
    }
}
