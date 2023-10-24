import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1", 1000);
        Player player2 = new Player("Player 2", 1000);
        Dicevalues roll = new Dicevalues();
        FieldEffects fieldEffects = new FieldEffects();
        Fields fields = new Fields();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, and welcome to the dice game. If you are ready to play the dice game, please write Yes in the terminal");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Yes")) {
            while (player1.getBalance() < 3000 && player2.getBalance() < 3000) {
                // Player 1's turn
                System.out.println("________________");
                System.out.println("Player 1's turn");
                playTurn(player1, roll, fields, fieldEffects);

                // Player 2's turn
                System.out.println("________________");
                System.out.println("Player 2's turn");
                playTurn(player2, roll, fields, fieldEffects);
            }

            if (player1.getBalance() >= 3000) {
                System.out.println("Player 1 ended with: " + player1.getBalance() + " Congratulations! You're rich now.");
            }

            if (player2.getBalance() >= 3000) {
                System.out.println("Player 2 ended with: " + player2.getBalance() + " Congratulations! You're rich now.");
            }
        } else {
            System.out.println("I don't understand, you don't want to play the game?");
        }

        scanner.close();
    }

    public static void playTurn(Player player, Dicevalues roll, Fields fields, FieldEffects fieldEffects) {
        int rollResult = roll.rollDice();
        int currentBalance = player.getBalance();
        int effectAmount = fieldEffects.getEffect(rollResult);
        int newBalance = currentBalance + effectAmount;
        player.setBalance(newBalance);
        System.out.println(player.getName() + " rolled a " + rollResult);
        int specialFieldResult = fields.getFields(rollResult);
        System.out.println("The player's new balance is " + player.getBalance());

        // Check if the player landed on "The Werewall" (roll result is 10)
        if (rollResult == 10) {
            int extraRollResult = roll.rollDice();
            int extraEffectAmount = fieldEffects.getEffect(extraRollResult);
            player.setBalance(player.getBalance() + extraEffectAmount);
            System.out.println(player.getName() + " rolled a " + extraRollResult + " in the extra turn.");
            fields.getFields(extraRollResult);
            System.out.println("The player's new balance is " + player.getBalance());
        }
    }
}
