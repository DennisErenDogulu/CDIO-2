package Main;

import org.junit.Test;
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

        // Test withdraw method
        account.withdraw(7, 300, 0);
        assertEquals(1400, account.getBalance());

        account.withdraw(10, 800, 0); // Trigger the extra roll
        assertEquals(600, account.getBalance());

        account.withdraw(6, 1000, 0);
        assertEquals(0, account.getBalance()); // Balance should not go below 0
    }
}
