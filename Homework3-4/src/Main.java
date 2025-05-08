public class Main {
    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.print();

        FullyFunctionalPrinter fullyPrinter = new FullyFunctionalPrinter();
        fullyPrinter.fax();
        fullyPrinter.print();
        fullyPrinter.scan();
    }
}
