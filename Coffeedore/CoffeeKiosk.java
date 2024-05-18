import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(String newName, double newPrice) {
        Item newItem = new Item(newName, newPrice);
        menu.add(newItem);
        int index = menu.indexOf(newItem);
        newItem.setIndex(index);
    }

    public void displayMenu() {
        for(Item item:menu) {
            System.out.printf("%d %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter customer name for a new order:");
        String newName = System.console().readLine();
        Order newOrder = new Order(newName);
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        while(!itemNumber.equals("q")) {
            int i = Integer.parseInt(itemNumber);
            if(i < menu.size()) {
                newOrder.addItem(menu.get(i));
            } else {
                System.out.println("Please choose a valid item from the menu.");
            }
            System.out.println("Please enter another menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        newOrder.display();
        orders.add(newOrder);
    }
}
