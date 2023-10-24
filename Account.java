public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int deposit(int amount) {
            balance += amount;

            if(balance<0) { // Check if balance is negative, in that case set balance to 0.
              balance = 0;
              return balance;
            }
            else // if balance not negative return new balance
            return balance;

            
        }
        

    public int withdraw(int amount) {
        if (amount > balance ) {
            System.out.println("You don't have the facilities for that big man"); // if you don't have the money to buy something.
        }else{
            balance -= amount; // if you do have the money to buy that thing

            }
        return balance;
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
