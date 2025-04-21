class AparatElectric implements Observer {
    private String nume;

    public AparatElectric(String nume) {
        this.nume = nume;
    }

    public void update(boolean isPowerOn) {
        if (isPowerOn) {
            System.out.println(nume + " a fost conectat la curent.");
        } else {
            System.out.println(nume + " a fost deconectat de la curent.");
        }
    }
}
