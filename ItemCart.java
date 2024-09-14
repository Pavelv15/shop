package shop;

public class ItemCart {
    private int id;
    private int count;
    private Product p;
    private static int staticId = 1;

    public ItemCart( int count, Product p) {
        this.id = ItemCart.staticId++;
        this.count = count;
        this.p = p;
    }

    public Product getP() {
        return p;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "В корзине лежить товаро{" +
                 p.getTitle()+
                ", количество=" + count +
                ", сумма =" +  + (p.getPrice() * count) +
                '}';
    }
}
