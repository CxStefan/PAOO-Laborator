public class Produs {
    private int productID;
    private String nume;
    private double pret;

    public Produs(int productID, String nume, double pret) {
        this.productID = productID;
        this.nume = nume;
        this.pret = pret;
    }

    public int getProductID() {return productID;}
    public String getNume() {return nume;}
    public double getPret() {return pret;}

    @Override
    public String toString() {
        return "ID: " + productID + ", Nume: " + nume + ", Pret: " + pret;
    }
}
