package FileIO.Uebung17;

import java.io.File;

public class Main {

    public static void main(String[] args) {
          File file = new File("Uebung11.txt");

        Product p1 = new Product("coffe", 2, "basic needs");
        Product p2 = new Product("cellphone", 34.56, "more basic needs");
        Product p3 = new Product("Kugelschreiber", 63.68, "schreisachen");

        ProductManager productManager = new ProductManager();
        productManager.add(p1);
        productManager.add(p2);
        productManager.add(p3);
        productManager.save(file.toString());
        productManager.load(file.toString());

    }
}
