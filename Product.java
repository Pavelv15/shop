package shop;

public class Product {
    private  int id;
    private String title;
    private int price;
    private static int staticId = 1;

    public Product( String title, int price) {
        this.id = Product.staticId++;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }
}
