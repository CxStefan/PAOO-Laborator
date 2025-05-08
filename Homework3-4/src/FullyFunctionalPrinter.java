public class FullyFunctionalPrinter implements MultifunctionalPrinter{

    @Override
    public void print(){
        System.out.println("Fully functional printer prints!");
    }

    @Override
    public void scan(){
        System.out.println("Fully functional printer scans!");
    }

    @Override
    public void fax(){
        System.out.println("Fully functional printer sending fax!");
    }
}
