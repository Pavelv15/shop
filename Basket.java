package shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<ItemCart> basket = new ArrayList<>();
    boolean  buy(Product p) {

        for (ItemCart itemCart : basket) {
            if (p.equals(itemCart.getP())) {
                itemCart.setCount(itemCart.getCount() + 1);
                return  false;


            }

        }
        basket.add(new ItemCart(1, p));
        return true;
    }





    void showBascket() {
        for (ItemCart itemCart : basket) {
            System.out.println(itemCart);
        }
    }
    }


