import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }

    public void setReady(boolean readyState) {
        this.ready = readyState;
    }
    public boolean getReady() {
        return ready;
    }

    public void setItems(ArrayList<Item> newItems) {
        this.items = newItems;
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready == true) {
            return "Your order is ready";
        }
        return "Thank you for waiting. Your order will be ready soon";
    }

    public double getOrderTotal() {
        
        double total = 0.0;
        for(Item item:items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Customer name: %s\n", this.getName());
        for(Item item:items) {
            System.out.printf("%s - $%.2f\n",item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", this.getOrderTotal());
        System.out.println("------");
    }
}