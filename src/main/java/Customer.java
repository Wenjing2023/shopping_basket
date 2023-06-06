public class Customer {

    private String name;
    private Boolean loyaltyCard;


    public Customer(String name, Boolean loyaltyCard) {
        this.name = name;
        this.loyaltyCard = loyaltyCard;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getLoyaltyCard() {
        return loyaltyCard;
    }

    public void setHasLoyaltyCard(Boolean loyaltyCard) {
        this.loyaltyCard = true;
    }

    public void setNotHasLoyaltyCard(Boolean loyaltyCard) {
        this.loyaltyCard = false;
    }




}
