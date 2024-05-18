public class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public double getPrice() {
        return price;
    }

    public void setIndex(int newIndex) {
        this.index = newIndex;
    }
    public int getIndex() {
        return index;
    }
    
}
