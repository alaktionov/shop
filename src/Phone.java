/**
 * Created by alaktionov on 7/22/2015.
 */
public class Phone extends Product {
    private String color;
    public static int count;
    public static double commonPrice;

    public Phone() {
        super.setName("iPhone");
        super.setPrice(1000.0);
        setColor("Grey");
        count++;
        commonPrice += 1000.0;
    }

    public Phone(double price, String name, String color) {
        super(price,name);
        setColor(color);
        count++;
        commonPrice =+ price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + this.getColor();
    }

    public static double calculateAveragePrice() {
        return commonPrice/count;
    }
}
