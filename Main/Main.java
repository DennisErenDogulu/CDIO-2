package Main;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ResourceBundle messages = null; // Initialize messages to work in the scope of the entire main method

        // Initialize players, dice, and game elements
        Player player1 = new Player("Player 1", 1000);
        Player player2 = new Player("Player 2", 1000);
        Dicevalues roll = new Dicevalues();
        Fields fields; // Declare fields, will be initialized based on language choice
        FieldEffects fieldEffects = new FieldEffects();
        Scanner scanner = new Scanner(System.in);

        // Initialize which language the game should be played
        System.out.println("Choose a language:");
        System.out.println("1. English");
        System.out.println("2. Danish");
        System.out.print("Enter 1 for English or 2 for Danish: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            messages = ResourceBundle.getBundle("messages_en_US");
            fields = new Fields(messages);
        } else if (choice == 2) {
            messages = ResourceBundle.getBundle("messages_da_DK");
            fields = new Fields(messages);
        } else {
            System.out.println("Invalid language choice.");
            return;
        }

        // Get the number of sides for the dice
        System.out.println(messages.getString("diceNum"));
        int sides = scanner.nextInt();
        Dice dice = new Dice(sides);

        scanner.nextLine(); // Consume newline

        // Welcome message and game start confirmation
        System.out.println(messages.getString("welcomeMessage"));
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase(messages.getString("answerToLang"))) {
            // This loop will run until there is one player with 3000 points
            while (player1.getAccount().getBalance() <= 3000 && player2.getAccount().getBalance() <= 3000) {
                // Player 1's turn
                System.out.println("______________");
                System.out.println(messages.getString("player1Turn"));
                playTurn(player1, roll, fields, fieldEffects, messages);
                System.out.println(messages.getString("continuePlayer1"));
                scanner.nextLine(); // Wait for Enter

                // Player 2's turn
                System.out.println("______________");
                System.out.println(messages.getString("player2Turn"));
                playTurn(player2, roll, fields, fieldEffects, messages);
                System.out.println(messages.getString("continuePlayer2"));
                scanner.nextLine(); // Wait for Enter
            }

            // Checks if one of the players has 3000 points and prints out a winning message
            if (player1.getAccount().getBalance() >= 3000) {
                System.out.println(messages.getString("playEndPlayer1") + " " + player2.getAccount().getBalance() + " " + messages.getString("congrats"));
            }

            if (player2.getAccount().getBalance() >= 3000) {
                System.out.println(messages.getString("playEndPlayer2") + " " + player2.getAccount().getBalance() + " " + messages.getString("congrats"));
            }
        } else {
            System.out.println(messages.getString("noPlay"));
        }

        scanner.close();
    }

    /* This method plays the turn, which includes rolling the dice,
    check which field the player is on, deposit or withdraw the field effect to the player's balance and prints out the new
    balance of the player */
    public static void playTurn(Player player, Dicevalues roll, Fields fields, FieldEffects fieldEffects, ResourceBundle messages) {
        int rollResult = roll.rollDice();
        int effectAmount = fieldEffects.getEffect(rollResult);
        System.out.println(player.getName() + " " + messages.getString("resultRoll") + " " + rollResult);

        int specialFieldResult = fields.getFields(rollResult);
        player.getAccount().deposit(rollResult, effectAmount, specialFieldResult);
        System.out.println(messages.getString("bankUpdate") + " " + player.getAccount().getBalance());

        // This method plays the extra turn if you roll 10 on the turn, which includes rolling the dice,
        // check which field the player is on, deposit or withdraw the field effect to the player's balance and prints out the new
        // balance of the player
        if (specialFieldResult == 10) {
            int extraRollResult = roll.rollDice();
            System.out.println(player.getName() + " " + messages.getString("resultRoll") + " " + extraRollResult + " " + messages.getString("turnExtra"));
            int extraEffectAmount = fieldEffects.getEffect(extraRollResult);
            fields.getFields(extraRollResult);
            player.getAccount().deposit(extraRollResult, extraEffectAmount, specialFieldResult);
            System.out.println(messages.getString("bankUpdate") + " " + player.getAccount().getBalance());
        }
    }
}
