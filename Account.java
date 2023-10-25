public class Account {
    private int balance;
    Dicevalues roll = new Dicevalues();
    FieldEffects fieldEffects = new FieldEffects();

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void updateBalance(int rollResult, int effectAmount, int specialFieldResult) {
        int newBalance = balance + effectAmount;
        if (rollResult == 10) {
            int extraRollResult = roll.rollDice();
            int extraEffectAmount = fieldEffects.getEffect(extraRollResult);
            newBalance += extraEffectAmount;
        }
        balance = newBalance;
    }
}


