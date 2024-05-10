public class Item {

    private String name;
    private double price;
    
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getItemName() {
        return this.name;
    }
    
    public void setItemName(String itemName) {
        this.name = itemName;
    }

    public double getItemPrice() {
        return this.price;
    }

    public void setItemPrice(double itemPrice) {
        this.price = itemPrice;
    }


}