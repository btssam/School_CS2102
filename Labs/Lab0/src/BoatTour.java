public class BoatTour {

    public int tripCosts(int numAdults, int numKids){
        return numAdults * 7 + numKids * 5 + 1500;
    }

    public int tripGross(int numAdults, int numKids){
        return numAdults * 60 + numKids * 45;
    }

    public String netProfit(int numAdults, int numKids){
        int profit = (numAdults * 60 + numKids * 45) - (numAdults * 7 + numKids * 5 + 1500);
        if (profit >= 0) {
            return "trip profit: $" + String.valueOf(profit);
        }
        else{
            return "trip profit: -$" + String.valueOf(profit);


            // will likely need to get rid of a negative sign. This will return -$-500
            // use absolute value
            }
        }
    }
