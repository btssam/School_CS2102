/**
 * This class has several methods related to calculating costs of a bank loan for a house
 * It uses simple interest rate calculations, rather than compounding rates
 *
 * @author Benjamin Samara
 * @version 1.0
 */
public class HouseCalculator {
    static final double rate = 0.08;
    static final int years = 30;
    static final double bankFee = 2500.0;

    /**
     * A helper method that determines principal
     * @param purchasePrice Initial Price of House
     * @param downPayment Amount of money initially paid for the loan
     * @return the Principal owed
     */
    protected double principal(double purchasePrice,double downPayment){
        return purchasePrice - downPayment;
    }

    /**
     * A helper method that determines simple interest (i.e. not compounding)
     * @param purchasePrice Initial Price of House
     * @param downPayment Amount of money initially paid for the loan
     * @return the simple interest owed
     */
    protected double simpleInterest(double purchasePrice,double downPayment){
        return rate * principal(purchasePrice, downPayment) * years;
    }

    /**
     * Determines total cost of a loan based on purchase price and down payment
     * @param purchasePrice Initial Price of House
     * @param downPayment Amount of money initially paid for the loan
     * @return how much the loan will cost in total, after the set amount of time/rate
     */
    public double totalCost(double purchasePrice,double downPayment){
        return purchasePrice + simpleInterest(purchasePrice, downPayment) + bankFee;
    }
}
