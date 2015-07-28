/**
 * Created by alaktionov on 7/22/2015.
 */
public abstract class Product {
    private double price;
    private String name;


    public Product() {
    }

    public Product(double price, String name) {
        setName(name);
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Price: " + this.getPrice();
    }
}
