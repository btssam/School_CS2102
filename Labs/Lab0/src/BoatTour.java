/**
 * This class has several methods related to money earned/spent on a boat tour business
 *
 * @author Benjamin Samara
 * @version 1.0
 */
public class BoatTour {

    /**
     * Calculates total cost
     * @param numAdults number of Adults (cannot be negative)
     * @param numKids number of Kids (cannot be negative)
     * @return cost in dollars
     */
    public int tripCosts(int numAdults, int numKids){
        return numAdults * 7 + numKids * 5 + 1500;
    }

    /**
     * Calculates gross cost
     * @param numAdults number of Adults (cannot be negative)
     * @param numKids number of Kids (cannot be negative)
     * @return gross cost in dollars
     */
    public int tripGross(int numAdults, int numKids){
        return numAdults * 60 + numKids * 45;
    }

    /**
     * Calculates net profit and displays it in string
     * @param numAdults number of Adults (cannot be negative)
     * @param numKids number of Kids (cannot be negative)
     * @return net profit in dollars alongside some relevant text
     */
    public String netProfit(int numAdults, int numKids){
        int profit = (tripGross(numAdults, numKids) - tripCosts(numAdults, numKids));
        if (profit >= 0) {
            return "trip profit: $" + profit;
        }
        else{
            return "trip profit: -$" + Math.abs(profit);
            }
        }
    }