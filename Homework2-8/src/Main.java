public class Main {
    public static void main(String[] args) {
        Prelungitor prelungitor = new Prelungitor();

        AparatElectric cafetiera = new AparatElectric("Aparatul de cafea");
        AparatElectric frigider = new AparatElectric("Frigiderul");
        AparatElectric cuptorMicrounde = new AparatElectric("Cuptorul cu microunde");

        prelungitor.addObserver(cafetiera);
        prelungitor.addObserver(frigider);
        prelungitor.addObserver(cuptorMicrounde);

        prelungitor.bagInPriza();
        prelungitor.scoateDinPriza();
    }
}