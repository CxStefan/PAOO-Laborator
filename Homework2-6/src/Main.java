public class Main {
    public static void main(String[] args) {
        Produs prod1 = new Produs(1,"Banane",5.0);
        System.out.println(prod1);

        Product prod2 = new Product(54,"Chocolate",23.0);
        System.out.println(prod2);

        Product prod3 = ProdusAdapter.produsToProduct(prod1);
        System.out.println(prod3);

        Produs prod4 = ProdusAdapter.productToProdus(prod2);
        System.out.println(prod4);
    }
}
