package FileIO.Uebung17;

import java.io.Serializable;

public class Product implements Serializable {
    String productName;
    double price;
    String productCategorie;

    public Product(String productName, double price, String productCategorie) {
        this.productName = productName;
        this.price = price;
        this.productCategorie = productCategorie;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productCategorie='" + productCategorie + '\'' +
                '}';
    }
}
