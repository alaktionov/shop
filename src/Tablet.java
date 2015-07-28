/**
 * Created by alaktionov on 7/22/2015.
 */
public class Tablet extends Product {
    private int memory;
    public static int count;
    public static double commonPrice;

    public Tablet() {
        super.setName("iPad");
        super.setPrice(800.0);
        setMemory(16);
        count++;
        commonPrice += 800.0;
    }

    public Tablet(double price, String name, int memory) {
        super(price, name);
        setMemory(memory);
        count++;
        commonPrice += price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() + ", Memory: " + this.getMemory();
    }

    public static double calculateAveragePrice() {
        return commonPrice/count;
    }
}
