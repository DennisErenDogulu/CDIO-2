package Main;

public class Player {
    private String name;
    private Account account;

    public Player(String name, int initialBalance) {
        this.name = name;
        this.account = new Account(initialBalance);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
