package shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<Product> products = new ArrayList<>();
    void add() throws IOException {

        System.out.println("Введи навзание товара и его цену через ,");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  product = reader.readLine();
        String[] infoproduct = product.split(",");
        products.add(new Product(infoproduct[0],Integer.parseInt(infoproduct[1])));

    }

    Product getProduct(int id) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (Product product : products) {
            if(product.getId() == id) {
                return product;

            }



        }
        return null;

    }

    void showCatalog() {
        for (Product product : products) {
            System.out.println(product);
        }
    }


}
