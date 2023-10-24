public class FieldEffects {

    public int getEffect(int rollResult) {
        int amount;
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
                amount = 0; // or any other default value or action
                break;
        }
        return amount;
    }
}
