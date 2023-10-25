import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1", 1000);
        Player player2 = new Player("Player 2", 1000);
        Dicevalues roll = new Dicevalues();
        FieldEffects fieldEffects = new FieldEffects();
        Fields fields = new Fields();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides for the dice: ");
        int sides = scanner.nextInt();
        Dice dice = new Dice(sides);

        scanner.nextLine();
        System.out.println("Hello, and welcome to the dice game. If you are ready to play the dice game, please write Yes in the terminal");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Yes")) {
            while (player1.getAccount().getBalance() < 3000 && player2.getAccount().getBalance() < 3000) {
                // Player 1's turn
                System.out.println("________________");
                System.out.println("Player 1's turn");
                playTurn(player1, roll, fields, fieldEffects);
                System.out.println("Press Enter to continue to player 2's turn");
                scanner.nextLine(); // Wait for Enter

                // Player 2's turn
                System.out.println("________________");
                System.out.println("Player 2's turn");
                playTurn(player2, roll, fields, fieldEffects);
                System.out.println("Press Enter to continue to player 1's turn");
                scanner.nextLine(); // Wait for Enter
            }

            if (player1.getAccount().getBalance() >= 3000) {
                System.out.println("Player 1 ended with: " + player1.getAccount().getBalance() + " Congratulations! You're rich now.");
            }

            if (player2.getAccount().getBalance() >= 3000) {
                System.out.println("Player 2 ended with: " + player2.getAccount().getBalance() + " Congratulations! You're rich now.");
            }
        } else {
            System.out.println("I don't understand, you don't want to play the game?");
        }

        scanner.close();
    }

    public static void playTurn(Player player, Dicevalues roll, Fields fields, FieldEffects fieldEffects) {
        int rollResult = roll.rollDice();
        int effectAmount = fieldEffects.getEffect(rollResult);
        System.out.println(player.getName() + " rolled a " + rollResult);
        
        int specialFieldResult = fields.getFields(rollResult);
        player.getAccount().updateBalance(rollResult, effectAmount, specialFieldResult);
        System.out.println("Your new total in the bank is " + player.getAccount().getBalance());
    }
}