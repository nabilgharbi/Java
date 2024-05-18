public class TestOrders {
    public static void main(String[] args) {

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("banana", 2.0);
        coffeeKiosk.addMenuItem("Coffee", 1.5);
        coffeeKiosk.addMenuItem("Latte", 4.5);
        coffeeKiosk.addMenuItem("Capuccino", 3.0);
        coffeeKiosk.addMenuItem("Muffin", 4.0);

        coffeeKiosk.newOrder();

    }
}
