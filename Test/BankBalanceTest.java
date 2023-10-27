package Test;

import org.junit.Test;

import Main.Account;

import static org.junit.Assert.*;

public class BankBalanceTest {


    @Test
    public void testAccountBalance() {
        // Initialize the account with an initial balance of 1000
        Account account = new Account(1000);

        // Test deposit method
        account.deposit(5, 200, 0);
        assertEquals(1200, account.getBalance());

        account.deposit(3, 500, 0);
        assertEquals(1700, account.getBalance());


        account.deposit(6, 1200, 0);
        assertEquals(2900, account.getBalance()); // Deposit test it works
    }


@Test
    public void testAccountBalance2() {
        // Initialize the account with an initial balance of 1000
        Account account = new Account(1000);

        // Test deposit method
        account.withdraw(5, 200, 0);
        assertEquals(800, account.getBalance());

        account.withdraw(3, 50000, 0);
        assertEquals(0, account.getBalance());


        account.withdraw(6, 1200, 0);
        assertEquals(0, account.getBalance()); // Balance should not go below 0
    }
}
