package Main;
public class FieldEffects {
    private int amount;

    public int getEffect(int rollResult) {
        switch (rollResult) {
            case 2:
                amount = 250;
                break;
            case 3:
                amount= -100;
                break;
            case 4:
                amount = 100;
                break;
            case 5:
                amount = -20;
                break;
            case 6:
                amount = 180;
                break;
            case 7:
                amount = 0;
                break;
            case 8:
                amount = -70;
                break;
            case 9:
                amount = 60;
                break;
            case 10:
                amount = -80;
                break;
            case 11:
                amount = -50;
                break;
            case 12:
                amount = 650;
                break;
            default:
                amount = 0; 
                break;
        }
        return amount;
    }
    public int getAmount() {
        return amount;
    }
}


// The case number indicated the dice values. If you wan't to use a different type of die than a six sided you would need to change the value between case & : 
// If the player rolls outside the case values the player gets 0 and the game continues.