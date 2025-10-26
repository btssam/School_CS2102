package wpioo.lecture04.answers;

/**
 * This class stores information related to a bank account.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class BankAccount {

    /**
     * Customer's name
     */
    public String customer;

    /**
     * The bank account's balance
     */
    public double balance;

    /**
     * Constructor with one argument where we supply the customer's name
     *
     * @param customerName
     *            Customer name
     */
    public BankAccount(String customerName) {
        // this.customer = customerName;
        // this.balance = 0.0;
        this(customerName, 0.0);
    }

    /**
     * Constructor with two argument where we supply the customer's name and initial balance
     *
     * @param customerName
     *            Customer name
     * @param initialBalance
     *            Bank account's initial balance
     */
    public BankAccount(String customerName, double initialBalance) {
        this.customer = customerName;
        this.balance = initialBalance < 0.0 ? 0.0 : initialBalance;
    }

    /**
     * Returns the bank account balance
     *
     * @return A floating point number representing account's current balance
     */
    public double balance() {
        return this.balance;
    }

    /**
     * Adds money into bank account
     *
     * @param amountToDeposit
     *            An amount to deposit
     */
    public void deposit(double amountToDeposit) {
        if (amountToDeposit < 0.0) {
            this.balance += 0.0; // this.balance = this.balance + 0.0; // +=, -=, *=, /=, %=
        } else {
            this.balance += amountToDeposit; // this.balance = this.balance + amountToDeposit;
        }
    }

    /**
     * Withdraws money from my bank account
     *
     * @param amountToWithdraw
     *            Amount of money to withdraw
     *
     * @return The total amount it was able to withdraw
     */
    public double withdraw(double amountToWithdraw) {
        if (amountToWithdraw < 0.0) {
            return 0.0;
        } else if (balance - amountToWithdraw < 0.0) {
            double withdrawn = balance;
            this.balance = 0.0;
            return withdrawn;
        } else {
            this.balance -= amountToWithdraw;
            return amountToWithdraw;
        }
    }

    /**
     * Transfer from this account to another account
     *
     * @param anotherAccount
     *            Another bank account
     * @param amountToTransfer
     *            Amount to transfer from this account to another account
     *
     * @return The amount that we are able to transfer from this account to another account
     */
    public double transfer(BankAccount anotherAccount, double amountToTransfer) {
        double amountSent = this.withdraw(amountToTransfer);
        anotherAccount.deposit(amountSent);
        return amountSent;
    }
}
