public class FieldEffects {
    
    public static int getEffect(int rollResult) {
        
        switch (rollResult) {
            case 2:
                return 250;
            case 3:
                return -100;
            case 4:
                return 100;
            case 5:
                return -20;
            case 6:
                return 180;
            case 7:
                return 0;
            case 8:
                return -70;
            case 9:
                return 60;
            case 10:
                return -80; 
            case 11:
                return -50;
            case 12:
                return 650;
        }
    }
}

