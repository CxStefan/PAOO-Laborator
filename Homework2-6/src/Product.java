public class Product {
    private int productID;
    private String productName;
    private double price;

    public Product(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public int getProductID() {return productID;}
    public String getProductName() {return productName;}
    public double getPrice() {return price;}

    @Override
    public String toString() {
        return "Product ID: " + productID + ", Product Name: " + productName + ", Product Price: " + price;
    }
}
