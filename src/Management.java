/**
 * Created by alaktionov on 7/22/2015.
 */
public class Management {
    public static void main(String[] args) {
        Product tablet1 = new Tablet();
        Product tablet2 = new Tablet(500,"LG",32);
        Product tablet3 = new Tablet(200,"Lenovo",64);
        Product phone1 = new Phone();
        Product phone2 = new Phone(600,"Samsung","Red");
        Product phone3 = new Phone(800,"HTC","Black");
        Container container = new Container();
        System.out.println("Tablets' count: " + Tablet.count);
        System.out.println("Tablets' common price: " + Tablet.commonPrice);
        System.out.println("Tablets' average price" + Tablet.calculateAveragePrice());
        System.out.println("_____________________________");
        System.out.println("Phones' count: " + Phone.count);
        System.out.println("Phones' common price: " + Phone.commonPrice);
        System.out.println("Phones' avarage price: " + Phone.calculateAveragePrice());
        System.out.println("_______________________________");
        container.add(phone2);
        container.add(phone1);
        container.add(phone3);
        container.add(tablet1);
        container.add(tablet2);
        container.add(tablet3);
        System.out.println("Amount of products: " + container.getCount());
        System.out.println("_______________________________");
        System.out.println("Printing all products before sorting by Price:");
        container.print();
        container.sortByPrice();
        System.out.println("_______________________________");
        System.out.println("Printing all products after sorting by Price:");
        container.print();
    }
}
