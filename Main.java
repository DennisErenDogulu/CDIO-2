import java.util.Scanner;
public class Main{

public static void main (String args[]){
    final Player player1 = new Player();
    final Player player2 = new Player();
    Dicevalues roll = new Dicevalues();

Scanner scanner = new Scanner(System.in);
System.out.println("Hello, and welcome to the dice game. If you are ready to play the dicegame then please write Yes in the terminal");

var answar = scanner.nextLine();
if(answar.equals("Yes")){
while(player1.getBalance() < 3000 && player2.getBalance() < 3000) {
    //Player 1's turn
    System.out.println("________________");
    System.out.println("Player 1's turn");
    playTurn(player1, roll);
} if(player1.getBalance() >= 3000){
    System.out.println("Player 1 ended with: " + player1.getBalance() +" Congratulations! You're mad rich now");
    break;
}

    System.out.println("________________");
    System.out.println("Player 2's turn");

playTurn(player2, roll);
if(player2.getBalance() >= 3000){
    System.out.println("Player 2 ended with: " + player2.getBalance() +" Congratulations! You're mad rich now");
    break;
}
}else{
    System.out.println("I don't understand, you don't want to play the game?");
}
scanner.close();

public static void playTurn(Player player , Dicevalues roll){
    roll.Dicevalues();
    System.out.println(toStringValueOfDies());
    
    
if(rollResult() == 10){


}




}}}