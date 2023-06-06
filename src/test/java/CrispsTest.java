import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrispsTest {
    Crisps walkers;
    Crisps quavers;

    @Before
    public void setUp(){
        walkers = new Crisps("walkers", 2.0, 6, false);
        quavers = new Crisps("quavers", 2.6, 7,true);
    }

    @Test
    public void canGetPrice(){
        assertEquals(2.0, walkers.getPrice(), 0.0);
    }
    @Test
    public void canGetQuantity(){
        assertEquals(6, walkers.getQuantity());
    }

    @Test
    public void canSetQuantity(){
        walkers.setQuantity(8);
        assertEquals(8, walkers.getQuantity());
    }
    @Test
    public void canSetOnsale(){
        walkers.setOnSale(true);
        assertTrue(walkers.isOnSale());
    }
    @Test
    public void canSetNotOnsale(){
        quavers.setOnSale(false);
        assertFalse(quavers.isOnSale());
    }

}
