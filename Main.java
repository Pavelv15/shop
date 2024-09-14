package shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    void  shoping() throws IOException {
        boolean chek = false;
        Catalog catalog1 = new Catalog();
        Basket b = new Basket();
        while (!chek) {

            System.out.println("Введите операцию: ADD - добавление в каталог,BUY - Добавление товара в корзину, CATALOG- отображение каталога, BASKET - отобржаение корзины, STOP для выхода ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String answer = reader.readLine();
            switch (answer) {
                case "ADD":
                    catalog1.add();
                    break;
                case "BUY":
                    System.out.println("введи id для взятия  ,");
                    BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                    String id = reader2.readLine();
                    Product p = catalog1.getProduct(Integer.parseInt(id));
                    b.buy(p);
                    break;
                case "CATALOG":
                    catalog1.showCatalog();
                    break;
                case "BASKET":
                    b.showBascket();
                    break;
                case "STOP":
                    chek = true;
                    break;
                default:
                    System.out.println("Ввели неверное значение");
                    break;

            }
        }
    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.shoping();

    }
}

