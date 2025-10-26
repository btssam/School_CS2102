public class HouseCalculator {

    public double totalCost(double purchasePrice,double downPayment){
        double apr = 0.08;
        int years = 30;
        double principal = purchasePrice - downPayment;
        double bankFee = 2500.0;

        double simpleInterest = apr * principal  * 30;
        return purchasePrice + simpleInterest + bankFee;
        //You must define at least one protected helper method (function) and test the helper
        //method as part of the homework. totalCost() must call this helper.


        //add some helper functions that could stand alone. replace public with protected
    }
}
