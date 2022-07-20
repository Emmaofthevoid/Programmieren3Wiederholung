package FileIO.Uebung17;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> listOfProducts;

    public ProductManager() {
        this.listOfProducts = new ArrayList<>();
    }

    public void add(Product p) {
        listOfProducts.add(p);
    }

    public void save(String path) {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream;

        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Product p :
                    listOfProducts) {
                objectOutputStream.writeObject(p);
            }
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void load(String path) {

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object object;

            while ((object = objectInputStream.readObject()) != null) {
                System.out.println(object);
            }
        } catch (EOFException eofException) {
            System.out.println("End of file reached");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
