public class BaristaTest {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("Drip Coffee", 2.00);
        Item item3 = new Item("latte", 4.50);
        Item item4 = new Item("Cappuccino" , 4.50);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Sam");
        order1.addItem(item1); 
        order1.addItem(item3); 
        order2.addItem(item2); 
        order2.addItem(item2); 
        order3.addItem(item4); 
        order3.addItem(item1); 
        order4.addItem(item1); 
        order4.addItem(item2); 
        order5.addItem(item3); 
        order5.addItem(item4); 
        order1.setReady();
        order3.setReady();
        order5.setReady();
        
        order1.display();
        System.out.println(order1.getStatusMessage());
        order2.display();
        System.out.println(order2.getStatusMessage());
        order3.display();
        System.out.println(order3.getStatusMessage());
        order4.display();
        System.out.println(order4.getStatusMessage());
        order5.display();
        System.out.println(order5.getStatusMessage());

    }
}
