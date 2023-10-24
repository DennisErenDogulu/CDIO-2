public class Fields {

    public int getFields(int rollResult) {

        

        switch (rollResult) {
            case 2: 
            System.out.println("You found a treasure box at the top of the Tower! You get 250. Damn you're lucky");
            break;
            case 3: 
            System.out.println("You stumbled in the wrong bar! You have to pay the big boss Crater the 100 you owe");
            break;
            case 4: 
            System.out.println("You made it to the Palace Gates! Your W rizz with the security got you 100!");
            break;
            case 5:
            System.out.println("You fell and dropped a 20 in the Cold Dessert sand. RIP bro");
            break;
            case 6: 
            System.out.println("You won 180 at Walled City Casino! Lets gooo");
            break; 
            case 7:
            System.out.println("You're in a Monestary. Time to take a breather, GOD DID");
            break;
            case 8: 
            System.out.println("You're in the club Black Cave and lost 70 in a bet. DAMN!");
            break;
            case 9: 
            System.out.println("You found 60 old drug money hidden under the mattress in Huts in Mountain!");
            break;
            case 10:
            System.out.println("You lost 80 trying to climb over The Werewall! But hurry the border control is looking away! You're getting another turn");
            break; 
            case 11: 
            System.out.println("You fell in The Pit and lost 50!");
            break;
            case 12:
            System.out.println("You found a Goldmine in the mountains! You got 650, now you have mad bank!");
            break;

            default:
            System.out.println("An error happened. Roll again");

        }
    return rollResult;


    }
}
