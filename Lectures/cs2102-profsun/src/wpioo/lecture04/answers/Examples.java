package wpioo.lecture04.answers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class contains our JUnit test methods.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Examples {

    /**
     * This test case creates a bank account with zero balance
     */
    @Test
    public void testBankAccount1ArgConstructor() {
        BankAccount b = new BankAccount("Gompei the Goat");
        assertEquals(0.0, b.balance(), 0.01);
    }

    /**
     * This test case creates a bank account with some initial balance
     */
    @Test
    public void testBankAccount2ArgConstructor() {
        BankAccount b = new BankAccount("Gompei the Goat", 50.0);
        assertEquals(50.0, b.balance(), 0.01);
    }

    /**
     * This test case creates a bank account with some negative initial balance
     */
    @Test
    public void testBankAccount2ArgConstructorNegative() {
        BankAccount b = new BankAccount("Gompei the Goat", -50.0);
        assertEquals(0.0, b.balance(), 0.01);
    }

    /**
     * This test case deposits money into account
     */
    @Test
    public void testBankAccountDepositPositive() {
        BankAccount b = new BankAccount("Gompei the Goat", 50.0);
        b.deposit(75.0);
        assertEquals(125.0, b.balance(), 0.01);
    }

    /**
     * This test case deposits zero money into account
     */
    @Test
    public void testBankAccountDepositZero() {
        BankAccount b = new BankAccount("Gompei the Goat", 50.0);
        b.deposit(0.0);
        assertEquals(50.0, b.balance(), 0.01);
    }

    /**
     * This test case attempts deposits negative money into account
     */
    @Test
    public void testBankAccountDepositNegative() {
        BankAccount b = new BankAccount("Gompei the Goat", 50.0);
        b.deposit(-5.0);
        assertEquals(50.0, b.balance(), 0.01);
    }

    /**
     * This test case where we successfully withdraw the full amount from the account
     */
    @Test
    public void testBankAccountNormalWithdraw() {
        BankAccount b = new BankAccount("Gompei the Goat", 50.0);
        double amountWithdrawn = b.withdraw(10.0);
        assertEquals(40.0, b.balance(), 0.01);
        assertEquals(10.0, amountWithdrawn, 0.01);
    }

    /**
     * This test case where we partially withdraw some amount from the account
     */
    @Test
    public void testBankAccountOverWithdraw() {
        BankAccount b = new BankAccount("Gompei the Goat", 50.0);
        double amountWithdrawn = b.withdraw(60.0);
        assertEquals(0.0, b.balance(), 0.01);
        assertEquals(50.0, amountWithdrawn, 0.01);
    }

    /**
     * This test case where we attempt to withdraw from a zero balance account
     */
    @Test
    public void testBankAccountZeroBalanceWithdraw() {
        BankAccount b = new BankAccount("Gompei the Goat", 0.0);
        double amountWithdrawn = b.withdraw(60.0);
        assertEquals(0.0, b.balance(), 0.01);
        assertEquals(0.0, amountWithdrawn, 0.01);
    }

    /**
     * This test case where we successfully transfer the full amount from one account to another
     */
    @Test
    public void testBankAccountNormalTransfer() {
        BankAccount b = new BankAccount("Gompei the Goat", 50.0);
        BankAccount l = new BankAccount("The Tiger", 100.0);
        double amountSent = b.transfer(l, 20.0);
        assertEquals(30.0, b.balance(), 0.01);
        assertEquals(120.0, l.balance(), 0.01);
        assertEquals(20.0, amountSent, 0.01);
    }

    /**
     * This test case where we partially transfer some amount from one account to another
     */
    @Test
    public void testBankAccountTransferOverdrawn() {
        BankAccount b = new BankAccount("Gompei the Goat", 50.0);
        BankAccount l = new BankAccount("The Tiger", 100.0);
        double amountSent = b.transfer(l, 75.0);
        assertEquals(0.0, b.balance(), 0.01);
        assertEquals(150.0, l.balance(), 0.01);
        assertEquals(50.0, amountSent, 0.01);
    }
}
