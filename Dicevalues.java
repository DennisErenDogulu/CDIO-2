public class Dicevalues {
    public int Dice_1;
    public int Dice_2;
    public int sum;

    public int Dievalue() {
        Dice_1 = new Dice().roll();
        Dice_2 = new Dice().roll();

        return Dice_1 + Dice_2;
    }

    public int rollResult() {
        sum = Dice_1 + Dice_2;
        return sum;
    }

    public int getSum() {
        return sum;
    }

    public String toStringValueOfDies() {
        return "First roll is " + Dice_1 + " Second roll is " + Dice_2;
    }}
