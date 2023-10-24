import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Player player1 = new Player("Player 1");
        final Player player2 = new Player("Player 2");
        Dicevalues roll = new Dicevalues();
        FieldEffects fieldEffects = new FieldEffects(); // Instantiate the FieldEffects class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, and welcome to the dice game. If you are ready to play the dice game, then please write 'Yes' in the terminal");

        String answer = scanner.nextLine();
        if (answer.equals("Yes")) {
            while (player1.getBalance() < 3000 && player2.getBalance() < 3000) {
                // Player 1's turn
                System.out.println("________________");
                System.out.println("Player 1's turn");
                playTurn(player1, roll, fieldEffects);

                // Check if player1 has won after their turn
                if (player1.getBalance() >= 3000) {
                    System.out.println("Player 1 ended with: " + player1.getBalance() + " Congratulations! You're rich now");
                    break; // Exit the game
                }

                System.out.println("________________");
                System.out.println("Player 2's turn");
                playTurn(player2, roll, fieldEffects);

                // Check if player2 has won after their turn
                if (player2.getBalance() >= 3000) {
                    System.out.println("Player 2 ended with: " + player2.getBalance() + " Congratulations! You're rich now");
                    break; // Exit the game
                }
            }
        } else {
            System.out.println("I don't understand, you don't want to play the game?");
        }
        scanner.close();
    }

    public static void playTurn(Player player, Dicevalues roll, FieldEffects fieldEffects) {
        roll.rollDice(); // Assuming this method rolls the dice and updates the value
        int rollResult = roll.getValue();

        int amount = fieldEffects.getEffect(rollResult); // Use the FieldEffects class to determine the effect
        player.deposit(amount);
        System.out.println("You have " + player.getBalance());
    }
}
