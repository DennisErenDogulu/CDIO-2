public class Account {
    private int balance;

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amount) {
            balance += amount;
            return balance;   
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true; 
        }
        return false; 
    }
}

