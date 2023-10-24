import java.util.Random;
import java.util.Scanner;

public class Main {
    public static class Player {
        private String name;
        private int balance;

        public Player(String name, int initialBalance) {
            this.name = name;
            this.balance = initialBalance;
        }

        public String getName() {
            return name;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int newBalance) {
            balance = newBalance;
        }
    }

    public static class Dicevalues {
        public int rollDice() {
            Random random = new Random();
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int sum = dice1 + dice2;
            return sum;
        }
    }

    public static void playTurn(Player player, Dicevalues roll, Fields fields) {
        int rollResult = roll.rollDice();
        int currentBalance = player.getBalance();
        player.setBalance(currentBalance + rollResult);
        System.out.println(player.getName() + " rolled a " + rollResult);
    
        int specialFieldResult = fields.getFields(rollResult);
    
        // Check if the player landed on "The Werewall" (roll result is 10)
        if (specialFieldResult == 10) {
            int extraRollResult = roll.rollDice();
            player.setBalance(player.getBalance() + extraRollResult);
            System.out.println(player.getName() + " rolled a " + extraRollResult + " in the extra turn.");
            fields.getFields(extraRollResult); // Show the result for the extra turn.
        }
    }
    

    public static void main(String args[]) {
        Player player1 = new Player("Player1", 1000);
        Player player2 = new Player("Player2", 1000);
        Dicevalues roll = new Dicevalues();
        Fields fields = new Fields();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, and welcome to the dice game. If you are ready to play the dice game then please write Yes in the terminal");

        String answer = scanner.nextLine();

        if (answer.equals("Yes")) {
            while (player1.getBalance() < 3000 && player2.getBalance() < 3000) {
                // Player 1's turn
                System.out.println("________________");
                System.out.println("Player 1's turn");
                playTurn(player1, roll, fields);

                // Player 2's turn
                System.out.println("________________");
                System.out.println("Player 2's turn");
                playTurn(player2, roll, fields);
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
}
