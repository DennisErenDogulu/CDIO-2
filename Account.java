public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public boolean deposit(int amount) {
        if (amount >= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(int amount) {
        if (amount >= 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String toStringBankrupt(){
        if (balance == 0){
        }
        return "Your balance is 0";
    }

    public int getBalance() {
        return balance;
    }

}
