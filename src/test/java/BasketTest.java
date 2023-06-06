import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;
    Eggs eggs;
    Biscuits oreo;
    Crisps walkers;
    Crisps quavers;
    Customer mar;
    Customer sky;

    @Before
    public void setUp(){
        basket = new Basket();
        eggs = new Eggs("range eggs", 0.5,10, false);
        oreo = new Biscuits("Oreo", 1.6,5, false);
        walkers = new Crisps("walkers", 2.0, 8, true);
        quavers = new Crisps("quavers", 2.6, 7, true);
        mar = new Customer("Mar", true);
        sky = new Customer("Sky", false);

        this.basket.addItem(eggs);
        this.basket.addItem(oreo);
    }

    @Test
    public void canAddItem(){

        this.basket.addItem(walkers);
        assertEquals(3, this.basket.getItemsSize());
    }
    @Test
    public void canRemoveItem(){
        this.basket.addItem(walkers);
        this.basket.removeItem(eggs);
        assertEquals(2, this.basket.getItemsSize());
    }

    @Test
    public void canEmptyItems(){
        this.basket.addItem(walkers);
        this.basket.clearAll();
        assertEquals(0, this.basket.getItemsSize());
    }

//    Not onSale & <=20; no discount;
    @Test
    public void canGetTotalPriceNotOnSaleUnder20(){
        assertEquals(13, this.basket.calculate(), 0.1);
    }

//  Not onSale & >20; 10% off
    @Test
    public void canGetTotalPriceNotOnSaleOver20(){
        this.basket.getItems().get(0).setQuantity(30);
        assertEquals(20.7,this.basket.calculate(),0.0);
    }

// OnSale & >20; buy 1 get 1 free & 10% off
    @Test
    public void canGetTotalPriceOnSaleOver20(){
        this.basket.addItem(walkers);
        assertEquals(18.9, this.basket.calculate(), 0.1);
    }

//    Not onSale & <=20; no discount; RoyaltyCard 2%off
    @Test
    public void canCalculateWhenHasLoyaltyCard(){
        assertEquals(12.74,this.basket.calculateWithCardChecking(mar), 0.1);
    }

//   OnSale & >20; buy 1 get 1 free & 10% off; Non-RoyaltyCard
    @Test
    public void canCalculateWhenNotHasLoyaltyCard(){
        basket.addItem(walkers);
        assertEquals(18.9,basket.calculateWithCardChecking(sky), 0.1);
    }
}
