import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Examples {
    @Test
    public void testBT_trip_costs_zero(){
        BoatTour bt = new BoatTour();
        assertEquals(1500,bt.tripCosts(0,0));
    }
    @Test
    public void testBT_trip_gross_zero(){
        BoatTour bt = new BoatTour();
        assertEquals(0,bt.tripGross(0,0));
    }

    @Test
    public void testBT_trip_net_profit_zero(){
        BoatTour bt = new BoatTour();
        assertEquals("trip profit: -$1500", bt.netProfit(0,0));
    }

    @Test
    public void testBT_trip_net_profit_one(){
        BoatTour bt = new BoatTour();
        assertEquals("trip profit: -$1447", bt.netProfit(1,0));
    }

    @Test
    public void TestBT_trip_net_profit_two(){
        BoatTour bt = new BoatTour();
        assertEquals("trip profit: -$1460", bt.netProfit(0,1));;
    }

    @Test
    public void TestBT_trip_net_profit_three(){
        BoatTour bt = new BoatTour();
        assertEquals("trip profit: $360", bt.netProfit(20,20));;
    }

    @Test
    public void testHC_total_costs_zero(){
        HouseCalculator hc = new HouseCalculator();
        assertEquals(2500.0,hc.totalCost(0.0,0.0), 0.01);
    }
}