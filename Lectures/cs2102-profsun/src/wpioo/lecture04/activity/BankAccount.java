package wpioo.lecture04.activity;

/**
 * This class stores information related to a bank account.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class BankAccount {

    public String customerName;
    public double balance;

    /**
     * make a bankaccount
     * @param name
     * @param balance
     */
    public BankAccount(String name, double balance){
        customerName = name;
//        this.balance = balance;
        if (balance > 0.0){
            this.balance = balance;
        }
        else{
            this.balance = 0.0;
        }

        //Solution 2: this.balance = Math.max(balance, 0.0);

        //Solution 3: this.balance = (balance > 0.0) ? balance: 0.0;

        // 1. this.<>  or this.method()
        // 2. this is the current object
        // 3. this(_,_); //invoking another constructor
    }

    /**
     * bankaccount with just a name, balance defaults to 0
     * @param name
     */
    public BankAccount(String name){
//        this.customerName = name;
//        this.balance = 0.0;
        this(name, 0.0); //This calls the constructor above
    }

    //accessor method (getter)
    public double balance(){
        return balance; //can also write this.balance
    }

    //mutator methods change a field
    public void deposit(double amountToDeposit){
        if (amountToDeposit < 0.00) {
            this.balance = this.balance + 0.0; //this doesnt actually do anything
            //I'd write the conditional backwards and just have the else
        }
        else{
            this.balance += amountToDeposit;
        }
    }

    public double withdraw(double amountToWithdraw){
        //Case 1: Not enough money to withdraw: (could do partial withdrawal)
        // Case 2: Negative
        if (amountToWithdraw < 0.0){
            return 0.0;
        }

        else if (amountToWithdraw > this.balance){ // (balance - amountToWithdraw < 0.0 )
            double withdraw = balance;
            this.balance = 0.0;
            return withdraw;
        }
        // Case 3: Regular withdraw
        else{
            this.balance -= amountToWithdraw;
            return amountToWithdraw;
        }


    }


}

