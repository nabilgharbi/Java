// import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {


        // Menu items
        Item item1 = new Item();
            item1.name = "Mocha";
            item1.price = 3.50;
        
        Item item2 = new Item();
            item2.name = "Drip Coffee";
            item2.price = 2.00;
        
        Item item3 = new Item();
            item3.name = "Latte";
            item3.price = 4.50;
        
        Item item4 = new Item();
            item4.name = "Cappuccino";
            item4.price = 4.50;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
            order1.name = "Cindhuri";
            order1.ready = true;

        Order order2 = new Order();
            order2.name = "Jimmy";
            order2.items.add(item1);
            order2.total+=item1.price;
            order2.ready = true;


        Order order3 = new Order();
            order3.name = "Noah";
            order3.items.add(item4);
            order3.total+=item4.price;

        Order order4 = new Order();
            order4.name = "Sam";
            order4.items.add(item3);
            order4.total+=item3.price;
            order4.items.add(item3);
            order4.items.add(item3);
            order4.total+=(item3.price *2 );


        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n\n", order4.ready);
    }
}