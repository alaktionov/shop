import java.util.Arrays;

/**
 * Created by alaktionov on 7/22/2015.
 */
public class Container {
    private int count = 0;
    private int size = 10;
    public Product[] container = new Product[size];

    //???????? ??????? ? ??????
    public boolean add(Product product) {
        if (!ensureCapacity()) {
            increaseArray();
        }
        container[count++] = product;
        return true;
    }

    //???????? ?????? ???????
    public int getSize() {
        return size;
    }

    //???????? ?????????? ????????? ? ???????
    public int getCount() {
        return count;
    }

    //???????? ??????? ?? ???????
    public Product getProduct(int index) {
        rangeCheck(index);
        return container[index];
    }

    //?????????? ?????????? ???????
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(container[i]);
        }
    }

    //????????????? ??????
    public void sortByPrice() {
        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++) {
                if (container[i].getPrice() > container[j].getPrice()) {
                    Product tmp = container[i];
                    container[i] = container[j];
                    container[j] = tmp;
                }
            }
        }
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private boolean ensureCapacity() {
        return count < size;
    }

    private void increaseArray() {
        size = size + size/2;
        Product[] temContainer = container;
        container = new Product[size];
        for (int i = 0; i < temContainer.length; i++) {
            container[i] = temContainer[i];
        }
    }
}
