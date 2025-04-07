public class BeverageFactory {

    public Beverage getBeverage(String beverageType){
        if(beverageType == null){
            return null;
        }
        if(beverageType.equalsIgnoreCase("Soda")){
            return new Soda();
        }
        if(beverageType.equalsIgnoreCase("Juice")){
            return new Juice();
        }
        if(beverageType.equalsIgnoreCase("Water")){
            return new Water();
        }
        return null;
    }
}
