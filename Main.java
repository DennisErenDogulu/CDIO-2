import java.util.Scanner;
public class Main{
public static void main (String args[]){

Scanner scanner = new Scanner(System.in);
System.out.println("Hello, and welcome to the dice game. If you are ready to play the dicegame then please write Yes in the terminal");

var answar = scanner.nextLine();
if(answar.equals("Yes")){
    System.out.println("Hello ");


}else{
    System.out.println("I don't understand, you don't want to play the game?");
}
scanner.close();
}}