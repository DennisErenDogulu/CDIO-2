public class FieldEffects {
    
    public static int getEffect(int rollResult) {
       public int amount;
        switch (rollResult) {
            case 2:
                amount = 250;
            case 3:
                amount= -100;
            case 4:
                amount = 100;
            case 5:
                amount = -20;
            case 6:
                amount = 180;
            case 7:
                amount = 0;
            case 8:
                amount = -70;
            case 9:
                amount = 60;
            case 10:
                amount = -80; 
            case 11:
                amount = -50;
            case 12:
                amount = 650;
        }
        return rollResult;
    }
}

