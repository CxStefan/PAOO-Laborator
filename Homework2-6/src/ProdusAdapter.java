public class ProdusAdapter {

    public static Product produsToProduct(Produs produs) {
        return new Product(produs.getProductID(), produs.getNume(), produs.getPret()/4.0d);
    }

    public static Produs productToProdus(Product product) {
        return new Produs(product.getProductID(), product.getProductName(), product.getPrice()*4.0d);
    }
}
