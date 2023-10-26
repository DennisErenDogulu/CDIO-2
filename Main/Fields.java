package Main;

import java.util.ResourceBundle;
import java.util.Locale;

public class Fields {
    private ResourceBundle messages;

    public Fields() {
        // Define message for the field messages
        messages = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        messages = ResourceBundle.getBundle("messages", new Locale("da", "DK"));
    }
//This will print the field text depending on the dice roll result
    public int getFields(int rollResult) {
        switch (rollResult)  {
            case 2: 
                System.out.println(messages.getString("tower"));
                break;
            case 3: 
                System.out.println(messages.getString("crater"));
                break;
            case 4: 
                System.out.println(messages.getString("palaceGates"));
                break;
            case 5:
                System.out.println(messages.getString("coldDessert"));
                break;
            case 6: 
                System.out.println(messages.getString("walledCity"));
                break; 
            case 7:
                System.out.println(messages.getString("monastery"));
                break;
            case 8: 
                System.out.println(messages.getString("blackCave"));
                break;
            case 9: 
                System.out.println(messages.getString("hutsInMountain"));
                break;
            case 10:
                System.out.println(messages.getString("wereWall"));
                break; 
            case 11: 
                System.out.println(messages.getString("thePit"));
                break;
            case 12:
                System.out.println(messages.getString("goldmine"));
                break;
            default:
                System.out.println(messages.getString("defaultMessage"));
                break;
        }
        return rollResult;
    }
}

