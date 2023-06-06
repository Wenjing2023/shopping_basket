public abstract class Item {

    private String name;
    private double price;
    private int quantity;
    private boolean onSale;

    public Item(String name, double price, int quantity, boolean onSale) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.onSale = onSale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean saleStatus) {
        this.onSale = saleStatus;
    }

}
