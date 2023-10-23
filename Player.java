public class Player {
    private String name;
    private Account account;
    int balance;

    public Player(String name) {
        this.name = name;
        this.account = new Account(1000);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
    
    public int getBalance() {
        return balance;
    }
}
