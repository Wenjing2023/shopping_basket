import java.util.ArrayList;

public class Basket {
    private ArrayList<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public int getItemsSize() {
        return this.items.size();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void clearAll(){
        this.items.clear();
    }

    public double onSaleTotalPrice(Item item) {
        double price = item.getPrice();
        int quantity = item.getQuantity();
        double totalPrice;
        if (quantity % 2 == 0) {
            totalPrice = (quantity / 2) * price;
        } else {
            totalPrice = ((quantity - 1) / 2) * price + price;
        }
        return totalPrice;
    }

    public double notOnSaleTotalPrice(Item item){
        double price = item.getPrice();
        int quantity = item.getQuantity();
        return price*quantity;
    }

    public double calculate(){
        double totalPrice = 0;

        for (Item item: items){
            if(item.isOnSale()){
                totalPrice += this.onSaleTotalPrice(item);
            }
            else {
                totalPrice += this.notOnSaleTotalPrice(item);
            }
        }
        if(totalPrice<=20){
            return totalPrice;
        }else {
            return totalPrice*0.9;
        }
    }

    public double calculateWithCardChecking(Customer customer){
        if (customer.getLoyaltyCard()==true){
            return this.calculate()*0.98;
        }
        return this.calculate();
    }

}
