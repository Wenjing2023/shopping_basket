import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomerTest {
    Customer keith;
    Customer sky;

    @Before
    public void setUp(){
        keith = new Customer("Keith",true);
        sky = new Customer("Sky",false);
    }

    @Test
    public void canSetHasLoyaltyCard(){
        this.sky.setHasLoyaltyCard(this.sky.getLoyaltyCard());
        assertTrue(this.sky.getLoyaltyCard());
    }

    @Test
    public void canSetNotHasLoyaltyCard(){
        this.keith.setNotHasLoyaltyCard(this.keith.getLoyaltyCard());
        assertFalse(this.keith.getLoyaltyCard());
    }

}
