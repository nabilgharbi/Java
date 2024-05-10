import java.util.ArrayList;

public class Order {
    
    
    private String name; 
    private boolean ready; 
    private ArrayList<Item> items; 
    
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }
    
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if (ready){
            return "Your Order is Ready";
        } else {
            return "Thank you for waiting, Your order will be ready soon.";
        }
    }
    public double getOrderTotal() {
        double sum = 0.00;
        for (Item i : this.items ) {
            sum += i.getItemPrice();
        }
        return sum;
    }

    public void display() {
        System.out.println("-------------");
        System.out.println("Customer Name: " + this.getName());
        for (Item i : this.items) {
            System.out.println(i.getItemName() + " - $" + i.getItemPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
        System.out.println("-------------");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String setName) {
        this.name = setName;
    }
    
    public ArrayList<Item> getItems() {
        return this.items;
    }
    
    public void setReady() {
        this.ready = true;
    }

}